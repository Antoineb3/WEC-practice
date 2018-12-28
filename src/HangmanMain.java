
public class HangmanMain {

	public static void main(String [] args) {

		MyFileReader fileReader = new MyFileReader("words.txt");
		String word = fileReader.getRandomWord();
		
		Game game = new Game(word);
		HangmanWindow window = new HangmanWindow(word.length()); 
		HangManController controller = new HangManController(game, window) ;
	}

}
