import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader();
		
		SortWords sw = new SortWords();
		
		CheckAnagrams ca = new CheckAnagrams();
		
		ca.findAnagrams(sw.sortWords(in.readInputFile("test.txt")));
	}
}
