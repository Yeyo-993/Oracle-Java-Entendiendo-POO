
public class TestReferencia2 {

	
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "654613165";
		diego.telefono = "99546541651";
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = diego;
		
		System.out.println(cuentaDeDiego.titular.documento);
		System.out.println(cuentaDeDiego.titular);
		System.out.println(diego);
	}
	
}
