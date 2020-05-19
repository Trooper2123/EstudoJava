
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		// conta está inconsistente em relação as regras
		
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta (1335,2525);
		Conta conta3 = new Conta(125, 2626);
		
		System.out.println("total de contas: " + conta2.getTotal());
		
		
	}
}
