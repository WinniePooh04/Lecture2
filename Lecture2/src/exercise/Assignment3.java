package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import java.net.URL;

public class Assignment3 {

	public static void main(String[] args) throws IOException {

		fileCopy();

	}

	private static void fileCopy() throws IOException {

		BufferedWriter bw = (new BufferedWriter(new FileWriter(getWriteFilePath().toString())));
		final URL url = new URL("http://php.net/manual/en/intro-whatis.php");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String content;
		while ((content = reader.readLine()) != null) {
			bw.write(content);
			bw.newLine();
		}
		Files.copy(getWriteFilePath(), getCopyFilePath(), StandardCopyOption.REPLACE_EXISTING,
				StandardCopyOption.COPY_ATTRIBUTES);

	}

	private static Path getCopyFilePath() {
		Path path = Paths.get(".\\copiedFile.txt");

		return path.normalize();
	}

	private static Path getWriteFilePath() {
		Path path = Paths.get(".\\webContentFile.txt");

		return path.normalize();
	}

}
