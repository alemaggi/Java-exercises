
public class Process {

	private int id; //deve essere > 0
	private int priority; //deve essere > 0
	private int time; // deve essere > 0
	private int newPriority;
	
	//parametrized constructor
	Process(int id, int priority, int time){
		this.id = id;
		this.priority = priority;
		this.time = time;
		this.newPriority = priority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public int getNewPriority() {
		return time;
	}

	public void setNewPriority(int newPriority) {
		this.newPriority = newPriority;
	}
}
