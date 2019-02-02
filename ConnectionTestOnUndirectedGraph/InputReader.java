import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

	private String line = null;
	private BufferedReader bf = null;
	private ArrayList<Archi> archi = new ArrayList<Archi>();
	private ArrayList<Coppie> coppie = new ArrayList<Coppie>();
	private int numeroVertici;
	
	public void inputFileReader(String filePath) throws IOException {
		FileReader file = null;
		try {
			file = new FileReader(filePath);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
		}
		
		bf = new BufferedReader(file);
		String[] firstLine = bf.readLine().split(" ");
		numeroVertici = Integer.parseInt(firstLine[0]);
		line = bf.readLine();
		while ((line = bf.readLine()) != null) {
			String[] tmpOne = line.split(" ");
			if (tmpOne[0].equals("Q")) {
				break;
			}
			int xI = Integer.parseInt(tmpOne[0]);
			int xJ = Integer.parseInt(tmpOne[1]);
			
			Archi arco = new Archi(xI, xJ);
			archi.add(arco);
		}
		while ((line = bf.readLine()) != null) {
			String[] tmpTwo = line.split(" ");
			int x = Integer.parseInt(tmpTwo[0]);
			int y = Integer.parseInt(tmpTwo[1]);
			
			Coppie coppia = new Coppie(x, y);
			coppie.add(coppia);
		}
	}

	//Getters & Setters
	public ArrayList<Archi> getArchi() {
		return archi;
	}

	public void setArchi(ArrayList<Archi> archi) {
		this.archi = archi;
	}

	public ArrayList<Coppie> getCoppie() {
		return coppie;
	}

	public void setCoppie(ArrayList<Coppie> coppie) {
		this.coppie = coppie;
	}

	public int getNumeroVertici() {
		return numeroVertici;
	}

	public void setNumeroVertici(int numeroVertici) {
		this.numeroVertici = numeroVertici;
	}
}
