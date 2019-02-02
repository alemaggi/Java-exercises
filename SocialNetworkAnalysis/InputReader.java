import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

	private int person;
	private ArrayList<Person> personList = new ArrayList<Person>();
	private String line = null;
	private BufferedReader bf = null;
	
	
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
		String[] tmp2 = line.split(" ");
		person = Integer.parseInt(tmp2[0]);
		
		while ((line = bf.readLine()) != null) {
			String[] tmp = line.split(" ");
			int id = Integer.parseInt(tmp[0]);
			int contact = Integer.parseInt(tmp[1]);
			Person p = new Person(id, contact);
			personList.add(p);
		}
		
		System.out.println(person);
		
		for (Person p: personList) {
			System.out.println(p.getId() + " " + p.getContact());
		}
		
	}
	
	//Getters & Setters
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public ArrayList<Person> getPersonList() {
		return personList;
	}
	
	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}

}
