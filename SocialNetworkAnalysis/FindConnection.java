import java.util.ArrayList;

public class FindConnection {

	private ArrayList<Integer> firstConnection = new ArrayList<Integer>();
	private ArrayList<Integer> secondConnection = new ArrayList<Integer>();
	private ArrayList<Integer> noConnection = new ArrayList<Integer>();
	
	
	//Memorizzo le connessioni dirette, le tolgo dall' arrayList e mi faccio restituire l'arrayList
	//senza quegli elementi
	public ArrayList<Person> findFirstConnection(ArrayList<Person> personList, int person) {
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getId() == person) {
				firstConnection.add(personList.get(i).getContact());
				personList.remove(i);
			}
		}
		return personList;
	}
	
	public ArrayList<Person> findSecondConnection(ArrayList<Integer> firstContact, ArrayList<Person> personList){
		for (int i = 0; i < firstContact.size(); i++) {
			int tmpNumber = firstContact.get(i);
			for (int k = 0; k < personList.size(); k++) {
				if (tmpNumber == personList.get(k).getId()) {
					secondConnection.add(personList.get(k).getContact());
					personList.remove(k);
				}
			}
		}
		return personList;
	}
	
	public void findNoConnection(ArrayList<Person> personList) {
		for (Person p: personList) {
			noConnection.add(p.getId());
		}
	}

	public ArrayList<Integer> getFirstConnection() {
		return firstConnection;
	}

	public void setFirstConnection(ArrayList<Integer> firstConnection) {
		this.firstConnection = firstConnection;
	}

	public ArrayList<Integer> getSecondConnection() {
		return secondConnection;
	}

	public void setSecondConnection(ArrayList<Integer> secondConnection) {
		this.secondConnection = secondConnection;
	}

	public ArrayList<Integer> getNoConnection() {
		return noConnection;
	}

	public void setNoConnection(ArrayList<Integer> noConnection) {
		this.noConnection = noConnection;
	}
	
	
}
