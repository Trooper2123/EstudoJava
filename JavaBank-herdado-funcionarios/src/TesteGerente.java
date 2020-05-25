
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("235689-23");
		g1.setSalario(5000.0);

		// teste de atributos herdados
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		// teste de atributo próprio

		g1.setSenha(222);
		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);

		System.out.println(g1.getBonificacao());

		g1.setLogin("Tunder");
		boolean autenticou1 = g1.autentica("Tunder", 222);
		if (autenticou1 == true) {
			System.out.println("Login realizado com sucesso!");
		} else {
			System.out.println("Verifique a senha e o login infornados");

		}
 
	}
}
