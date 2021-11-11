package prac1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ModProps {
	public void modProps() {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		PrintWriter escritor = null;

		try {
			File file = new File(nombre + ".props");
			if (!file.exists()) {
				file.createNewFile();
			}
			escritor = new PrintWriter(file);
			String linea = sc.nextLine();
			escritor.println(linea);

			escritor.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
