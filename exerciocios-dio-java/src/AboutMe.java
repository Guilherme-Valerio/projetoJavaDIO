public class AboutMe {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Por favor, forneça os argumentos: nome, sobrenome, idade, altura");
            return;
        }
        try {
            String nome = args[0];
            String sobrenome = args[1];
            int idade = Integer.parseInt(args[2]);
            double altura = Double.parseDouble(args[3]);

            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " metros");
        } catch (NumberFormatException e) {
            System.out.println("Idade e altura devem ser números válidos.");
        }
    }
}
