
public class Game {
	private String word  = "";
	private String individualLetters = "";
	private String guesses = "";
	private String correctGuesses = "";
	private boolean victory = false;
	
	public Game(String w) {
		word = w;
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
	
	
	public int testInput(String letter) {
		//return 0 if bad guess, 1 is used already, 2 is correct guess
      
	  if(usedAlready(letter)) {
		  System.out.println("Letter has been guessed already");
		  return 1;
	  }
	  else {
		  guesses = guesses.concat(letter);
		  if(word.indexOf(letter) >= 0) {
			  //correct guess
			  System.out.println("Correct Guess");
			  correctGuesses = correctGuesses.concat(letter);
			  if(correctGuesses.length() == individualLetters.length()) {
				  victory = true;
			  }
			  return 2;
		  }
		  else {
			  //bad guess
			  System.out.println("Bad Guess");

			  return 0;
		  }
		  
	  }
	  
	}
	
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
