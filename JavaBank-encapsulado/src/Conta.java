
public class Conta {
	/* Atributos de especifica��o de conta */
	// private - n�o pode ser modificado por itens fora da classe
	//n�o pode ser lido e nem alterado a n�o ser por ele mesmo
	
	//atributos de inst�ncia s�o zerados a cada nova chamada new
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//atributo est�tico n�o zera a cada inicializa��o
	private static int total; 

	
	
	// Construtor de inicializa��o
	public Conta(int agencia, int numero) {
		
		// atributo est�tico como atributo de classe 
		Conta.total ++;
		//System.out.println("tot al de contas:" + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("nova conta na agencia: " + this.agencia + " e conta: "+ this.numero);
	}

	/*
	 * M�todos 
	 * N�o existe criar m�todo dentro de outro m�todo
	 * mas pode chamar um m�todo dentro de um m�todo
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
				 System.out.println("valor inv�lido");
				 }
			 this.numero = numero;
		 }
		 
		 public int getAgencia() {
			 return this.agencia;
		 }
		 
		 public void setAgencia(int agencia) {
			 if(agencia <= 0) {
				 System.out.println("valor inv�lido");
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

