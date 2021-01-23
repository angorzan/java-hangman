package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawWord {
		
	private String selectedWord;
	
	public DrawWord() {
		selectedWord = drawWord();
	}
	private static String drawWord() {
		Random random = new Random();
		
		ReadWords readWords = new ReadWords();
		List<String> wordsList = new ArrayList<String>();
		wordsList = readWords.getWordsList();
		
		int randomNumber = random.nextInt(wordsList.size());
		String randomWord = wordsList.get(randomNumber);
		System.out.print(randomWord);
		return randomWord;
	}
}
