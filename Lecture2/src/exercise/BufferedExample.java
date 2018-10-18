package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedExample {

	public static void main(String[] args) {
		String[] data = { "Line 1", "Line 2 2", "Line 3 3 3" };

		//writeData(data);
		readData();
	}

	private static void writeData(String[] data) {
		try (BufferedWriter bw = (new BufferedWriter(
				new FileWriter("C://Test_workspace//JavaSEAdvanced//Lecture2//data.txt")))) {
			for (String d : data) {
				bw.write(d);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
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
}
