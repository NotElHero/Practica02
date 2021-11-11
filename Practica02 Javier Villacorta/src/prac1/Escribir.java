package prac1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Escribir {
	Scanner sc = new Scanner(System.in);
	public String escribir() {
		FileWriter fichero = null;
		PrintWriter escritor = null;
		try {
			fichero = new FileWriter("archivo.txt");
			escritor = new PrintWriter(fichero);
			escritor.println(sc.next());

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException ioe) {

				}
			}
		}

		return null;
	}

}
