import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o número informado pelo usuário
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Calcula a sequência de Fibonacci
        int a = 0;
        int b = 1;
        int resultado = 0;
        boolean pertence = false;

        while (resultado <= numero) {
            if (resultado == numero) {
                pertence = true;
                break;
            }
            resultado = a + b;
            a = b;
            b = resultado;
        }

        // Exibe o resultado
        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}