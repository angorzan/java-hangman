package pl.edu.agh.hangman;

public class Checker {

	private boolean existInWord = false;
	
	public Checker() {
		boolean existInWord = false;
		this.existInWord = existInWord;
	}
	
	public boolean isExistInWord() {
		return existInWord;
	}

	public void setExistInWord(boolean existInWord) {
		this.existInWord = existInWord;
	}

	private static boolean checkChar(char c, String word) {
		Checker checker = new Checker();
		boolean status = checker.isExistInWord();

		for (char ch : word.toCharArray()) {
			if (c == ch) {
				System.out.print(c);
				status = true;
			} else {
				System.out.print("_");
			}
			System.out.println();

		}
		return status;
	}
}
