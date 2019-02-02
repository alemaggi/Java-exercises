import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputFileReader {

	private int[] firstLine = new int[3];
	private ArrayList<Orario> data = new ArrayList<Orario>();
	private BufferedReader bf = null;
	private String line = null;
	
	
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
		firstLine[0] = Integer.parseInt(tmp[0]);
		firstLine[1] = Integer.parseInt(tmp[1]);
		firstLine[2] = Integer.parseInt(tmp[2]);
		
		while ((line = bf.readLine()) != null) {
			tmp = line.split(" ");
			int docente = Integer.parseInt(tmp[0]);
			int aula = Integer.parseInt(tmp[1]);
			int giorno = Integer.parseInt(tmp[2]);
			int orario = Integer.parseInt(tmp[3]);
			
			//controllo sulla corretteza dei dati inseriti
			if (!controlloCorrettezzaDati(docente, aula, giorno, orario)) {
				System.out.println("Data Error");
				System.exit(1);
			}
			
			Orario Or = new Orario(docente, aula, giorno, orario);
			data.add(Or);
		}
	}
	
	private boolean controlloCorrettezzaDati(int docente, int aula, int giorno, int orario) { 
		if ((docente < 1 || docente > firstLine[0]) || (aula < 1 || aula > firstLine[1]) || (giorno < 1 || giorno > 5)
				|| (orario < 1 || orario > 18)) {
			return false;
		}
		return true;
	}

	//Setter & Getters for fisrtLine and data
	public int[] getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(int[] firstLine) {
		this.firstLine = firstLine;
	}

	public ArrayList<Orario> getData() {
		return data;
	}

	public void setData(ArrayList<Orario> data) {
		this.data = data;
	}
}
