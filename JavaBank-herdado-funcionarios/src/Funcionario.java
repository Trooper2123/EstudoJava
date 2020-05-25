//Base class
// Super class
public abstract class Funcionario {
	//abstract -  define a classe como abstrata, nao permitindo a criacao de objetos somente deste tipo
	// Uma classe abstrata representa um conceito, algo abstrato, e o compilador não permite instanciar 
	//um objeto dessa classe. Para instanciar é preciso criar primeiro uma classe filha não abstrata.
	
	private String nome;
	private String cpf;
	//protected double salario;
	private double salario;
	
	//Construtor
	
	
	
	//Métodos 
	
	// indica metodo abtrato
	public abstract double getBonificacao();
	// public double getBonificacao() {
	//	return this.salario * 0.05;
	//}
	
	
	//Getter e Setter de atributos
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
