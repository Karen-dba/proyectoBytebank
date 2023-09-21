package proyectoBytebank;

public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(20);
		Cliente cliente=new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("5234kkk");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
	}

}
