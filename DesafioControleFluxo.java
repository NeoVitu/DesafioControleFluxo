import java.util.Scanner;

class ParametrosInvalidosException extends Exception {}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Lê o primeiro número inteiro

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Lê o segundo número inteiro

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}