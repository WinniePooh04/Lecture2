package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileExercise {

	public static void main(String args[]) throws IOException {
		// getFileList();
		// getFileExtension();
		// checkFileExist();
		// checkPathName();
		// getLastModifiedTime();
		// getFileSize();
		// readData();
		// readDataAndStore();
		// writeDataAppend();
		readFirstThreeLine();
	}

	private static void getFileList() throws IOException {
		File dir = new File("C://Test_workspace//JavaSEAdvanced//Lecture2");
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		}
	}

	private static void getFileExtension() throws IOException {
		File dir = new File("C://Test_workspace//JavaSEAdvanced//Lecture2");
		File[] files = dir.listFiles(f -> f.getName().endsWith(".txt"));
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		}
	}

	private static void checkFileExist() throws IOException {
		Path path = getReadFilePath();
		if (Files.exists(path))
			System.out.println("exists");
	}

	private static void checkPathName() throws IOException {
		Path path = getReadFilePath();
		if (Files.isDirectory(path)) {
			System.out.println("Directory");
		} else if (Files.isRegularFile(path)) {
			System.out.println("File");
		}
	}

	private static void getLastModifiedTime() throws IOException {
		Path path = getReadFilePath();
		System.out.println(Files.getLastModifiedTime(path));
	}

	private static void getFileSize() throws IOException {
		Path path = getReadFilePath();
		System.out.println(Files.size(path));
	}

	private static void readData() {
		try (BufferedReader br = (new BufferedReader(
				new FileReader("C://Test_workspace//JavaSEAdvanced//Lecture2//data.txt")))) {
			String inValue;
			while ((inValue = br.readLine()) != null) {
				System.out.println(inValue);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readDataAndStore() {
		try (BufferedReader br = (new BufferedReader(
				new FileReader("C://Test_workspace//JavaSEAdvanced//Lecture2//data.txt")))) {
			String inValue;
			String outputText = "";
			while ((inValue = br.readLine()) != null) {
				outputText += inValue;
			}
			System.out.println(outputText);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeDataAppend() {
		try (BufferedWriter bw = (new BufferedWriter(
				new FileWriter("C://Test_workspace//JavaSEAdvanced//Lecture2//fileAppend.txt", true)))) {
			bw.write("This is append text");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFirstThreeLine() {
		try (BufferedReader br = (new BufferedReader(
				new FileReader("C://Test_workspace//JavaSEAdvanced//Lecture2//data.txt")))) {
			String inValue;
			int i = 0;
			while ((inValue = br.readLine()) != null && i < 3) {
				System.out.println(inValue);
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Path getReadFilePath() {
		Path path = Paths.get(".\\data.txt");

		return path.normalize();
	}
}
