
public class DesafioFatoriais {
	public static void main(String[] args) {
		int n = 4;
		int f = 0;
		int total = 0;

		System.out.println("Calculo de fatoria para " + n);
		while (f != n) {
			total += n * f;
			f++;
		}
		System.out.println(" = " + total);
	}
}
