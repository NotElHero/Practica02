package dam2c;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TrabajoConProperties {
	String miUsuario;
	String miContrasena;
	String elServidor;
	String elPuerto;

	public Properties leer() {
		Properties configuracion = new Properties();
		configuracion.setProperty("user", miUsuario);
		configuracion.setProperty("password", miContrasena);
		configuracion.setProperty("server", elServidor);
		configuracion.setProperty("port", elPuerto);

		try {
			configuracion.store(new FileOutputStream("configuracion.props"), "Fichero de configuracion");
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return null;
	}

	public Properties carga() {
		String usuario;
		String password;
		String servidor;
		Integer puerto;
		Properties configuration = null;

		Properties configuracion = new Properties();
		try {
			configuracion.load(new FileInputStream("configuracion.props"));
			usuario = configuracion.getProperty("user");
			password = configuracion.getProperty("password");
			servidor = configuracion.getProperty("server");
			puerto = Integer.valueOf(configuration.getProperty("port"));

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return configuration;
	}

	public void mostrar(Properties propiedades) {
		System.out.println(propiedades.toString());
	}

	public void escribir() {
		Properties configuracionEscritura = new Properties();
		String miUsuario;
		/*try{
			configuracionEscritura.store(new FileOutputStream("configuracion.props"), miUsuario);
		}catch{
			
		}*/
	}

}
