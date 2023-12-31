package proyectoBytebank;

//entidad cuenta
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total=0;
	//public Cuenta(){}
	
	public Cuenta(int agencia) {
		if(agencia<=0) {
			System.out.println("no se permiten 0");
			this.agencia=1;
		}
		else 
		{this.agencia=agencia;}
		total++;
		System.out.println("se han creado "+total+" cuentas");
	}

	
	//no retorna valor
	public void depositar(double valor){
		this.saldo+=valor;
	}
	
	//retorna valoor
	public boolean retirar(double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			return true;
		}
			return false;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo>=valor) {
			this.saldo=this.saldo-valor;
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
        return this.saldo;
    }
	
	public void setAgencia (int agencia) {
		if (agencia>0) {
			this.agencia=agencia;
		}
		else {
			System.out.println("no se permiten numeros negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Cuenta.total;
	}
}
