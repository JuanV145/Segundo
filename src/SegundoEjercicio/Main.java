package SegundoEjercicio;

public class Main {

	public static void main(String[] args) {

		int numeroIf = 0;

		if (numeroIf < 0) {

			System.out.println(numeroIf + " es negativo");

		} else if (numeroIf > 0) {

			System.out.println(numeroIf + " es positivo");

		} else {

			System.out.println("numeroIf es 0");

		}

		int numeroWhile = 1;

		while (numeroWhile < 3) {

			numeroWhile++;
			System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);

		}

		int numeroDoWhile = 3;
		do {

			numeroDoWhile++;
			System.out.println("Nuevo valor es: " + numeroDoWhile);

		} while (numeroDoWhile < 3);

		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {

			System.out.println("La variable numeroFor ahora vale: " + numeroFor);

		}

		String estacion = "otoño";
		switch (estacion) {

		case "verano":
			System.out.println("La estación es verano");
			break;

		case "invierno":
			System.out.println("La estación es invierno");
			break;

		case "primavera":
			System.out.println("La estación es primavera");
			break;

		case "otoño":
			System.out.println("La estación es otoño");
			break;

		default:
			System.out.println("No es una estación");
		}
	}
}
