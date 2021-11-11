package dam2c;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFichero {
	public String escribirFichero() {

		FileWriter fichero = null;
		PrintWriter escritor = null;

		try {
			fichero = new FileWriter("archivo.txt");
			escritor = new PrintWriter(fichero);
			escritor.println("Esto es una linea del fichero");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (fichero != null)
				try {
					fichero.close();
				} catch (IOException ioe) {
				}
		}
		return null;
	}
}
