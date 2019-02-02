import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader();
		in.inputFileReader("test.txt");
		FindPath fp = new FindPath();		
		for (Coppie c: in.getCoppie()) {
			fp.findPath(c.getxI(), c.getxJ(), in.getArchi());
			if (fp.isFlag())
				System.out.println("SI");
			else
				System.out.println("NO");
			fp.setFlag(false);
		}
	}
}
