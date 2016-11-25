package sadowski;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class LogFileWriter {
	static void writeLines(String path, String[] lines, boolean append) throws IOException {
		File outputFile = new File(path);
		outputFile.createNewFile();
		FileWriter w = new FileWriter(outputFile, append);

		for (String line : lines) {
			w.write(line);
			w.write(System.lineSeparator());
		}

		w.close();
	}

	static void writeLine(String path, String line, boolean append) throws IOException {
		File outputFile = new File(path);
		outputFile.createNewFile();
		FileWriter w = new FileWriter(outputFile, append);

		w.write(line);
		
		if(!line.isEmpty())
			w.write(System.lineSeparator());

		w.close();
	}
}
