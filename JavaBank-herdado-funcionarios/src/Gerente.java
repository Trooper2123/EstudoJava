
public class Gerente extends // é um funcionario (herda atributos)
		Funcionario {

	// private String nome; --atributo herdado
	// private String cpf; --atributo herdado
	// private double salario; --atributo herdado

	private int senha;
	private String login;
	// atributo esclusivo da classe

	// Getter e Setter de atributos foram herdados de Funcionário
	// Métodos, Getter e Setter da classe

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

	// reescrita de método
	public double getBonificacao() {
		// super - indica que o atributo vem de uma classe superior
		// aproveitamneto de método da super dentro de uma filha
		// return super.getBonificacao() + super.salario; funciona ao utilizar protected
		// no atributo salario
		System.out.println("Gerente");
		return super.getSalario();
	}

	// sobrecarga de método
	public boolean autentica(String login, int senha) {
		if (this.autentica(senha) && this.login == login) {
			return true;
		} else {
			return false;
		}
	}

}
