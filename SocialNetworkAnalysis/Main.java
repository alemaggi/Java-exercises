import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader();
		in.readInputFile("test.txt");
		
		FindConnection fc = new FindConnection();
		ArrayList<Person> firstIteration = new ArrayList<>();
		firstIteration = fc.findFirstConnection(in.getPersonList(), in.getPerson());
		ArrayList<Person> secondIteration = new ArrayList<>();
		secondIteration = fc.findSecondConnection(fc.getFirstConnection(), firstIteration);
		fc.findNoConnection(secondIteration);
		
		System.out.println("Prime connessioni:");
		for (Integer i: fc.getFirstConnection()) {
			System.out.println(i);
		}
		
		System.out.println("Seconde connessioni:");
		for (Integer i: fc.getSecondConnection()) {
			System.out.println(i);
		}
		
		System.out.println("Non connessioni:");
		for (Integer i: fc.getNoConnection()) {
			System.out.println(i);
		}
	}
}
