
public class TesteContas {

	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100.00);
		
		System.out.println(cc.getSaldo()+ " : saldo cc");
		System.out.println(cp.getSaldo()+ " : saldo cp");
		
		cc.transfere(50.0, cp);
		
		System.out.println(cc.getSaldo()+ " : saldo cc");
		System.out.println(cp.getSaldo()+ " : saldo cp");
	}
	
}
