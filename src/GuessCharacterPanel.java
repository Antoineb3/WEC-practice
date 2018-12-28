import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GuessCharacterPanel extends JPanel{

	// new guess box (small)
    private JTextField guessTextField = new JTextField("     ");

	// button to submit guess
    private JButton submitGuessButton = new JButton("Submit Guess");
    
    public GuessCharacterPanel() {
    	
    	    guessTextField.setMaximumSize(guessTextField.getPreferredSize());
    	    guessTextField.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(guessTextField);
    	
	    submitGuessButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(submitGuessButton);
		
    }
    
    public void setSubmitGuessButtonListener(ActionListener e) {
    		submitGuessButton.addActionListener(e);
	}
    
    public String getInput(){
    		return guessTextField.getText();
    }
    
    public void clearInputField() {
    		guessTextField.setText("");
    }
}
