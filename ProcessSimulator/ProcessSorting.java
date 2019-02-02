import java.util.ArrayList;
import java.util.Stack;

public class ProcessSorting {
	/* I processi sono organizzati come segue: 
	 * -il processo a priorit`a maggiore viene eseguito per 10 quanti, 
	 *	oppure il tempo rimanente se questo `e inferiore a 10 quanti; 
	 *	se vi sono piu` processi con la stessa priorit`a massima, 
	 *	viene privilegiato quello con identificativo minore; 
	 *
	 * -la priorit`a del processo `e diminuita 
	 *	di una unit`a e il processo viene rimesso in coda 
	 */

	private Stack<Process> stack = new Stack<Process>();
	
	//Sorting algorithm for process based on their priority
	public Stack<Process> sortProcess(ArrayList<Process> process) {
		
		//most naive solution like i would do in a real exam
		for (int i = 0; i < process.size(); i++) {
			for (int k = 0; k > process.size() - 1; k++) {
				//if the current element's priority is smaller then that of the next one
				if (process.get(k).getPriority() < process.get(k).getPriority()) {
					//temporary variable
					int tmpId = process.get(k).getId();
					int tmpPriority = process.get(k).getPriority();
					int tmpTime = process.get(k).getTime();
					//swap first process
					process.get(k).setId(process.get(k + 1).getId());
					process.get(k).setPriority(process.get(k + 1).getPriority());
					process.get(k).setTime(process.get(k + 1).getTime());
					//swap second process
					process.get(k + 1).setId(tmpId);
					process.get(k + 1).setPriority(tmpPriority);
					process.get(k + 1).setTime(tmpTime);
				}
				//if the current element's priority is equals to that of the next one
				if ((process.get(k).getPriority() == process.get(k).getPriority()) && (process.get(k).getId() < process.get(k + 1).getId())) {
					//temporary variable
					int tmpId = process.get(k).getId();
					int tmpPriority = process.get(k).getPriority();
					int tmpTime = process.get(k).getTime();
					//swap first process
					process.get(k).setId(process.get(k + 1).getId());
					process.get(k).setPriority(process.get(k + 1).getPriority());
					process.get(k).setTime(process.get(k + 1).getTime());
					//swap second process
					process.get(k + 1).setId(tmpId);
					process.get(k + 1).setPriority(tmpPriority);
					process.get(k + 1).setTime(tmpTime);
				}
			}
		}
		//insert the sorted arrayList in a stack
		for (Process p: process) {
			stack.push(p);
		}
		
		return stack;
	}
}
