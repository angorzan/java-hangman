package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadWords {
		
	private List<String> wordsList;
	
	public ReadWords() {
	
		wordsList = new ArrayList<String>();
		wordsList = readFile("src/main/resources/words.txt");	
	}

	public List<String> getWordsList() {
		return wordsList;
	}

	public void setWordsList(List<String> wordsList) {
		this.wordsList = wordsList;
	}

	private static List<String> readFile(String filename) {
		List<String> wordsList = new ArrayList<String>();
		
		File wordsFile = new File(filename);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(wordsFile));
			String contentLine = br.readLine();
			while (contentLine != null) {
				wordsList.add(contentLine);
				contentLine = br.readLine();
			}
		} catch (IOException x) {
			System.err.format("IOException: %s", x); 
		}
		
		return wordsList;
	}
}
