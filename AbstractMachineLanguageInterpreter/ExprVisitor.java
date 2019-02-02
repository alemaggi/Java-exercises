import java.io.IOException;
import java.util.ArrayList;

public class ExprVisitor {
	
	private Operation op = new Operation();
	
	public void readInstruction(ArrayList<String[]> instructionSet) throws IOException {


		for (int i = 0; i < instructionSet.size(); i++){
			String[] tmpString = instructionSet.get(i);
		
			switch(tmpString[0]){
			case "DEF":
				op.defineVar(tmpString[1], Integer.parseInt(tmpString[2]));
				continue;
			case "PUSH":
				if (tmpString[1].matches("-?\\d+(\\.\\d+)?")){
					int valore = Integer.parseInt(tmpString[1]);
					op.pushInteger(valore);
				}
				else {
					op.pushString(tmpString[1]);
				}
				continue;
			case "TOP":
				op.top();
				continue;
			case "POP":
				op.pop();
				continue;
			case "ADD":
				op.add();
				continue;
			case "SUB":
				op.sub();
				continue;
			case "MUL":
				op.mul();
				continue;
			case "DIV":
				op.div();
				continue;
			default:
				continue;
			}
		}
	}
}

