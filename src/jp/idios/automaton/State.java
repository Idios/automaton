package jp.idios.automaton;

/**
 * Every values defines Machine state and transition.
 * 
 * @author Idios
 * 
 */
enum State {

	/**
	 * Initial state
	 */
	INITIAL {
		@Override
		public State run() {
			return RUNNING;
		}

		@Override
		public State accept() {
			return ACCEPTED;
		}
	},

	RUNNING {
		@Override
		public State accept() {
			return ACCEPTED;
		}
	},

	/**
	 * Accepted state
	 */
	ACCEPTED

	;

	/**
	 * To run the machine
	 * 
	 * @return
	 */
	public State run() {
		throw new IllegalStateException();
	}

	/**
	 * To accept the machine.
	 * 
	 * @return {@value #ACCEPTED}
	 */
	public State accept() {
		throw new IllegalStateException();
	}

}
