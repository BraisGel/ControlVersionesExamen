package src;

public class App {
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("Sistema en modo producción");
=======
		System.out.println("Sistema con módulo de login activado");
>>>>>>> refs/heads/feature-login
			double precioBase = 100;
			double descuento = 10;
			double iva = 21;
			double precioFinal = calcularPrecioFinal(precioBase, descuento, iva);
			mostrarResultado(precioFinal);
	}
	
	public static double calcularPrecioFinal(double precio, double descuento, double iva) {
		double precioConDescuento = precio - (precio * descuento / 100);
		return precioConDescuento + (precioConDescuento * iva / 100);
	}
	
	public static void mostrarResultado(double resultado) {
		System.out.println("El precio final es: " + resultado);
	}
}
