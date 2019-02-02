import java.util.*;

public class ExecuteProcess {

	private int quantum = 10;
	
	public void printStatus(Process currentProcess) {
		System.out.println(currentProcess.getId() + " " + currentProcess.getPriority() + " " + currentProcess.getNewPriority() + " " + currentProcess.getTime());;
	}
	
	public void executeProcess(Stack<Process> processStack) {
			
		while (!processStack.isEmpty()) {
			//the process is shorter than the time quantum
			if (processStack.peek().getTime() < 10) {
				processStack.peek().setTime(0);
				printStatus(processStack.peek());
				processStack.pop();
			}
			else {
				processStack.peek().setTime(processStack.peek().getTime() - quantum);
				processStack.peek().setNewPriority(processStack.peek().getNewPriority() - 1);
				processStack.push(processStack.peek());
				printStatus(processStack.peek());
				processStack.pop();
			}
		}
	}
}
