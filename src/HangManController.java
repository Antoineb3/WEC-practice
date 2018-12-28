import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class HangManController {

	
	
	public HangManController() {
		// TODO Auto-generated constructor stub
	}

	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(validInputs()) {
				//run logic 
			}
			else {
				JOptionPane.showMessageDialog(null, "Error: Invalid inputs, please try again", "Error",
						JOptionPane.WARNING_MESSAGE);
				//inputGUI.clearFields();
			}
			
		}
		
		private boolean validInputs() {
			
			return false;
		}
	}
}
