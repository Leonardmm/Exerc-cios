import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	System.out.printf("Informe a temperatura: ");
	int temp = leitor.nextInt();
	if (temp>30) {
		System.out.println("Está calor!");
	}else {
		System.out.println("Está frio!");
	}
	
	}
}
