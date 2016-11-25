package sadowski;

import java.util.Date;

import sadowski.interfaces.Message;

public class SimpleMessage implements Message {
	private Date date = new Date();
	private String msg;
	private Level level;

	public SimpleMessage(String msg, Level level) {
		super();
		this.msg = msg;
		this.level = level;
	}

	public Date getDate() {
		return date;
	}

	public String getMessage() {
		return msg;
	}

	public Level getLevel() {
		return level;
	}

	@Override
	public String toString() {
		return "[" + date + " : " + msg + "]";
	}
}
