package jp.idios.automaton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StateTest {

	/*
	 * Normal case
	 */

	@Test
	public void acceptImmediately() {
		State state = State.INITIAL;
		state = state.accept();
		assertEquals(State.ACCEPTED, state);
	}

	@Test
	public void acceptViaRunning() {
		State state = State.INITIAL;
		state = state.run();
		assertEquals(State.RUNNING, state);
		state = state.accept();
		assertEquals(State.ACCEPTED, state);
	}

	/*
	 * Error case
	 */

	@Test(expected = IllegalStateException.class)
	public void runRunning() {
		State.RUNNING.run();
	}

	@Test(expected = IllegalStateException.class)
	public void runAccepted() {
		State.ACCEPTED.run();
	}

	@Test(expected = IllegalStateException.class)
	public void acceptAccepted() {
		State.ACCEPTED.accept();
	}

}
