package sadowski;

import sadowski.interfaces.Handler;
import sadowski.interfaces.Message;

public class ConsoleHandler implements Handler {

	@Override
	public void doHandle(Message msg) {
		System.out.println(msg);
	}

}
