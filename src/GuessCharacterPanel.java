import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GuessCharacterPanel extends JPanel{

	// new guess box (small)
	private JTextField guessTextField = new JTextField("");

	// button to submit guess
	private JButton submitGuessButton = new JButton("Submit Guess");

	//label for bad guesses
	private JLabel badGuesses = new JLabel();

	public GuessCharacterPanel() {


		guessTextField.setColumns(3);                 

		guessTextField.setMaximumSize(guessTextField.getPreferredSize());

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		badGuesses.setText(" ");
		badGuesses.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(badGuesses);


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

	public void setGuessString(String guesses) {
		badGuesses.setText(guesses);
	}
}
