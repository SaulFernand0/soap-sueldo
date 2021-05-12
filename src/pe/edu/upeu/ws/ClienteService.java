package pe.edu.upeu.ws;

public class ClienteService {
	public static void main(String[] args) {
		SueldoImpService suel = new SueldoImpService();
		SueldoDao cliente = suel.getSueldoImpPort();
		System.out.println("Sueldo:");
		System.out.println(cliente.calcularSueldo(40, 20));
	}

}
