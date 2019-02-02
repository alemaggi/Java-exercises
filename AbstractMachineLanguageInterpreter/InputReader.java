import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

	private BufferedReader text = null;
	private String line = null;
	private ArrayList<String[]> instrArray = new ArrayList<String[]>();
	
	public ArrayList<String[]> readFile(String filePath) throws IOException {
		
		FileReader file = null;
		try {
			file = new FileReader(filePath);
		}
		catch (FileNotFoundException e) {
			System.out.println("Input file not found.");
			System.exit(1);
		}
		
		text = new BufferedReader(file);

		while ((line = text.readLine()) != null) {
			String[] tmp = line.split(" ");
			instrArray.add(tmp);
		}

		return instrArray;
	}
}
