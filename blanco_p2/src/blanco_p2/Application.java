package blanco_p2;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		String dataFile = "problem2.txt";
		String outputFile = "unique_words_counts.txt";
		
		DuplicateCounter.count(dataFile);
		DuplicateCounter.write(outputFile);
	}

}
