public class AliquotaIR {

	public static void main(String[] args) {
		double salario = 3751.6;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("aliquota do é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		} else {
			if (salario > 2800.0 && salario <= 3751.0) {
				System.out.println("aliquota do IR é de 15% e pode deduzir R$ 350");
			} else {
				if (salario > 3751.0 && salario <= 4664.0) {
					System.out.println("aliquota do IR é de 22.5% e pode deduzir R$ 636");
				} else {
					System.out.println("Sinto muito, mas não a dados para a sua faixa");
				}
			}

		}
	}
}
