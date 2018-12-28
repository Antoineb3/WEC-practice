import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.handler.HandlerProcessor.RequestOrResponse;

public class HangManController {

	private HangmanWindow window; // view
	//private Game game; // model

	public HangManController(HangmanWindow w) {
		window = w;
	}

	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String input = window.getGuessCharacterPanel().getInput();
			input = input.toLowerCase();
			Character c = input.charAt(0);
			if(validInput(input, c)) {
				//run logic 
				//game.checkLetter(c);
			}
			else {
				JOptionPane.showMessageDialog(null, "Error: Invalid input, please try again", "Error",
						JOptionPane.WARNING_MESSAGE);
			}
			window.getGuessCharacterPanel().clearInputField();
		}
		
		private boolean validInput(String input, Character c) {
			//true if length == 1 and the char is the letter 
			if(input.length()!=1 || !Character.isLetter(c)){
				return false;
			}
			return true;
		}
	}
}
