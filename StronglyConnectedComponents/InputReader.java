import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

	private String line = null;
	private BufferedReader bf = null;
	
	private int numNodes;
	private ArrayList<Archi> connection = new ArrayList<Archi>();
	
	public void readInputFile(String filePath) throws IOException {
		FileReader file = null;
		try {
			file = new FileReader(filePath);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
		}
		bf = new BufferedReader(file);
		line  = bf.readLine();
		String[] tmp = line.split(" ");
		numNodes = Integer.parseInt(tmp[0]);
		
		while ((line = bf.readLine()) != null) {
			tmp = line.split(" ");
			Archi a = new Archi(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]));
			connection.add(a);
		}
	}

	public int getNumNodes() {
		return numNodes;
	}

	public void setNumNodes(int numNodes) {
		this.numNodes = numNodes;
	}

	public ArrayList<Archi> getConnection() {
		return connection;
	}

	public void setConnection(ArrayList<Archi> connection) {
		this.connection = connection;
	}
	
}
