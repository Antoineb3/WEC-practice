import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class HangManController {

	private HangmanWindow window; // view
	
	private Game game; // model

	public HangManController(Game g, HangmanWindow w) {
		window = w;
		window.getGuessCharacterPanel().setSubmitGuessButtonListener(new ButtonListener());
		game = g;
	}

	
	class ButtonListener implements ActionListener {


		@Override
		public void actionPerformed(ActionEvent arg0) {
			String input = window.getGuessCharacterPanel().getInput();
			
			if(validInput(input)) {
				//run logic 
				input = input.toLowerCase();
				int result = game.testInput(input);
				
				
				if(result==0) {
					//bad guess
					try {
						window.getHangmanPanel().updateHangman();
					} catch (LostTheGameException e) {
						System.out.println("GAME OVER");
						e.printStackTrace();
					}
				}
				if(result == 2 ) { // correct guess
					
				}
				else {
					//guess was used already
					//do nothing
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Error: Invalid input, please try again", "Error",
						JOptionPane.WARNING_MESSAGE);
			}
			window.getGuessCharacterPanel().clearInputField();
		}
		
		private boolean validInput(String input) {
			System.out.println("input: " + input);
			//true if length == 1 and the char is the letter 
			if(input.length()!=1 || !Character.isLetter(input.charAt(0))){
				return false;
			}
			return true;
		}
	}
}
