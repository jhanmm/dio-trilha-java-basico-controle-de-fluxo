import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n;//Usado apenas para finalizar o laço de repetição.
        do{
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();
        
		
        
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!!!");
		}

        System.out.println("\n\n\nDigite 1 se quiser repetir ou 2 para parar.");
        n=scan.nextInt();
        }while(n!=2);
		
        scan.close();
    
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }
		else {
            int contagem = parametroDois - parametroUm;
            for(int i=1;i<=contagem;i++){
                System.out.println("Imprimindo o número "+i);
            }
		//realizar o for para imprimir os números com base na variável contagem
        }
	}
}