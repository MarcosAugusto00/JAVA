package programa;

import java.text.DecimalFormat;
import java.util.Scanner;
import calculo_bolos.Bolos;

public class Calculo_bolo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00"); 
		Bolos calculo = new Bolos();
		String tela_inicial = """
				--------------------------------------
				
				          Calculo de preços      
				          
				 1 - Bolo de Trigo
				 2 - Bolo de Fuba
				 3 - Bolos com Saborizantes
				 4 - Bolo de Laranja
				 5 - Todos
				 
				 -------------------------------------
				""";
		String tela_lucro = """
				-----------------------------------------------
				
				              Calculo de lucro      
				          
				 1 - Informar valor que esta sendo vendido
				 2 - Informar a porcentagem de lucro desejada
				 
				 ----------------------------------------------
				""";
		System.out.println(tela_inicial);
		System.out.println("Digite a opção desejada:");
		int opcao = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o valor de sua conta de luz");
		double luz = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Digite o valor de sua conta de agua");
		double agua = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Digite a quantidade de bolos feito neste mês");
		int quant_bolo = teclado.nextInt();
		teclado.nextLine();
		double contas = (luz / 2) + agua;
		double valor_t = calculo.bolo_trigo();
		double total_t = contas / quant_bolo + valor_t;
		double valor_f = calculo.bolo_fuba();
		double total_f = contas / quant_bolo + valor_f;
		double valor_s = calculo.bolo_sabor();
		double total_s = contas / quant_bolo + valor_s;
		double valor_l = calculo.bolo_laranja();
		double total_l = contas / quant_bolo + valor_l;
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
		if (opcao == 1) {
			System.out.println("--------------------------------------------------------------- \n");
			System.out.println("      Bolo        |  Custo Igredientes  |     Custo Total        ");					
			System.out.println("                  |                     |");
			System.out.println("  Bolo de Trigo   |       R$" + formatador.format(valor_t) + "        |       R$" + formatador.format(total_t));
			System.out.println("\n---------------------------------------------------------------");
		}
		else if (opcao == 2) {
			System.out.println("--------------------------------------------------------------- \n");
			System.out.println("      Bolo        |  Custo Igredientes  |     Custo Total        ");					
			System.out.println("                  |                     |");
			System.out.println("  Bolo de Fuba   |       R$" + formatador.format(valor_f) + "        |       R$" + formatador.format(total_f));
			System.out.println("\n---------------------------------------------------------------");
		}
		else if (opcao == 3) {
			System.out.println("--------------------------------------------------------------- \n");
			System.out.println("      Bolo        |  Custo Igredientes  |     Custo Total        ");					
			System.out.println("                  |                     |");
			System.out.println("  Bolo de Sabor   |       R$" + formatador.format(valor_s) + "        |       R$" + formatador.format(total_s));
			System.out.println("\n---------------------------------------------------------------");
		}
		else if (opcao == 4) {
			System.out.println("--------------------------------------------------------------- \n");
			System.out.println("      Bolo        |  Custo Igredientes  |     Custo Total        ");					
			System.out.println("                  |                     |");
			System.out.println(" Bolo de Laranja  |       R$" + formatador.format(valor_l) + "        |       R$" + formatador.format(total_l));
			System.out.println("\n---------------------------------------------------------------");
		}
		else if (opcao == 5) {
			System.out.println("--------------------------------------------------------------- \n");
			System.out.println("      Bolo        |  Custo Igredientes  |     Custo Total        ");					
			System.out.println("                  |                     |");
			System.out.println("  Bolo de Trigo   |       R$" + formatador.format(valor_t) + "        |       R$" + formatador.format(total_t));
			System.out.println("  Bolo de Fuba    |       R$" + formatador.format(valor_f) + "        |       R$" + formatador.format(total_f));
			System.out.println("  Bolo de Sabor   |       R$" + formatador.format(valor_s) + "        |       R$" + formatador.format(total_s));
			System.out.println(" Bolo de Laranja  |       R$" + formatador.format(valor_l) + "        |       R$" + formatador.format(total_l));
			System.out.println("");
			System.out.println("---------------------------------------------------------------");
		}
		 
