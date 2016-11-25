package sadowski.interfaces;

import sadowski.Level;
import sadowski.LevelCreator;
import sadowski.SimpleMessage;

public interface Logger {
	public void setLevel(Level level);
	void info(Message msg);
	void warning(Message msg);
	void error(Message msg);
	void log(Message msg);
	void addHandler(Handler handler);
}
