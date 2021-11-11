package dam2c;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadPropeties {
	String usuario;
	String password;
	String servidor;
	Integer puerto;
	Properties configuration;

	public Properties carga() {
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
}
