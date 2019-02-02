import java.util.ArrayList;

public class SortWords {
	
	private ArrayList<String> arrList = new ArrayList<>();

	public ArrayList<String> sortWords(ArrayList<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int k = 1; k < words.size(); k++) {
				if ((words.get(k - 1).compareTo(words.get(k))) > 0) {
					String tmp = words.get(k - 1);
					words.set(k - 1, words.get(k));
					words.set(k, tmp);
				}
			}
		}

		for (String s: words) {
			arrList.add(s);
		}
		return arrList;
	}
}
