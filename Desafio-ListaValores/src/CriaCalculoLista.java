import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CriaCalculoLista {
	
	Scanner scanner = new Scanner(System.in);
	
	public void inAndOut() {
		
		System.out.println("Insira sua sequancia numéria :");
		String strLine = scanner.nextLine();
		System.out.println("insita o separador utilizado: ");
		String separador = scanner.nextLine();
		
		List<Integer> listAux = Arrays.stream(strLine.split(separador)).map(Integer::valueOf)
				.collect(Collectors.toList());

		// Print da Lista
		System.out.println("sua sequencia é : " + listAux);
		System.out.println("total de itens: " + listAux.size());
		
		double media = this.retornaMedia(listAux);
		
		System.out.println(" Deseja prosseguir com númeiros maiores que a média (g) ou menores que a média (s) ?");

		char escolha = this.scanner.nextLine().charAt(0);
		
		double somaFiltro = 0;
		if (escolha == 'g') {
			for (double element : listAux) {
				if (element > media) {
					somaFiltro += element;
				}
			}

		} else if (escolha == 's') {
			for (double element : listAux) {
				if (element < media) {
					somaFiltro += element;
				}
			}
		}

		double resultado = somaFiltro / media;
		scanner.close();
		
		System.out.println("sua Resultado final : " + resultado);
		System.out.println("total de itens no filtro: " + somaFiltro);
		
	}

	public double retornaMedia(List<Integer> listAux) {
		double soma = 0.0;
		for (double num : listAux) {
			soma += num;
		}
		double media = soma / listAux.size();
		System.out.println("soma total dos itens: " + soma);
		System.out.println("a média do array é: " + media);
		return media;
		
	}


}
