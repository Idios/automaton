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
	 * To accept machine.
	 * 
	 * @return {@value #ACCEPTED}
	 */
	public State accept() {
		throw new IllegalStateException();
	}

}
