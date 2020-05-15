
public class DesafioDosMultiplos {
	// consiste em encontrar e mostrar os multiplos de um determinado númeor até 100
	public static void main(String[] args) {
		for (int i = 3; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(" " + i + " ");
			}
		}
	}
}