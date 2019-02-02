import java.util.HashMap;
import java.util.Stack;


public class Operation {

	private Stack<Integer> stack = new Stack<Integer>();
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public void defineVar(String varName, int value) {
		//controllo se la variabile è gia stata definita
		if (map.containsKey(varName)) {
			map.replace(varName, value);
		}
		else {
			map.put(varName, value);
		}
	}
	
	public void pushInteger(int value) {
		stack.push(value);
	}

	public void pushString(String value) {
		if (!map.containsKey(value)) {
			System.out.println("Errore, il dato non è stato definito");
			System.exit(1);
		}
		else {
			int valTmp = map.get(value);
			stack.push(valTmp);
		}
	}
	
	public void top() {
		System.out.println(stack.peek());
	}
	
	public void pop() {
		if (stack.isEmpty()) {
			System.out.println("Errore, si sta cercando di limuove un elemento da una stack vuota");
			System.exit(1);
		}
		else {
			System.out.println(stack.peek());
			stack.pop();
		}
	}
	
	public void add() {
		int first = stack.peek();
		stack.pop();
		int second = stack.peek();
		stack.pop();
		stack.push(first + second);
	}
	
	public void sub() {
		int first = stack.peek();
		stack.pop();
		int second = stack.peek();
		stack.pop();
		stack.push(first - second);
	}
	
	public void mul() {
		int first = stack.peek();
		stack.pop();
		int second = stack.peek();
		stack.pop();
		stack.push(first * second);
	}
	
	public void div() {
		int first = stack.peek();
		stack.pop();
		int second = stack.peek();
		stack.pop();
		if (second != 0)
			stack.push(first / second);
		else {
			System.out.println("Attenzione divisione per zero");
			System.exit(1);
		}
	}
}