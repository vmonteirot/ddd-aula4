import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		System.out.println("Digite sua idade: ");
		String nome = entrada.nextLine();
		String idade = entrada.nextLine();
		int id = Integer.parseInt(idade);
	
		System.out.println("Bem vindo" + nome + idade + "anos");
	}
	
}