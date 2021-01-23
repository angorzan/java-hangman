package pl.edu.agh.hangman;

public class Checker {

	public boolean checkChar(char c, String word) {

		boolean status = false;

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
