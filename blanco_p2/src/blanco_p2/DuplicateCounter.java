package blanco_p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	
	static Map<String, Integer> list = new HashMap<String, Integer>();
	
	public static void count(String dataFile) throws IOException {
		Scanner scnr = new Scanner(new File(dataFile));
		
		while(scnr.hasNext()) {
			String word = scnr.next();
			Integer wordCounter = list.get(word);
			
			if(wordCounter != null) {
				list.put(word,  wordCounter+1);
			}else {
				list.put(word, 1);
			}
		}
		scnr.close();
	}

	public static void write(String outputFile) throws IOException {
		PrintStream output = new PrintStream(outputFile);
		
		output.println(list);
		
		output.close();	
	}
}
