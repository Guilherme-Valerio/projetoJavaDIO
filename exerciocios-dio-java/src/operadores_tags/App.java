package operadores_tags;
import java.util.Scanner;

public class App {
    //@SuppressWarnings("resource") ele é um método que desabiilta os avisos
    public static void main(String[] args) {
        int anoAtual = 2024;
        int ANO_NASCIMENTO = 2005;
        final String BR = "Brasil";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello, World!");
            System.out.println("Nosso pais é o " + BR);

            System.out.println("Qual seu primeiro nome?");
            String nome1 = scanner.nextLine();

            System.out.println("Qual seu sobrenome?");
            String nome2 = scanner.nextLine();

            String nomeCompleto = nomeCompleto(nome1, nome2);
            System.out.println(nomeCompleto);
            int soma = somar(anoAtual, ANO_NASCIMENTO);
            System.out.println(soma);
        }
    }

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
