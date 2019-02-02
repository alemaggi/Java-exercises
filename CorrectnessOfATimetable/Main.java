import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		InputFileReader in = new InputFileReader();
		in.readInputFile("test.txt");
		
		CheckViolation cv = new CheckViolation();
		int c = cv.checkMinimunHours(1, 2, in.getData());
		int b = cv.checkBondTwo(in.getData());
		int a = cv.checkBondOne(in.getData());
		System.out.println("Violazioni vincolo 1: v" + a);
		System.out.println("Violazioni vincolo 2: v" + b);
		System.out.println("Violazioni vincolo 3: v" + c);
	}
}
