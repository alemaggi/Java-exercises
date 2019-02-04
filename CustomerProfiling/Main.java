import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		InputFileReader in = new InputFileReader();
		in.readInputFile("test.txt");
		
		ArrayList<Integer[]> customer = new ArrayList<Integer[]>(in.getCustomerList());
		ComputeProfiling cp = new ComputeProfiling();
		cp.computCustomerProfiling(in.getCustomerId(), customer);
		
		ArrayList<Integer[]> result = cp.getDissimilarity();
		for (int i = 0; i < result.size(); i++) {
			Integer[] r = result.get(i);
			for (int k = 0; k < r.length; k++) {
				System.out.print(r[k] + " ");
			}
			System.out.println(" ");
		}
	}
}
