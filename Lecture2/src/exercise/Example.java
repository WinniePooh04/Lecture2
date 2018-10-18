package exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		// readOneByte();
		// readOneChar();
		// readByteInArray();
		// readCharInArray();
		// writeBytes();
		// readAndWriteByte();
		// writeChars();
		 readAndWriteChars();
		//doCloseThing();
	}

	private static void readOneByte() {
		try (BufferedInputStream input = new BufferedInputStream(new FileInputStream("C://Test_workspace//JavaSEAdvanced//Lecture2//bytes.txt"))) {
			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;
				System.out.println(byteVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readOneChar() {
		try (BufferedReader reader = new BufferedReader(new FileReader("C://Test_workspace//JavaSEAdvanced//Lecture2//Char.txt"))) {
			int intVal;
			while ((intVal = reader.read()) >= 0) {
				char charVal = (char) intVal;
				System.out.println(charVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readByteInArray() {
		try (BufferedInputStream input = new BufferedInputStream(new FileInputStream("C://Test_workspace//JavaSEAdvanced//Lecture2//Bytes.txt"))) {
			int length;
			byte[] byteBuff = new byte[10];
			while ((length = input.read(byteBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					byte byteVal = byteBuff[i];
					System.out.print(byteVal);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readCharInArray() {
		try (BufferedReader reader = new BufferedReader(new FileReader("C://Test_workspace//JavaSEAdvanced//Lecture2//Char.txt"))) {
			int length;
			char[] charBuff = new char[10];
			while ((length = reader.read(charBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					char charVal = charBuff[i];
					System.out.print(charVal);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeBytes() {
		try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(
				"C://Test_workspace//JavaSEAdvanced//Lecture2//WriteBytes.txt"))) {
			byte byteVal = 100;
			output.write(byteVal);

			byte[] byteBuff = { 0, 63, 127 };
			output.write(byteBuff);
			output.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readAndWriteByte() {

		try (BufferedInputStream input = new BufferedInputStream(new FileInputStream("C://Test_workspace//JavaSEAdvanced//Lecture2//bytes.txt"));
				BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(
						"C://Test_workspace//JavaSEAdvanced//Lecture2//ReadAndWrite.txt"))) {

			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;
				output.write(byteVal);
			}
			output.flush();

			int length;
			byte[] byteBuff = new byte[10];
			while ((length = input.read(byteBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					byte byteVal = byteBuff[i];
					output.write(byteVal);
				}
				output.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeChars() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("C://Test_workspace//JavaSEAdvanced//Lecture2//WriteChars.txt"))) {

			char charVal = 'a';
			writer.write(charVal);

			char[] charBuff = { 'a', 'b', 'c' };
			writer.write(charBuff);

			String stringVal = "Hello World";
			writer.write(stringVal);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readAndWriteChars() {
		try (BufferedReader reader = new BufferedReader(new FileReader("C://Test_workspace//Lecture2//Char.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("C://Test_workspace//JavaSEAdvanced//Lecture2//ReadAndWriteChars.txt"))) {

			int intVal;
			while ((intVal = reader.read()) >= 0) {
				char charVal = (char) intVal;
				writer.write(charVal);
			}

			int length;
			char[] charBuff = new char[10];
			while ((length = reader.read(charBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					char charVal = charBuff[i];
					writer.write(charVal);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void doCloseThing() {

		try (MyAutoCloseable ac = new MyAutoCloseable()) {
			ac.saySomething();
		} catch (IOException e) {
			System.out.print(e.getClass().getSimpleName() + "-" + e.getMessage());

			for (Throwable t : e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
		}
	}
}
