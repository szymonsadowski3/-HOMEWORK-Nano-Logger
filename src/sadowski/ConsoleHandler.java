package sadowski;

import sadowski.interfaces.Handler;
import sadowski.interfaces.Message;

/**
 * Handler that prints log message to Console
 * @author Szymon Sadowski
 *
 */
public class ConsoleHandler implements Handler {

	@Override
	public void doHandle(Message msg) {
		System.out.println(msg);
	}

}
