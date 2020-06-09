import java.util.Scanner;

public class Split_String {
	
	public void inAndOut() {

	Scanner scanner = new Scanner(System.in);

	System.out.println ("Insira texto para split:");
	String texto = scanner.nextLine();
	System.out.println("Indicador de separação:");
	String separador = scanner.nextLine();
	
	scanner.close();
	
	String[] vect = texto.split(separador);
	
	for (int i=0; i < vect.length; i++) {
		   String tx2 = vect[i];
		   System.out.println(i + ": " + tx2);
	
		}

	}
}
