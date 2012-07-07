package jp.idios.automaton;

public class Main {

	private State current = State.INITIAL;

	private void start() {
		current = current.accept();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main machine = new Main();
		machine.start();
		System.out.println("State machine is " + machine.current);
	}

}
