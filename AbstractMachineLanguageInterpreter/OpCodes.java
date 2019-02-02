
public class OpCodes {

private static final String[] OPCodes = new String[] { "GET" , "SET" , "ADD" , "SUB" , "MUL" , "DIV" , "(" , ")" , ""};
	
	public int identifyToken(String tk) {
		int count = 1;
		for ( String s : OPCodes ) {
			if (s.equals(tk)) 
				return count;
			else
				count++;
		}
		return 0;
	}
}
