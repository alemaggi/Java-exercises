import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputFileReader {

	private String line = null;
	private BufferedReader bf = null;
	
	private int numeroSiti;
	private ArrayList<Integer[]> connessioni = new ArrayList<Integer[]>();
	
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
		
		line = bf.readLine();
		String[] tmp = line.split(" ");
		numeroSiti = Integer.parseInt(tmp[0]);
		
		while ((line = bf.readLine()) != null) {
			String[] arrayTmp = line.split(" ");
			Integer[] connessioniTmp = new Integer[numeroSiti];
			for (int i = 0; i < numeroSiti; i++) {
				connessioniTmp[i] = Integer.parseInt(arrayTmp[i]);
			}
			connessioni.add(connessioniTmp);
		}
	}

	//Setters & getters
	public int getNumeroSiti() {
		return numeroSiti;
	}

	public void setNumeroSiti(int numeroSiti) {
		this.numeroSiti = numeroSiti;
	}

	public ArrayList<Integer[]> getConnessioni() {
		return connessioni;
	}

	public void setConnessioni(ArrayList<Integer[]> connessioni) {
		this.connessioni = connessioni;
	}
	
}
