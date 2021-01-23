package pl.edu.agh.hangman;

public class HangmanDemo {

	public static void main(String[] args) {

		
		Checker checker = new Checker();
		
		DrawImage drawImage = new DrawImage();
		
		char test = 'a';
		String word = "test";
		
		if (!checker.checkChar(test, word)) {
			drawImage.setNumberOfBadTries(drawImage.getNumberOfBadTries() + 1);
		};
		drawImage.drawImage();
		
		

	}

}
