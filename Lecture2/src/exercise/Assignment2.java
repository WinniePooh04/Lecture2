package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Assignment2 {

	public static void main(String[] args) throws IOException {

		readFileAndWrite();

	}

	private static void readFileAndWrite() throws IOException {

		Path path = getReadFilePath();
		List<String> stringList = Files.readAllLines(path);

		List<String> reversedList = new ArrayList<String>();
		for (int i = stringList.size() - 1; i >= 0; i--) {
			reversedList.add(stringList.get(i));
		}
		Files.write(getWriteFilePath(), reversedList);

	}

	private static Path getReadFilePath() {
		Path path = Paths.get(".\\data.txt");

		return path.normalize();
	}

	private static Path getWriteFilePath() {
		Path path = Paths.get(".\\writeReverseChar.txt");

		return path.normalize();
	}

}
