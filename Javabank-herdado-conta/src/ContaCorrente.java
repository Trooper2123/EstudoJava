
public class ContaCorrente extends Conta {
 
	//herda atibutos e m�todos
	// contrutores sao espec�ficos
	
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	} 
	
	//m�todos
	
	@Override //anotacao sobreescrever
	// saca com aplicacao de taxa
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		double valorAsacar = valor + 0.2;
		return super.saca(valorAsacar);
	}
	 
}
