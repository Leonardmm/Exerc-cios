import java.util.Scanner;

public class ano {
	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	System.out.println("Em que ano você nasceu?");
	int ano = leitor.nextInt();
	System.out.println("Em que ano estamos?");
	int ano2 = leitor.nextInt();
	
	int aniv = ano2 - ano;
	int naoAniv = ano2 - ano - 1;
	
	System.out.println("Sua idade é " + aniv + " ou " + naoAniv);
			
	
	
}
}
