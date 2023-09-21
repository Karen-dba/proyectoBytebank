package proyectoBytebank;

public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primerCuenta = new Cuenta(20);
		primerCuenta.setSaldo(200);
		System.out.println("Saldo primera cuenta : "+primerCuenta.getSaldo());
		
		Cuenta segundaCuenta=primerCuenta;
		segundaCuenta.setSaldo(100);
		
		System.out.println("Saldo primera cuenta : "+primerCuenta.getSaldo());
		
		System.out.println("Saldo segunda cuenta : "+segundaCuenta.getSaldo());
		
		segundaCuenta.depositar(400);
		System.out.println("Saldo primera cuenta : "+primerCuenta.getSaldo());
		
		System.out.println(primerCuenta);
		System.out.println(segundaCuenta);
	}

}
