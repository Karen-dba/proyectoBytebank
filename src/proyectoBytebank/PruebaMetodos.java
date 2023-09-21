package proyectoBytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(20);
		miCuenta.setSaldo(300);
		miCuenta.depositar(200);
		System.out.println(miCuenta.getSaldo());
		 
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		Cuenta cuentaDeMota = new Cuenta(20);
		cuentaDeMota.depositar(1000);
		cuentaDeMota.transferir(400, miCuenta);
		
		System.out.println(cuentaDeMota.getSaldo());
		System.out.println(miCuenta.getSaldo());
		
	}
}
