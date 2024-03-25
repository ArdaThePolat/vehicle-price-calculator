package FileAccess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileIO {
	
	public static ArrayList<ArrayList<String>> readCsvFile(String filePath) {
		ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			String line;
			while((line = br.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				ArrayList<String> currLine = new ArrayList<String>();
				while(tokenizer.hasMoreTokens()) {
					currLine.add(tokenizer.nextToken());
				}
				lines.add(currLine);
			}
			
			br.close();
			
		} catch(FileNotFoundException e) {
			System.err.format("Given file does not exist: %s", filePath);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return lines;
	}

}
