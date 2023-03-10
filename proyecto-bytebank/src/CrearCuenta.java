
public class CrearCuenta {
	
	public static void main(String[] args) {
		//Variable           = Valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(1000);
		
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);
		
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(primeraCuenta.getAgencia());
	}
	
}
