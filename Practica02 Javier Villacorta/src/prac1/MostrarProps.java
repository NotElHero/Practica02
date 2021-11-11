package prac1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MostrarProps {
	public void props() {
		Scanner sc = new Scanner(System.in);
		FileReader fichero = null;
		BufferedReader buffer = null;
		String nombre = sc.next();
		File file = new File(nombre + ".props");
		
		try {
			buffer = new BufferedReader(fichero);
			fichero = new FileReader(file);
			String linea = null;
			while ((linea = buffer.readLine()) != null)
				System.out.println(linea);

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (buffer != null) {
				try {
					buffer.close();
				} catch (IOException ioe) {

				}
			}
		}
	}
}
