
public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//No retornan valor
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	//Retornar valor
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
}
