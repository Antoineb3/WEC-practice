import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;


public class MyFileReader {
	
	private Vector<String> words;
	
	public MyFileReader(String inputFileName) {
		words = new Vector<>();
		readFile(inputFileName);
	}
	
	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	private void readFile(String inputFileName) {
		//read file, add all words to vector
		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
		    String line;
		    
		    while ((line = br.readLine()) != null) {
		    		if(line.length()>=5) {
		    			//only add words longer than 5 letters
		    			words.addElement(line);
		    		}
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public String getRandomWord() {
		int randNum = getRandomNumberInRange(0, words.size());
		return words.get(randNum);
	}

	/*
	public static void main(String[] args) {
		//test
		MyFileReader fileReader = new MyFileReader("words.txt");
		String word = fileReader.getRandomWord();
		
		System.out.println("the word is: "+word);
	}
	*/

}
