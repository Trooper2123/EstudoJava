
public class TestaCaracteres {
	
	public static void main(String[] args) {
		// char 16 bits -  utilizada para 1 caractere entre ' '
		// trabalha com a convers�o de n�meros para a tabela ACII
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor +1 );
		System.out.println(valor);
		
		//char vazio = ''; - linha n�o compila
		//System.out.println(vazio);
		
		//String = tipo refer�ncia ("").
		String palavra = "um teste do tipo string";
		System.out.println(palavra);
	}

}
