package pl.edu.agh.hangman;

public class DrawImage {
	
	 private static final String[] HANGMANPICS = new String[]{
	            "  +---+\n" +
	                    "  |   |\n" +
	                    "      |\n" +
	                    "      |\n" +
	                    "      |\n" +
	                    "      |\n" +
	                    "=========",
	            "  +---+\n" +
	                    "  |   |\n" +
	                    "  O   |\n" +
	                    "      |\n" +
	                    "      |\n" +
	                    "      |\n" +
	                    "=========",
	            "  +---+\n" +
	                    "  |   |\n" +
	                    "  O   |\n" +
	                    "  |   |\n" +
	                    "      |\n" +
	                    "      |\n" +
	                    "=========",
	            "  +---+\n" +
	                    "  |   |\n" +
	                    "  O   |\n" +
	                    " /|   |\n" +
	                    "      |\n" +
	                    "      |\n" +
	                    "=========",
	            "  +---+\n" +
	                    "  |   |\n" +
	                    "  O   |\n" +
	                    " /|\\  |\n" +
	                    "      |\n" +
	                    "      |\n" +
	                    "=========",
	            "  +---+\n" +
	                    "  |   |\n" +
	                    "  O   |\n" +
	                    " /|\\  |\n" +
	                    " /    |\n" +
	                    "      |\n" +
	                    "=========",
	            "  +---+\n" +
	                    "  |   |\n" +
	                    "  O   |\n" +
	                    " /|\\  |\n" +
	                    " / \\  |\n" +
	                    "      |\n" +
	                    "========"
	    };

	
	public int getNumberOfBadTries() {
		return numberOfBadTries;
	}

	public void setNumberOfBadTries(int numberOfBadTries) {
		DrawImage.numberOfBadTries = numberOfBadTries;
	}

	private static int numberOfBadTries = 0;
	
	
	public void drawImage(String guessWord) {
		
//		int numberOfHangmanImage = Hangman.HANGMANPICS.length;
	
		if(numberOfBadTries == 1) {
			System.out.print(HANGMANPICS[0]);
		} 
			else if(numberOfBadTries == 2) {
			System.out.print(HANGMANPICS[1]);
		} 
			else if(numberOfBadTries == 3) {
			System.out.print(HANGMANPICS[2]);
		} 
			else if(numberOfBadTries == 4) {
			System.out.print(HANGMANPICS[3]);
		} 
			else if(numberOfBadTries == 5) {
			System.out.print(HANGMANPICS[4]);
		} 
			else if(numberOfBadTries == 6) {
			System.out.print(HANGMANPICS[5]);
		} 
			else if(numberOfBadTries == 7) {
			System.out.print(HANGMANPICS[6]);
		}
		
		
		
	}

}
