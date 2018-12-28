import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
			System.err.println(ex.getMessage());
		}
	}
	
	public void updateHangman() throws LostTheGameException
	{
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
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this);
	}

}
