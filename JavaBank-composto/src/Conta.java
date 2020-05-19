
public class Conta {
	/* Atributos de especificação de conta */
	// private - não pode ser modificado por itens fora da classe
	//não pode ser lido e nem alterado a não ser por ele mesmo
	
	private double saldo;
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

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
		 
}

