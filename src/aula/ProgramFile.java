package aula;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFile {
	public static void main(String[] args) {
		File file = new File("C:\\projeto\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("finally block executed");
		}
	}
}