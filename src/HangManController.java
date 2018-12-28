import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class HangManController {

	private HangmanWindow window; // view
	//private Game game; // model

	public HangManController(HangmanWindow w) {
		window = w;
		window.getGuessCharacterPanel().setSubmitGuessButtonListener(new ButtonListener());
	}

	
	class ButtonListener implements ActionListener {


		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("listener");
			String input = window.getGuessCharacterPanel().getInput();
			input = input.toLowerCase();
			Character c = input.charAt(0);
			if(validInput(input, c)) {
				//run logic 
				//game.checkLetter(c);
				window.getHangmanPanel().repaint();
				try {
					window.getHangmanPanel().updateHangman();
				} catch (LostTheGameException e) {
					System.out.println("GAME OVER");
					e.printStackTrace();
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Error: Invalid input, please try again", "Error",
						JOptionPane.WARNING_MESSAGE);
			}
			window.getGuessCharacterPanel().clearInputField();
		}
		
		private boolean validInput(String input, Character c) {
			System.out.println("input: " + input);
			//true if length == 1 and the char is the letter 
			if(input.length()!=1 || !Character.isLetter(c)){
				return false;
			}
			return true;
		}
	}
}
