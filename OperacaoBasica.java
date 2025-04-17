import java.util.Scanner;

public class OperacaoBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int x = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int y = scanner.nextInt();

        int resultado_soma = x + y;
        int resultado_subtracao = x - y;
        int resultado_multiplicacao = x * y;
        int resultado_divisao = x / y;
        
        System.out.println("Resultado soma: " + resultado_soma);
        System.out.println("Resultado subtracao: " + resultado_subtracao);
        System.out.println("Resultado multiplicacao: " + resultado_multiplicacao);
        System.out.println("Resultado divisao: " + resultado_divisao);
        
        scanner.close();
    }
}
