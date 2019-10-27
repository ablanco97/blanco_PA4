package blanco_p1;
import java.io.FileInputStream;
import java.io.IOException;


public class Application {

	public static void main(String[] args) throws IOException{
		{
			String dataFile = "problem1.txt";
			String outputFile = "unique_words.txt";
			
			DuplicateRemover.remove(dataFile);
			DuplicateRemover.write(outputFile);

		}
	}
}
