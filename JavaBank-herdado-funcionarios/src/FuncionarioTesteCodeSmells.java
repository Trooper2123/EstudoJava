
public class FuncionarioTesteCodeSmells {
	
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - Funcionario 1 - Genrente 2 - Diretor
	
	//Construtor
	
	
	
	//M�todos 
	
	// m�todos com muitos ifs e alta complexidade n�o s�o uam boa pr�tica 
	//quanto mais espec�fico e est� tico melhor o c�digo
	public double getBonificacao() {
		if(this.tipo == 0) {
			return this.salario * 0.1;
		} else if (this.tipo == 1) {
			return this.salario;
		}else {
			return this.salario + 1000.0;
		}
		
	}
	
	//Getter e Setter de atributos
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
