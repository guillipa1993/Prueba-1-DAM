import java.util.Random;
import java.util.Scanner;

public class PoliticoLoco {
	static String merkel = "merkel";
	static String putin = "putin";
	static String rajoy = "rajoy";
	static String mariano = "mariano";
	static String pablo = "pablo";
	static String iglesias = "iglesias";
	static String pedro = "pedro";
	static String sanchez = "sanchez";
	static String rivera = "rivera";
	static String albert = "albert";
	Scanner in = new Scanner(System.in); // Creamos un objeto de la clase
	// Scanner
	static int cont = 0;
	static String respuestas[] = { "Tienes toda la raz�n, y est� totalmente planteado en nuestro proyecto", "Si", "No",
			"Si,si", "Por supuesto", "Debemos revirsarlo", "La culpa es del anterior gobierno",
			"Hemos sido los �nicos en revisarlo", "El anterior gobierno hizo todos esos cambios",
			"Si se vota a otro partido, habr� una recesi�n", "Por supuesto", "De acuerdo", };
	static Random rn = new Random(); // Generador de numeros aleatorios
	static int numeroMinimo = 0; // El n�mero m�nimo en el array es el 0
	static int numeroMaximo = respuestas.length;

	// Esta funci�n devolver� una respuesta aleatoria de nuestro pol�tico loco
	public static String devolverRespuesta() {
		int numeroDentroDelArray = rn.nextInt(numeroMaximo);
		return respuestas[numeroDentroDelArray];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Creamos un objeto de la clase
												// Scanner
		System.out.println("--------------------------------");
		System.out.println("---------- POL�TICO LOCO--------");
		while (true) {
			System.out.print("�Cual es tu pregunta?: ");
			// Pregunta

			String pregunta;
			pregunta = in.nextLine();
			String respuesta = respuestaConcreta(pregunta);
			if (cont == 1) {
				cont--;
				System.out.println(respuesta);

			} else {
				System.out.println(devolverRespuesta());
			}
		}
	}

	public static String respuestaConcreta(String pre) {
		Random rn = new Random();
		int n = rn.nextInt(4);

		if (pre.equals(merkel) == true) {
			switch (n) {
			case 0:
				cont++;
				return "Espa�a no va bien, tienen muchas vacaciones y trabajan muy poco, en pocas palabras 'vagos'";
			case 1:
				cont++;
				return "Conseguir� que Espa�a reduzca el sueldo m�nimo a 250� al mes , because she's is my bitch!";
			case 2:
				cont++;
				return "No pasaba tanta verg�enza desde que fui a un mercadillo vintage y mi padre intent� vender la silla de ruedas de mi abuela como deportivo 'retro'";
			case 3:
				cont++;
				return "Es ir a Espa�a y me siento como si visitase mis pisos alquilados , me siento como un 'ARRENDADOR'";
			}

		} else if (pre.equals(putin) == true) {
			switch (n) {
			case 0:
				cont++;
				return "Perseguiremos a los terroristas por todas partes";
			case 1:
				cont++;
				return "EE.UU. tiene bases por todo el planeta. �Y me dice que nosotros desarrollamos una pol�tica agresiva?";
			case 2:
				cont++;
				return "No queremos tener el mismo tipo de democracia que Irak";
			case 3:
				cont++;
				return "Crimea y Sebastopol regresan a su puerto de origen, a Rusia";
			}

		} else if (pre.equals(rajoy) == true || pre.equals(mariano) == true) {
			switch (n) {
			case 0:
				cont++;
				return "Dije que bajar�a los impuestos y los estoy subiendo";
			case 1:
				cont++;
				return "Un vaso es un vaso y un plato es un plato";
			case 2:
				cont++;
				return "A veces la mejor decisi�n es no tomar ninguna decisi�n, y eso es tambi�n una decisi�n";
			case 3:
				cont++;
				return "Espa�a es un gran pa�s y tiene espa�oles";
			}

		} else if (pre.equals(sanchez) == true || pre.equals(pedro) == true) {
			switch (n) {
			case 0:
				cont++;
				return "Si Podemos dice que ser� exigente nosotros tambi�n vamos a exigir";
			case 1:
				cont++;
				return "Me gusta el sexo, pero no el l�tigo";
			case 2:
				cont++;
				return "�C�mo hubiese sido nuestro partido si Zapatero se hubiese dejado bigote? Las fiestas m�s divertidas seguro";
			case 3:
				cont++;
				return "Si salgo elegido presidente la pr�xima vez que nos visite Merkel le planto un morreo que se le quitan las ganas de recortar";
			}

		} else if (pre.equals(pablo) == true || pre.equals(iglesias) == true) {
			switch (n) {
			case 0:
				cont++;
				return "Echaremos a la casta y despu�s a Marhuenda";
			case 1:
				cont++;
				return "Hola soy Pablo Iglesias y esto es JACKASS";
			case 2:
				cont++;
				return "Soy Jordi Alba con perilla y peluca";
			case 3:
				cont++;
				return "�Mi libro de fantasia favorito? El programa electoral del PP";
			}
		} else if (pre.equals(rivera) == true || pre.equals(albert) == true) {
			switch (n) {
			case 0:
				cont++;
				return "Pablo Iglesias no me cae mejor de lo que me gustar�a";
			case 1:
				cont++;
				return "Ser�a alucinante que el PSOE apoye al PP para que no gobierne Ciudadanos";
			case 2:
				cont++;
				return "Me gustar�a ver otra TV p�blica que hiciera servicio p�blico. La tele p�blica deja mucho que desear. Alguna reformilla tendremos que hacer";
			case 3:
				cont++;
				return "Este es el debate... �Ah no, que est� Rajoy! (al hacerse una foto con los otros candidatos ficticios a La Moncloa)";
			}

		}

		return "   ";

	}
}