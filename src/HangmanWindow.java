import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HangmanWindow extends JFrame{

	
	private GuessCharacterPanel guessCharacterPanel;
	private CurrentGuessPanel currentGuessPanel;
	private HangmanPanel hangmanPanel;
	// Hangman diagram
	
	// wrong guesses box
	

	// Layout of the word to guess

    

	//ctor
    public HangmanWindow(int wordLen){ 
    
//		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    	    setPreferredSize(new Dimension(400,500));
    	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    	    setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));

		hangmanPanel = new HangmanPanel();
		currentGuessPanel = new CurrentGuessPanel(wordLen);
		guessCharacterPanel = new GuessCharacterPanel();

		add(hangmanPanel);
		add(currentGuessPanel);
		add(guessCharacterPanel);
		
		pack();
		setLocationRelativeTo(null); // center the JFrame
		setVisible(true);
	
	}
    
    
	public CurrentGuessPanel getCurrentGuessPanel() {
		return currentGuessPanel;
	}

	public HangmanPanel getHangmanPanel() {
		return hangmanPanel;
	}


	   
    public GuessCharacterPanel getGuessCharacterPanel() {
		return guessCharacterPanel;
	}
}
