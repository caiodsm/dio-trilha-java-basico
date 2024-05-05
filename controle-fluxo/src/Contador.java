import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			
			if (parametroDois > parametroUm){
				System.out.println("Contando os números");
				contar(parametroUm, parametroDois);
			} else 
				throw  new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo número");
				
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.err.println(e.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimir o número " + i);
		}
		//realizar o for para imprimir os números com base na variável contagem
	}
}