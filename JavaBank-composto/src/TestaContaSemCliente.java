
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaLuisa = new Conta();
		System.out.println(contaDaLuisa.getSaldo());
		
		
		System.out.println(contaDaLuisa.titular);
		
		contaDaLuisa.titular = new Cliente();
		System.out.println(contaDaLuisa.titular);
		
		contaDaLuisa.titular.nome = "Luisa";
		System.out.println(contaDaLuisa.titular.nome);
	}
}
