package exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
	
		readFileAndWrite();

	}

	private static void readFileAndWrite() throws IOException {

		try (BufferedWriter bw = (new BufferedWriter(
				new FileWriter("C://Test_workspace//JavaSEAdvanced//Lecture2//writeReverse.txt")))) {
			Path path = getReadFilePath();
			byte[] bytes = Files.readAllBytes(path);
			for (int i = bytes.length - 1; i >= 0; i--) {
				bw.write(bytes[i]);
			}
		}

	}

	private static Path getReadFilePath() {
		Path path = Paths.get(".\\Bytes.txt");

		return path.normalize();
	}

}
