import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputFileReader {

	//Attribute for file reading
	private String line = null;
	private BufferedReader bf = null;
	//Attribute for client profiling
	private int customerId;
	private ArrayList<Integer[]> customerList = new ArrayList<Integer[]>();
	
	
	public void readInputFile(String filePath) throws IOException {
		FileReader file = null;
		try {
			file = new FileReader(filePath);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
		}
		
		bf = new BufferedReader(file);
		line = bf.readLine();
		String[] tmp = line.split(" ");
		customerId = Integer.parseInt(tmp[0]);
		
		while ((line = bf.readLine()) != null) {
			String string = line.replace(',', ' ');
			tmp = string.split("  ");
			Integer[] custArr = new Integer[tmp.length];
			for (int i = 0; i < tmp.length; i++) {
				custArr[i] = Integer.parseInt(tmp[i]);
			}
			customerList.add(custArr);
		}
	}

	//Getters & Setters
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public ArrayList<Integer[]> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Integer[]> customerList) {
		this.customerList = customerList;
	}	
}
