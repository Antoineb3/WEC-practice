import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class HangmanWindow extends JFrame{

	/**
	 * Serial version ID was automatically generated
	 */
	private static final long serialVersionUID = -2162141288814846399L;
	
	private GuessCharacterPanel guessCharacterPanel;
	
	// Hangman diagram
	
	// wrong guesses box
	

	// Layout of the word to guess

    

	//ctor
    public HangmanWindow(){ 
    
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setPreferredSize(new Dimension(800,600));
		
		guessCharacterPanel = new GuessCharacterPanel();
		
	
	}
    
    

    public GuessCharacterPanel getGuessCharacterPanel() {
		return guessCharacterPanel;
	}
}
