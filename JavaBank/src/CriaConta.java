
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("primeira conta tem: R$" + primeiraConta.saldo);
		System.out.println("primeira conta agencia: " + primeiraConta.agencia);
		System.out.println("primeira conta numero: " + primeiraConta.numero);
		System.out.println("primeira conta titular: " + primeiraConta.titular);
	}
}
