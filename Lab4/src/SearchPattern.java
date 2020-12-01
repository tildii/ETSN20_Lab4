import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SearchPattern {

	public static void main(String[] args) {

		String pattern = args[1];
		String inputFilePath = args[2];

		Scanner sc = new Scanner(inputFilePath);
		while (sc.hasNext()) {
			String nextLine = sc.next();
			if(nextLine.contains(pattern)) {
				System.out.println(nextLine);
			}
		}
		sc.close();

	}

}
