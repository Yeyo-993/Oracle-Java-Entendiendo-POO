
public class CrearCuenta {
	
	public static void main(String[] args) {
		//Variable           = Valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		
		System.out.println(segundaCuenta.saldo);
		System.out.println(primeraCuenta.agencia);
	}
	
}