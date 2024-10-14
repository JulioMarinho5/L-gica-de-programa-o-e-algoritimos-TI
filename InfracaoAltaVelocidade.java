package prova;

import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fim, idade, velocidade, velmax, idadeinfrator, sexo, sxm, sxf, sxinfrator;
		velmax = 0;
		idadeinfrator = 0;
		sxm = 0;
		sxf = 0;
		sxinfrator = 0;
		do {
			System.out.println("Insira a idade do infrator");
			idade = scanner.nextInt();
			System.out.println("Insira a velocidade em km/h do carro no momento da infração");
			velocidade = scanner.nextInt();
			System.out.println("Insira o sexo do infrator");
			System.out.println("1) MASCULINO/ 2) FEMININO");
			sexo = scanner.nextInt();
			if (velmax < velocidade) {
				velmax = velocidade;
				idadeinfrator = idade;
				sxinfrator = sexo;
			}
			if (sexo == 1) {
				sxm++;
			} else if (sexo == 2) {
				sxf++;
			}
			System.out.println("Deseja continuar a pesquisa?");
			System.out.println("1) SIM/ 2) NÃO");
			fim = scanner.nextInt();
		} while (fim <= 1);
		if (sxinfrator == 1) {
			System.out.println("A maior velocidade registrada nas infrações foi de " + velmax + "km/h");
			System.out.println("O infrator é homem e tem " + idadeinfrator + " anos");
		} else if (sxinfrator == 2) {
			System.out.println("A maior velocidade registrada nas infrações foi de " + velmax + "km/h");
			System.out.println("O infrator é mulher e tem " + idadeinfrator + " anos");
		}
		if (sxm > sxf) {
			System.out.println("Houveram mais infrações cometidas por homens");
		} else if (sxf > sxm) {
			System.out.println("Houveram mais infrações cometidas por mulheres");
		} else if (sxf == sxm) {
			System.out.println("A quantidade de infrações foi a mesma entre homens e mulheres");
		}

	}
}
