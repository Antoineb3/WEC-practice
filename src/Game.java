
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
	
	public String returnProgressString() {
		String progress = new String();
		for(int i = 0; i < word.length(); i++) {
			boolean found = false;
			char currentLetter = word.charAt(i);
			for(int j = 0; j < correctGuesses.length(); j++) {
				if(currentLetter == correctGuesses.charAt(j)) {
					progress = progress.concat(Character.toString(currentLetter));
					found = true;
					break;
				}
			}
			if(!found) {
				progress = progress.concat(" ");
			}
		}
		return progress;
	}

}
