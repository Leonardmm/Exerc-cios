import java.util.Scanner;


public class calculadora {
	public static void main(String[] args) {
		
		
	Scanner leitor = new Scanner(System.in);
	System.out.println("-----------------------------");
	System.out.println("        CALCULADORA");
	System.out.println("-----------------------------");
	System.out.println("\n");
	System.out.printf("Digite o primeiro número: ");
	int a = leitor.nextInt();
	System.out.printf("Digite o segundo número: ");
	int b = leitor.nextInt();
	
	System.out.println("Escolha a operação a ser realizada, digite: \n"
			+ "1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Resto da Divisão");
	int operacao = leitor.nextInt();
	
	switch (operacao) {
	
		case 1:
			System.out.printf("O resultado da soma é: " + (a+b));
			break;
		
		case 2:
			System.out.printf("O resultado da soma é: " + (a-b));
			break;
			
		case 3:
			System.out.printf("O resultado da multiplicação é: " + (a*b));
			break;
		
		case 4:
			System.out.println("O resultado da divisão é: " + (a/b));
			break;
		
		case 5:
			System.out.println("O resultado do resto da divisão é: " + (a%b));
			break;
			
		default:
			System.out.println("Reinicie o programa e escolha uma das opções.");
			
			
	}
	System.out.println("\n\n-----------------------------");
	System.out.println("             FIM");
	System.out.println("-----------------------------");
	}
}	
	
	
	
	
		
	
	


