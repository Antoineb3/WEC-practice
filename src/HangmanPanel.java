import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangmanPanel extends JPanel {

	/**
	 * Default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private BufferedImage image;
	private int imageNumber;
	
	public HangmanPanel() {
		imageNumber = 0;
		try {
			updateHangman();
		}
		catch(LostTheGameException ex)
		{
			 JOptionPane.showMessageDialog(null, ex.getMessage(), "InfoBox: " + "End of Game", JOptionPane.INFORMATION_MESSAGE);
		}		
		setPreferredSize(new Dimension(400, 300));
	}
	
	public void updateHangman() throws LostTheGameException
	{
		System.out.println("updating hangman..");
		try {
			image = ImageIO.read(new File("Level" + imageNumber + ".png"));
		}
		catch(IOException ex)
		{
			System.err.println("Couln't find requested file");
		}
		imageNumber++;
		if(imageNumber > 9)
		{
			throw new LostTheGameException("You Lost!");
		}
		System.out.println("image num = "+imageNumber);
//		Graphics2D g = (Graphics2D) this.getGraphics();
//	    g.drawImage(image, 0, 0, null);
//	    g.dispose();
//		paintComponent(image);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this);
	}

}
