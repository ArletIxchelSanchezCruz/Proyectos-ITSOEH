/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRIMER.java."

import java.io.*;

public class primer {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double contador;
		double media;
		double num;
		double suma;
		suma = 0;
		suma = 0;
		contador = 0;
		media = 0;
		System.out.println("introduzca numeros positivos");
		num = Double.parseDouble(bufEntrada.readLine());
		do {
			if (num>0) {
				contador = contador+1;
				suma = suma+num;
				num = Double.parseDouble(bufEntrada.readLine());
			} else {
				System.out.println("No se aceptan numeros negativos");
			}
		} while (num>=0);
		media = suma/contador;
		System.out.println("La media es: "+media);
	}


}

