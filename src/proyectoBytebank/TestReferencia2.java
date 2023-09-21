package proyectoBytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente karen = new Cliente();
		karen.setNombre("karen");
		karen.setDocumento("1010101010");
		karen.setTelefono("3123027702");
		
		
		Cuenta cuentaDeKaren=new Cuenta(20);
		cuentaDeKaren.setAgencia(1);
		cuentaDeKaren.setTitular(karen);
		
		System.out.println(cuentaDeKaren.getTitular().getDocumento());
		System.out.println(cuentaDeKaren.getTitular().getDocumento());
		
		
	}
}


