
public class ControleBonificacao {
	
	private double soma;
	
	
	//M�todo polimorfico
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		return this.soma;
	}
	
	/*M�todos escritos sem polimorfismo - alto indice de reescrita
	 * public void registra(Gerente g) {
	 
		double bonificacao = g.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	public void registra(EditorVideo ev) {
		double bonificacao = ev.getBonificacao();
		this.soma = this.soma + bonificacao;
	}*/
	
	
}
