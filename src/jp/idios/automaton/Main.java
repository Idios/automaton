package jp.idios.automaton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	private State current = State.INITIAL;

	private void start() {
		current = current.accept();
	}

	private void start(final String string) {
		ExecutorService service = Executors.newFixedThreadPool(1);
		current = current.run();
		Thread runnable = new Thread() {
			@Override
			public void run() {
				// do something
			}
		};
		service.execute(runnable);
		try {
			runnable.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} finally {
			service.shutdown();
			current = current.accept();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main machine = new Main();
		if (args.length > 0) {
			machine.start(args[0]);
		} else {
			machine.start();
		}
		System.out.println("State machine is " + machine.current);
	}

}
