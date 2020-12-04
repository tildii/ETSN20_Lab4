import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SearchPattern {

	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.out.println("You need to provide three input arguments.");
		} else {
			String pattern = args[1].toLowerCase();
			File inputFile = new File(args[2]);

			Scanner sc;
			try {
				sc = new Scanner(inputFile);
				StringBuilder sb = new StringBuilder();
				
				while (sc.hasNextLine()) {
					
					String nextLine = sc.nextLine();
					if (nextLine.toLowerCase().contains(pattern)) {
						sb.append(nextLine);						
					}
				}

				System.out.println(sb.toString().length() == 0 ? "No matches found" : sb.toString()); ;
					
				
				sc.close();
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			}
		}

		

	}

}
