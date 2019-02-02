import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

	private BufferedReader bf = null;
	private String line = null;
	private ArrayList<String> words = new ArrayList<String>();
	
	public ArrayList<String> readInputFile(String filePath) throws IOException {
		
		FileReader file = null;
		try {
			file = new FileReader(filePath);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
		}
		
		bf = new BufferedReader(file);
		
		while ((line = bf.readLine()) != null) {
			 words.add(line);
		}
		
		return words;
	}
}
