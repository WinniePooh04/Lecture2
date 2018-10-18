package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment1 {

	public static void main(String[] args) throws IOException {

		readFileAndWrite();

	}

	private static void readFileAndWrite() throws IOException {

		Path path = getReadFilePath();
		byte[] bytes = Files.readAllBytes(path);

		int i = 0;
		int j = bytes.length - 1;
		byte tmp;
		while (j > i) {
			tmp = bytes[j];
			bytes[j] = bytes[i];
			bytes[i] = tmp;
			j--;
			i++;
		}
		Files.write(getWriteFilePath(), bytes);

	}

	private static Path getReadFilePath() {
		Path path = Paths.get(".\\Bytes.txt");

		return path.normalize();
	}

	private static Path getWriteFilePath() {
		Path path = Paths.get(".\\writeReverse.txt");

		return path.normalize();
	}

}
