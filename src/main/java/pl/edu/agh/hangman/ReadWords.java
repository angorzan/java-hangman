package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWords {
	public static void main(String[] args) throws Exception {
		readFile("src/main/resources/words.txt");
	}

	private static List<String> readFile(String filename) throws Exception {
		List<String> wordsList = new ArrayList<String>();
		
		File wordsFile = new File(filename);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(wordsFile));
			String contentLine = br.readLine();
			while (contentLine != null) {
				System.out.println(contentLine);
				wordsList.add(contentLine);
				contentLine = br.readLine();
			}
		} catch (IOException x) {
			System.err.format("IOException: %s", x); 
		}
		return wordsList;
	}
}
