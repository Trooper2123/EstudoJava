
public class TesteFuncionario {
	
	public static void main(String[] args) {
		//Funcionario nico = new Funcionario();
		//classse abstrata
		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("223355656-9");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 300.0; // erro devido private salario
		// ao utilizar protected abilita novamente 
	}
}
