
public class Gerente extends // � um funcionario (herda atributos)
		Funcionario {

	// private String nome; --atributo herdado
	// private String cpf; --atributo herdado
	// private double salario; --atributo herdado

	private int senha;
	private String login;
	// atributo esclusivo da classe

	// Getter e Setter de atributos foram herdados de Funcion�rio
	// M�todos, Getter e Setter da classe

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	// reescrita de m�todo
	public double getBonificacao() {
		// super - indica que o atributo vem de uma classe superior
		// aproveitamneto de m�todo da super dentro de uma filha
		// return super.getBonificacao() + super.salario; funciona ao utilizar protected
		// no atributo salario
		System.out.println("Gerente");
		return super.getSalario();
	}

	// sobrecarga de m�todo
	public boolean autentica(String login, int senha) {
		if (this.autentica(senha) && this.login == login) {
			return true;
		} else {
			return false;
		}
	}

}
