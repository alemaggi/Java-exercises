import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {

		InputReader ir = new InputReader();
		ExprVisitor exp = new ExprVisitor();
		exp.readInstruction(ir.readFile(args[0]));
	}
}
