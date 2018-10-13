package exercise;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {
		// readOneByte();
		// readOneChar();
		//readOneByteInArray();
		readOneCharInArray();
	}

	private static void readOneByte() {
		try {
			InputStream input = new FileInputStream("C://Test_workspace//lecture2//JavaSEBasicPlatform//bytes.txt");
			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;
				System.out.println(byteVal);
			}
		} catch (IOException e) {

		}
	}

	private static void readOneChar() {
		try {
			Reader reader = new FileReader("C://Test_workspace//Lecture2//Char.txt");
			int intVal;
			while ((intVal = reader.read()) >= 0) {
				char charVal = (char) intVal;
				System.out.println(charVal);
			}
		} catch (IOException e) {

		}
	}

	private static void readOneByteInArray() {
		try {
			InputStream input = new FileInputStream("C://Test_workspace//Lecture2//Bytes.txt");
			int length;
			byte[] byteBuff = new byte[10];
			while ((length = input.read(byteBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					byte byteVal = byteBuff[i];
					System.out.print(byteVal);
				}
			}
		} catch (IOException e) {

		}
	}
	
	private static void readOneCharInArray() {
		try {
			Reader reader = new FileReader("C://Test_workspace//Lecture2//Char.txt");
			int length;
			char[] charBuff = new char[10];
			while ((length = reader.read(charBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					char charVal = charBuff[i];
					System.out.print(charVal);
				}
			}
		} catch (IOException e) {

		}
	}
}
