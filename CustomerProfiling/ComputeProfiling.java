import java.util.ArrayList;

public class ComputeProfiling {
	
	private ArrayList<Integer[]> dissimilarity = new ArrayList<Integer[]>(); //[rowNumber, dissimilarity]
	
	public void computCustomerProfiling(int customerId, ArrayList<Integer[]> customerList) {
		int row = customerId - 1;
		Integer[] customerArr = customerList.get(row);
		for (int i = 0; i < customerList.size(); i++) {
			int counter = 0;
			if (i != row) {
				Integer[] tmpArr = customerList.get(i);
				for (int k = 0; k < tmpArr.length; k++) {
					if (tmpArr[k] != customerArr[k]) {
						counter++;
					}
				}
			}
			else {
				continue;
			}
			Integer[] result = new Integer[2];
			result[0] = i + 1;
			result[1] = counter;
			dissimilarity.add(result);
		}
	}

	public ArrayList<Integer[]> getDissimilarity() {
		return dissimilarity;
	}

	public void setDissimilarity(ArrayList<Integer[]> dissimilarity) {
		this.dissimilarity = dissimilarity;
	}
	
	
}
