import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

	private BufferedReader text = null;
	private String line = null;
	private ArrayList<Process> processes = new ArrayList<Process>();
	
	public ArrayList<Process> readFile(String filePath) throws IOException {
		
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
			int id = Integer.parseInt(tmp[0]);
			int priority = Integer.parseInt(tmp[1]);
			int time = Integer.parseInt(tmp[2]);
			Process tmpProcess = new Process(id, priority, time);
			processes.add(tmpProcess);
		}

		return processes;
	}
}
