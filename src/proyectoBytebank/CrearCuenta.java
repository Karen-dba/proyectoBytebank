package proyectoBytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		//variable         =valor
		Cuenta primerCuenta= new Cuenta(20);
		primerCuenta.setSaldo(1000);
		System.out.println(primerCuenta.getSaldo());
		
		
		Cuenta segundaCuenta = new Cuenta(20); 
		segundaCuenta.setSaldo(500);
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(primerCuenta.getAgencia());
		
	}
}
