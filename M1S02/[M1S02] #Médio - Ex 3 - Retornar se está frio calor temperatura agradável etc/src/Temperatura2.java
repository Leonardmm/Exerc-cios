import java.util.Scanner;

public class Temperatura2 {
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	System.out.printf("Informe a temperatura: ");
	int temp = leitor.nextInt();
	if (temp<=18) {
		System.out.println("O clima é frio.");
		}else if (temp >= 19 && temp <= 23) {
		System.out.println("O clima é agradável.");
		}else if (temp >= 24 && temp <=35) {
		System.out.println("O clima é quente.");
		}else
		System.out.println("O clima é muito quente.");
	}
}

