import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite um número: ");
			int numero = in.nextInt();
			
		for(int i = 0; i<=10; i++) {
			System.out.println(i+" * "+numero+" = "+i*numero);
		}

	}

}
