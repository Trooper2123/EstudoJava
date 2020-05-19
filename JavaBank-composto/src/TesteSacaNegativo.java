
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		System.out.println(conta.saca(200));
		//System.out.println(conta.saldo);
		
		// não permitir que este processo ocorra : 
		//conta.saldo -= 101;
		//System.out.println(conta.saldo);
		
		System.out.println(conta.getSaldo());
		
	}
}
