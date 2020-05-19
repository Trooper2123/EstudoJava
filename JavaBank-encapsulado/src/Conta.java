
public class Conta {
	/* Atributos de especificação de conta */
	// private - não pode ser modificado por itens fora da classe
	//não pode ser lido e nem alterado a não ser por ele mesmo
	
	//atributos de instância são zerados a cada nova chamada new
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//atributo estático não zera a cada inicialização
	private static int total; 

	
	
	// Construtor de inicialização
	public Conta(int agencia, int numero) {
		
		// atributo estático como atributo de classe 
		Conta.total ++;
		//System.out.println("tot al de contas:" + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("nova conta na agencia: " + this.agencia + " e conta: "+ this.numero);
	}

	/*
	 * Métodos 
	 * Não existe criar método dentro de outro método
	 * mas pode chamar um método dentro de um método
	 */

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
/*	public boolean transfere (double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;*/
		
		 public boolean transfere (double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false; 
		
	} 
		 public double getSaldo(){
			 return this.saldo;
		 }
		 
		 public int getNumero() {
			 return this.numero;
		 }
		 
		 public void setNumero(int numero) {
			 if(numero <= 0) {
				 System.out.println("valor inválido");
				 }
			 this.numero = numero;
		 }
		 
		 public int getAgencia() {
			 return this.agencia;
		 }
		 
		 public void setAgencia(int agencia) {
			 if(agencia <= 0) {
				 System.out.println("valor inválido");
				 return;
			 }
			 this.agencia = agencia;
		 }

		 public void setTitular(Cliente titular) {
			this.titular = titular;
		} 

		 public Cliente getTitular() {
			return titular;
		}
		 
		 public static int getTotal() {
			return Conta.total;
		 }
}

