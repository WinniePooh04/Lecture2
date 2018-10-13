package exercise;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		// readOneByte();
		// readOneChar();
		// readByteInArray();
		readCharInArray();
	}

	private static void readOneByte() {
		InputStream input = null;
		try {
			input = new FileInputStream("C://Test_workspace//lecture2//JavaSEBasicPlatform//bytes.txt");
			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;
				System.out.println(byteVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void readOneChar() {
		FileReader reader = null;
		try {
			reader = new FileReader("C://Test_workspace//Lecture2//Char.txt");
			int intVal;
			while ((intVal = reader.read()) >= 0) {
				char charVal = (char) intVal;
				System.out.println(charVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void readByteInArray() {
		InputStream input = null;
		try {
			input = new FileInputStream("C://Test_workspace//Lecture2//Bytes.txt");
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
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void readCharInArray() {
		FileReader reader = null;
		try {
			reader = new FileReader("C://Test_workspace//Lecture2//Char.txt");
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
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
