package proyectoBytebank;

public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(5);
		Cuenta cuenta2 = new Cuenta(2);
		Cuenta cuenta3 = new Cuenta(22);
		//cuenta.setAgencia(-5);
		
		System.out.println(Cuenta.getTotal());
		//System.out.println(cuenta1.getAgencia());
		//System.out.println(cuenta2.getAgencia());
		//System.out.println(cuenta3.getAgencia());
	}
}
