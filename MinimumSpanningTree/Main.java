import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		InputFileReader in = new InputFileReader();
		in.readInputFile("test.txt");
		for (int i = 0; i < in.getConnessioni().size(); i++) {
			Integer[] tmp = in.getConnessioni().get(i);
			for (int k = 0; k < tmp.length; k++) {
				System.out.print(tmp[k] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("---------");
		CheckCost cc = new CheckCost();
		cc.findConnection(in.getConnessioni());
		
		for (int i = 0; i < cc.getConnessioniEff().size(); i++) {
			Integer[] tmp = cc.getConnessioniEff().get(i);
			for (int k = 0; k < tmp.length; k++) {	
				System.out.print(tmp[k] + " ");
			}
			System.out.println(" ");
		}
		
		//Stampa costo totale
		int costo = 0;
		
		for (int i = 0; i < cc.getConnessioniEff().size(); i++) {
			Integer[] tmp = cc.getConnessioniEff().get(i);
			for (int k = 0; k < tmp.length; k++) {
				if (k == 2) {
					costo += tmp[k];
				}
			}
		}
		System.out.println(costo);
	}
}
