import java.util.Scanner;

public class ConversaoPrimitivoWrapper {
    public static void main(String[] args) {
        // Criação do Scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o valor numérico
        System.out.print("Digite um número inteiro: ");

        // Armazena em uma variável primitiva (int)
        int numeroPrimitivo = scanner.nextInt();

        // Converte para o tipo wrapper (Integer)
        Integer numeroWrapper = numeroPrimitivo;

        // Imprime ambos os valores
        System.out.println("Valor primitivo (int): " + numeroPrimitivo);
        System.out.println("Valor wrapper (Integer): " + numeroWrapper);

        // Fecha o Scanner
        scanner.close();
    }
}