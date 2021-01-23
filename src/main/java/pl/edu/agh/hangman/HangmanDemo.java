package pl.edu.agh.hangman;

public class HangmanDemo {

	public static void main(String[] args) {

		
		Checker checker = new Checker();
		DrawImage drawImage = new DrawImage();
		DrawWord drawWord = new DrawWord();
		
		
		char test = 'a';
		String word = drawWord.getSelectedWord();
		
		char[] wordArray = new char[word.length()];
		char[] hiddenWord = new char[word.length()];
		
		for (int i = 0; i < word.length(); i++) {
			hiddenWord[i] = '_';
		}
		
		int status = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (wordArray[i] == test) {
				hiddenWord[i] = test;
				status = 1;
			}
		}
				
		System.out.println();
		
		if (status == 0) {
			drawImage.setNumberOfBadTries(drawImage.getNumberOfBadTries() + 1);
		};
		drawImage.drawImage();
		
		System.out.println("=================");
		System.out.println(hiddenWord);

	}

}
