import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuessPanel extends JPanel {

	private Vector<JTextField> letters;
	
	private static final long serialVersionUID = 1321L;

	
	
	public GuessPanel(int length) {
		letters = new Vector<JTextField>(length);
		
		for(int i=0; i<length; i++) {
			letters.set(i, new JTextField(" "));
			letters.get(i).setEditable(false);
			add(letters.get(i));
		}
	}
	
	public void changeWord(String word) {
		for(int i=0; i<letters.size(); i++) {
			letters.get(i).setText(word.substring(i, i+1));
		}
	}



}
