
public class TestaNovoCarro {
	public static void main(String[] args) {
		// VALORES "FORÇADO"
		//Carro carro = new Carro();
		//carro.setAno(2013);
		//carro.setPreco(35000.0);
		
		//System.out.println(carro.getAno() + " " + carro.getModelo() + " " + carro.getPreco());
		
		//testando constructors
		System.out.println("Carro1");
		Carro carro1 = new Carro(2013, "Gol", 35000.0);
		System.out.println(carro1.getAno() + " " + carro1.getModelo() + " " + carro1.getPreco());
		
		System.out.println("Carro2");
		Carro carro2 = new Carro("Gol", 40000.0);
		System.out.println(carro2.getAno() + " " + carro2.getModelo() + " " + carro2.getPreco());
		
		// teste com valores inválidos
		
		System.out.println("Carro3");
		Carro carro3 = new Carro(1840," Jaguar", -1);
		System.out.println(carro3.getAno() + " " + carro3.getModelo() + " " + carro3.getPreco());
		
		System.out.println("Carro4");
		Carro carro4 = new Carro(2017, null ,30000.0);
		System.out.println(carro4.getAno() + " " + carro4.getModelo() + " " + carro4.getPreco());
		
		//testa 2º constructor
		System.out.println("Carro5");
		Carro carro5 = new Carro(null , -2);
		System.out.println(carro5.getAno() + " " + carro5.getModelo() + " " + carro5.getPreco());
		
	}

}
