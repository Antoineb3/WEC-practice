import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HangmanWindow extends JFrame{

	
	private GuessCharacterPanel guessCharacterPanel;
	private CurrentGuessPanel currentGuessPanel;
	
	// Hangman diagram
	
	// wrong guesses box
	

	// Layout of the word to guess

    

	//ctor
    public HangmanWindow(int wordLen){ 
    
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setPreferredSize(new Dimension(800,600));
		
		guessCharacterPanel = new GuessCharacterPanel();
		currentGuessPanel = new CurrentGuessPanel(wordLen);

		add(currentGuessPanel);
		add(guessCharacterPanel);
	
	}
    
   
    public GuessCharacterPanel getGuessCharacterPanel() {
		return guessCharacterPanel;
	}
    
    public static void main() {
    		
		
	}
}
