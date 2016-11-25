package sadowski.interfaces;

import sadowski.SimpleMessage;

/**
 * Handler interface for handling different types of outputting log messages
 * @author Szymon Sadowski
 *
 */
public interface Handler {
	/**
	 * Handle printing message to appropriate output
	 * @param msg
	 * Message to be output
	 */
	void doHandle(Message msg);
}
