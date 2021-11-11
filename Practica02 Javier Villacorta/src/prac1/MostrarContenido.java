package prac1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MostrarContenido {
	public void mostrarContenido() {
		BufferedReader buffer = null;

		try {
			buffer = new BufferedReader(new FileReader(new File("archivo.txt")));
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