package operadores_tags;
public class Conta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.sacar(10);
        conta.imprimirSaldo();
        double divida = conta.calcularDividaExponencial();
        System.out.println(divida);
    }
    
    double saldo = 100.0;
    public void sacar(double valor){
        //variável local de método
        double novoSaldo = saldo - valor;  
        System.out.println("Seu novo saldo: " + novoSaldo);
    }

    public void imprimirSaldo(){
        //disponível em toda classe
        System.out.println("Saldo anterior: " + saldo);
        //somente o método sacar conhece essa classe
        //System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial(){
        //valor local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for(int x=1; x<=5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        return valorMontante;
    }
}


