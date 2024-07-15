public class Metodos {
    public static void main(String[] args) {
        String cliente = "Dados";
        cliente = new String("Dados");
    }

    public double somar(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }

    public void imprimir(String texto){

    }

    public double dividir(int dividendo, int divisor) throws Exception{
        return 0;
    }

    private void metodoPrivado() { //Esse método não estará visível para outras classes

    }

    public void gravarCliente(String nome, String cpf, String numero) {
        //Esse método tem a finalidade de gravar informações de um cliente
        //Comprensa ao invés de criar um método com varios parâmetros, criar um objeto com todas as informações e passa-lo como parâmetro
    }
    //Assim
    public void gravarCliente(){ //Cliente cliente
    }
}

