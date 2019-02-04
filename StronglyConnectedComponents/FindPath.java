import java.util.ArrayList;

public class FindPath {
	
	private ArrayList<Integer> finalConnection = new ArrayList<Integer>();
	private boolean flag = false;
	
	public ArrayList<Archi> deleteOneWayConnectio(ArrayList<Archi> connection) {
		for (int i = 0; i < connection.size() - 1; i++) {
			boolean flag = false;
			for (int k = 0; k < connection.size(); k++) {
				if ((connection.get(i).getStart() == connection.get(k).getEnd()) && (connection.get(i).getEnd() == connection.get(k).getStart())) {
					flag = true;
				}
			}
			if (!flag) {
				connection.remove(i);
			}
		}
		return connection;
	}
	
	//now that i know which road arent one way road i can just consider one direction of the same road 
	public ArrayList<Archi> deleteRedundancy(ArrayList<Archi> connection) {
		for (int i = 0; i < connection.size() - 1; i++) {
			for (int k = 0; k < connection.size(); k++) {
				if ((connection.get(i).getStart() == connection.get(k).getEnd()) && (connection.get(i).getEnd() == connection.get(k).getStart())) {
					continue;
				}
			}
			connection.remove(i + 1);
		}
		return connection;
	}
	
	public void findConnection(ArrayList<Archi> connection, int startNode) {
		if (!flag) {
			finalConnection.add(startNode);
			flag = true;
		}
		if (flag) {
			for (int i = 0; i < connection.size(); i++) {
				if (startNode == connection.get(i).getStart()) {
					finalConnection.add(connection.get(i).getEnd());
					int start = connection.get(i).getEnd();
					findConnection(connection, start);
				}
			}
		}
	}
	
	public boolean isSubset(Integer arr1[], Integer arr2[], int m, int n) {
		 int i = 0; 
	        int j = 0; 
	        for (i = 0; i < n; i++) 
	        { 
	            for (j = 0; j < m; j++) 
	                if(arr2[i] == arr1[j]) 
	                    break; 
	              
	            /* If the above inner loop was not broken at all then arr2[i] is not present in arr1[] */
	            if (j == m) 
	                return false; 
	        }   
	        /* If we reach here then all  elements of arr2[] are present in arr1[] */
	        return true; 
	}

	public ArrayList<Integer> getFinalConnection() {
		return finalConnection;
	}

	public void setFinalConnection(ArrayList<Integer> finalConnection) {
		this.finalConnection = finalConnection;
	}
	
	public boolean getFlag() {
		return flag;
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}