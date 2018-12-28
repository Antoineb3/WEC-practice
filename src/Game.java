
public class Game {
	private String word  = "";
	private String individualLetters = "";
	private String guesses = "";
	private String correctGuesses = "";
	private boolean victory = false;
	
	public Game() {
		MyFileReader fileReader = new MyFileReader("words.txt");
		word = fileReader.getRandomWord();
		individualLetters = getIndividualLetters(word);
		System.out.println(word);
	};
	
	public boolean usedAlready(String letter) {		
		if(guesses.indexOf(letter) == -1) {
			return false;
		}
		else {
			return true;
		}
	};
	
	public String getGuesses() {
		return guesses;
	}
	
	public String getCorrectGuesses() {
		return correctGuesses;
	}
	
	public String getWord() {
		return word;
	}
	
	public boolean checkVictory() {
		return victory;
	}
	
	
	public void testInput(String letter) {
      
	  if(usedAlready(letter)) {
		  System.out.println("Letter has been guessed already");
	  }
	  else {
		  guesses = guesses.concat(letter);
		  if(word.indexOf(letter) >= 0) {
			  correctGuesses = correctGuesses.concat(letter);
		  }
		  
	  }
	  
	  if(correctGuesses.length() == individualLetters.length()) {
		  victory = true;
	  }
		  
	};
	
	public String getIndividualLetters(String word) {
		String letters = "";
		for(int i = 0; i < word.length(); i++) {
			char currentLetter = word.charAt(i);
			if(letters.indexOf(currentLetter) == -1) {
				letters = letters.concat(Character.toString(currentLetter));
			  }
		}
		return letters;
	}
	
	
}
