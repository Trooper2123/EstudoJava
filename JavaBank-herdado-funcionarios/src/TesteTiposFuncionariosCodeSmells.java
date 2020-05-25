
public class TesteTiposFuncionariosCodeSmells {
	public static void main(String[] args) {
		
		FuncionarioTesteCodeSmells f1 = new FuncionarioTesteCodeSmells();
		f1.setSalario(3000.0);
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
		
		FuncionarioTesteCodeSmells f2 = new FuncionarioTesteCodeSmells();
		f2.setTipo(1);
		f2.setSalario(5000.00);
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());
		
		FuncionarioTesteCodeSmells f3 = new FuncionarioTesteCodeSmells();
		f3.setTipo(2);
		f3.setSalario(5000.00);
		System.out.println(f3.getTipo());
		System.out.println(f3.getBonificacao());
	}

}
