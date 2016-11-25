package sadowski.interfaces;

import java.util.Date;

import sadowski.Level;

public interface Message {
	public Date getDate();
	public String getMessage();
	public Level getLevel();
}
