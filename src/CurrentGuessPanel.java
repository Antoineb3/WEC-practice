import java.awt.Component;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CurrentGuessPanel extends JPanel {

	private Vector<JTextField> letters;

	
	public CurrentGuessPanel(int length) {
		letters = new Vector<JTextField>();
		
		for(int i=0; i<length; i++) {
			JTextField field = new JTextField("     ");
			field.setEditable(false);
			field.setMaximumSize(field.getPreferredSize());
    	    field.setAlignmentX(Component.CENTER_ALIGNMENT);
    	    field.setColumns(2);

			letters.add(field); // add to vector
			add(letters.get(i)); //add to JPanel
		}
		
		
	}
	
	public void changeWord(String word) {
		for(int i=0; i<letters.size(); i++) {
			letters.get(i).setText(word.substring(i, i+1));
		}
	}
	
	



}
