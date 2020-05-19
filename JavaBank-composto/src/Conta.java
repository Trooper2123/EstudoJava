
public class Conta {
	/* Atributos de especifica��o de conta */
	// private - n�o pode ser modificado por itens fora da classe
	//n�o pode ser lido e nem alterado a n�o ser por ele mesmo
	
	private double saldo;
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

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
		 
}

