
public class ContaCorrente extends Conta {
 
	//herda atibutos e métodos
	// contrutores sao específicos
	
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	} 
	
	//métodos
	
	@Override //anotacao sobreescrever
	// saca com aplicacao de taxa
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		double valorAsacar = valor + 0.2;
		return super.saca(valorAsacar);
	}
	 
}
