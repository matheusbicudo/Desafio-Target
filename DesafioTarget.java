import java.util.Scanner;

public class Fibonacci {

    public static boolean verificaFibonacci(int numero) {
        int fibAntecessor = 0;
        int fibSucessor = 1;

        
        if (numero == fibAntecessor || numero == fibSucessor) {
            return true;
        }

        
        while (fibSucessor <= numero) {
           
            int fibProximo = fibAntecessor + fibSucessor;

           
            if (fibProximo == numero) {
                return true;
            }
           
            fibAntecessor = fibSucessor;
            fibSucessor = fibProximo;
        }

        
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numeroInformado = scanner.nextInt();

        
        if (verificaFibonacci(numeroInformado)) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
