package prueba;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {

		// List de Abecedario

		String abecedario[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

		String arrayString[] = "<*56Variable560/>@".split("");
		String salida = "";

		for (String arr : arrayString) {
			for (String abc : abecedario) {
				if (arr.equalsIgnoreCase(abc)) {
					System.out.println("true" + arr);
					salida += arr;
				}

			}
		}

		System.out.println(salida);

	}

}
