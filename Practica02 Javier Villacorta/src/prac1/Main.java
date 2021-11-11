package prac1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = -1;

		while (opc != 0) {
			System.out.println("-----------------------------------");
			System.out.println("1. Leer contenido de un archivo");
			System.out.println("2. Escribir en un archivo");
			System.out.println("3. Leer un archivo props");
			System.out.println("4. Modificar un archivo props");
			System.out.println("0. Salir");
			System.out.println("-----------------------------------");
			opc = sc.nextInt();

			switch (opc) {
			case 1:
				MostrarContenido mostrar = new MostrarContenido();
				mostrar.mostrarContenido();
				break;
			case 2:
				Escribir escribir = new Escribir();
				escribir.escribir();
				break;
			case 3:
				MostrarProps props = new MostrarProps();
				props.props();
				break;
			case 4:
				ModProps modProps = new ModProps();
				modProps.modProps();
				break;
			case 0:
				break;
			}

		}

	}
}
