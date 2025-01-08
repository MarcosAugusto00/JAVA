package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.println("Digite a quantidade de linhas de sua matriz");
		int m = teclado.nextInt();
		System.out.println("Digite a quantidade de colunas de sua matriz");
		int n = teclado.nextInt();
		int k = 0;
		int[][] numeros = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				numeros[i][j] = 1 + gerador.nextInt(20);
				System.out.print(numeros[i][j]);
				if (j < n-1) {
					System.out.print("|");
				}
			}
			if (i < m-1) {
				System.out.println();
				System.out.println("---------------------");
		}
		}
		int z = gerador.nextInt(m);
		int y = gerador.nextInt(n);
		int x = numeros[z-1][y-1];
		System.out.println();
		System.out.println("O numero escolhido foi " + x);
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if (numeros[i][j] == x) {
					k = k+1;
					System.out.println("Esta é a " + k + "º ocorrência de " + x + " e: ");
					if ((i - 1) >= 0) {
						System.out.println("O numero a esquerda é " + numeros[i-1][j]);
					}else {
						System.out.println("O numero a esquerda não existe");
					}
					if ((j - 1) >= 0) {
						System.out.println("O numero acima é " + numeros[i][j-1]);
					}else {
						System.out.println("O numero acima não existe");
					}
					if ((i + 1) < m ) {
						System.out.println("O numero abaixo é " + numeros[i+1][j]);
					}else {
						System.out.println("O numero abaixo não existe");
					}
					if ((j + 1) < n) {
						System.out.println("O numero a direita é " + numeros[i][j+1]);
					}else {
						System.out.println("O numero a direita não existe");
					System.out.println("------------------------------------");
					}
				}
			}
		}
		teclado.close();

	}

}
