import java.util.ArrayList;
import java.util.Arrays;

public class CheckAnagrams {

	public String sortCahrLexicographic(String s) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		String sorted = new String(charArray);
		return sorted;
	}
	
	public boolean isAnagram(String s1, String s2) {
		return s1.equals(s2);
	}
	
	public void findAnagrams(ArrayList<String> words) {
		//copy of the words to work with sorted char
		ArrayList<String> tmpArrayList = new ArrayList<String>(words);

		for (int i = 0; i < tmpArrayList.size(); i++) {
			//temporary array to store anagrams before printing them
			ArrayList<String> storeAnagrams = new ArrayList<String>();
			String checkedWord = sortCahrLexicographic(tmpArrayList.get(i));
			storeAnagrams.add(words.get(i));
			for (int k = 0; k < tmpArrayList.size(); k++) {
				String secondCheckedWord = sortCahrLexicographic(tmpArrayList.get(k));
				if (isAnagram(checkedWord, secondCheckedWord) && i != k) {
					storeAnagrams.add(words.get(k));
				}
			}
			for (String s: storeAnagrams) {
				System.out.print(s + " ");
			}
			System.out.println(" ");
		}
	}
}
