
public class TestaBanco {
	public static void main(String[] args) {
		Cliente cliente1  = new Cliente();
		cliente1.nome = "Tereza Letícia";
		cliente1.cpf = "22.222.222-22";
		cliente1.profissao = "programadora";
		
		Conta contaDaTereza = new Conta ();
		contaDaTereza.deposita(100);
		
		//associa o cliente1 a contaDaTereza
		contaDaTereza.titular = cliente1;
		System.out.println(contaDaTereza.titular.nome);
	}
}
