package sadowski;

import java.io.IOException;
import java.io.PrintWriter;

import sadowski.interfaces.Handler;
import sadowski.interfaces.Message;

public class FileHandler implements Handler {
	private String outputPath;
	
	private void clearFile() {
		try {
			LogFileWriter.writeLine(outputPath, "", false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public FileHandler(String outputPath) {
		super();
		this.outputPath = outputPath;
		clearFile();
	}

	@Override
	public void doHandle(Message msg) {
		try {
			LogFileWriter.writeLine(outputPath, msg.toString(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
