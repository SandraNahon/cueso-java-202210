package curso.inicio.poo.herencia.maniqui;

public class Supermercado {
	

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Sandra","Nahon","37469Y");
		Cliente cliente2 = new Cliente("Eva","Cazon","36990P");
		Cliente cliente3 = new Cliente("Pol","Hernan","45669S");
		Cliente cliente4 = new Cliente("Bon","Jovi","37549Y");

		cliente1.comprar(100);
		cliente1.comprar(50);
		cliente2.comprar(160);
		cliente3.comprar(40);
		cliente4.comprar(10);
		
		Cliente [] clientes = {cliente1,cliente2,cliente3,cliente4};
		
		for(Cliente cliente : clientes) {
			System.out.println(cliente.getNombre());
		}
		
		Supermercado super1 = new Supermercado();
		super1.importeTotalClientes(clientes);
		
		Math.random();
	}
	// static para declararlo de forma global
	private /* static*/ void importeTotalClientes(Cliente [] clientes) {
		double totalImporte = 0.0;
		for(Cliente cliente : clientes) {
			totalImporte += cliente.getImporteCompra();
		}
		System.out.println("El total de la compra de los clientes es :" + totalImporte);

	}


}
