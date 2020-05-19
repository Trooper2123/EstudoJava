
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 100;
		
		/* para chamar um método :
		 * nomeDaReferencia.nomeDoMetodo()
		 */
		conta1.deposita(50);
		System.out.println(conta1.saldo);
		
		boolean consequiuRetirar = conta1.saca(20);
		System.out.println(conta1.saldo);
		System.out.println(consequiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		if(conta2.transfere(300, conta1)) {
			System.out.println("transf. ok");
		} else {
			System.out.println("não rolou, falta grana");
		};
		
		System.out.println("saldo conta1: " + conta1.saldo);
		System.out.println("saldo conta2: " + conta2.saldo);
	}
}
