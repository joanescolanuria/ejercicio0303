import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File archivo = new File(
				"C:/Users/Joan/OneDrive - IFP Formación Profesional/Documentos/ItAcademy/Tasca1/Ejercicio03-03/src/countries.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);

		HashMap<String, String> paisCapital = new HashMap<>();

		String linea;
		while ((linea = br.readLine()) != null) {
			String[] partes = linea.split(" ");
			String paises = partes[0];
			String capitales = partes[1];

			paisCapital.put(paises, capitales);
		}

		br.close();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese su nombre del usuario: ");
		String nombreUsuario = scanner.nextLine();

		int puntuacion = 0;

		for (int i = 0; i < 10; i++) {
			int randomIndex = new Random().nextInt(paisCapital.size());
			String paisAleatorio = (String) paisCapital.keySet().toArray()[randomIndex];
			String capitalCorrecta = paisCapital.get(paisAleatorio);

			System.out.println("Cual es la capital de " + paisAleatorio + "?");
			String respuestaUsuario = scanner.nextLine();

			if (respuestaUsuario.equalsIgnoreCase(capitalCorrecta)) {
				System.out.println("Sumaste 1 punto.");
				puntuacion++;
			} else {
				System.out.println("Incorrecto");
			}
		}

		System.out.println("Tu puntuacion final es: " + puntuacion);

		// Guardar la puntuación en un archivo
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(
				"C:/Users/Joan/OneDrive - IFP Formación Profesional/Documentos/ItAcademy/Tasca1/Ejercicio03-03/src/clasificiacion.txt",
				true))) {
			writer.write(nombreUsuario + " - " + puntuacion + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
