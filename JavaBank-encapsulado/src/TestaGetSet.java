
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		conta.setAgencia(1335);
		System.out.println(conta.getAgencia());
		
		Cliente tereza = new Cliente();
		// conta.titular = tereza;
		// tereza.nome = "Tereza Let�cia";
		
		tereza.setNome("TerezaLet�cia");
		
		conta.setTitular(tereza);
		System.out.println(conta.getTitular()); // printa "refer�ncia" 
		System.out.println(conta.getTitular().getNome()); // printa nome do titular
		
		conta.getTitular().setProfissao("programadora");
		
		//passo a passo em linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programadora");
		
		//todas as formas tem a mesma refer�ncia
		System.out.println(titularDaConta);
		System.out.println(tereza);
		System.out.println(conta.getTitular());
		
		
	}
}
