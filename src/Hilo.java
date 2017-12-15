
public class Hilo extends Thread {

	// Nombre del hilo
	String palabra;

	Hilo(String palabra) {
		this.palabra = palabra;
	}

	public void run() {
		try {

			// Numero de veces que se muestra el hilo.
			for (int i = 1; i <= 5; i++) {
				System.out.println(this.palabra);
				sleep(500);
			}

		} catch (InterruptedException e) {

			System.out.println("Hilo interrumpido");
		}
	}

}
