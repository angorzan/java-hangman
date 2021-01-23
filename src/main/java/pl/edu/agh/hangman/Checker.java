package pl.edu.agh.hangman;

public class Checker {

	public void checkChar(char c, String word) {
		for (char ch : word.toCharArray()) {
			if (c == ch) {
				System.out.print(c);
			} else {
				System.out.print("_");
			}
			System.out.println();
		}
	}
}
