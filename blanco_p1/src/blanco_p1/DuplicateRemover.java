package blanco_p1;
import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateRemover {
	
	private static HashSet<String> uniqueWords = new HashSet<String>();
	public static int i = 0; 
	
	public static void remove(String dataFile)throws IOException {
		
		Scanner scnr = new Scanner(new File(dataFile));
		
		while(scnr.hasNext()) {
			uniqueWords.add(scnr.next());
		}
	}
	
	public static <uniqueWords> void write(String outputFile) throws IOException{
		
		PrintStream output = new PrintStream(outputFile);
		Iterator<String> list = uniqueWords.iterator();
		
		while(list.hasNext()) {
			output.printf(list.next());
			output.printf("\n");
		}
		
		output.close();	
	}
		
	
}
