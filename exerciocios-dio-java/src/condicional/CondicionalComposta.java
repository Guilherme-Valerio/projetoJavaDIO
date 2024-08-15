package condicional;

public class CondicionalComposta {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 30;
        
    
        if (valorSolicitado > saldo) {
            System.out.println("Não podemos sacar esse valor, você não possui saldo suficiente :(");
        } 
        else {
            saldo = saldo - valorSolicitado;
            System.out.println("Valor foi sacado!");
            System.out.println("Seu saldo é " + saldo + " reais");
        }
    }
}
