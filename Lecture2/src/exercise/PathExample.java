package exercise;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

	public static void main(String[] args) {

		creatingAbsolutePath();
		creatingRelativePath();
		oneDotExample();
		twoDotExample();
	}

	private static void creatingAbsolutePath() {
		Path absolutePath = Paths
				.get("C://Test_workspace//JavaSEAdvanced//Lecture2//data.txt");

		print(absolutePath);
	}

	private static void creatingRelativePath() {
		Path relativePath = Paths.get(
				"C://Test_workspace//JavaSEAdvanced//Lecture2",
				"data.txt"); // Paths.get(basePath, relativePath)

		print(relativePath);
	}

	private static void oneDotExample() {
		Path currentDir1 = Paths.get(".");
		print(currentDir1.toAbsolutePath().normalize());

		Path currentDir2 = Paths
				.get("C://Test_workspace//JavaSEAdvanced//.//Lecture2");
		print(currentDir2.toAbsolutePath().normalize());
	}

	private static void twoDotExample() {
		Path currentDir1 = Paths.get("..");
		print(currentDir1.toAbsolutePath().normalize());

		Path currentDir2 = Paths
				.get("C://Test_workspace//JavaSEAdvanced//..//Lecture2");
		print(currentDir2.toAbsolutePath().normalize());
	}
	
	private static void print(Path path) {
		System.out.println(path);
	}
}
