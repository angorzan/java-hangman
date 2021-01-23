package pl.edu.agh.hangman;

public class DrawImage {
	
	public int numberOfGuess;
	public static int numberOfBadTries = 0;
	public static int counter = 0;
	
	public static void drawImage(String guessWord) {
		
		int numberOfHangmanImage = Hangman.HANGMANPICS.length;
	
		if(numberOfBadTries == 1 && numberOfBadTries < numberOfHangmanImage) {
			System.out.print(Hangman.HANGMANPICS[0]);
		} 
			else if(numberOfBadTries == 2 && numberOfBadTries < numberOfHangmanImage) {
			System.out.print(Hangman.HANGMANPICS[1]);
		} 
			else if(numberOfBadTries == 3 && numberOfBadTries < numberOfHangmanImage) {
			System.out.print(Hangman.HANGMANPICS[2]);
		} 
			else if(numberOfBadTries == 4 && numberOfBadTries < numberOfHangmanImage) {
			System.out.print(Hangman.HANGMANPICS[3]);
		} 
			else if(numberOfBadTries == 5 && numberOfBadTries < numberOfHangmanImage) {
			System.out.print(Hangman.HANGMANPICS[4]);
		} 
			else if(numberOfBadTries == 6 && numberOfBadTries < numberOfHangmanImage) {
			System.out.print(Hangman.HANGMANPICS[5]);
		} 
			else if(numberOfBadTries == 7 && numberOfBadTries < numberOfHangmanImage) {
			System.out.print(Hangman.HANGMANPICS[6]);
		}
		
		
		
	}

}
