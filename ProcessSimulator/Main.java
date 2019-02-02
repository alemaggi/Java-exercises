import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		InputReader in = new InputReader();
		ProcessSorting ps = new ProcessSorting();
		ExecuteProcess ep = new ExecuteProcess();
		ep.executeProcess(ps.sortProcess(in.readFile("test.txt")));
	}
}
