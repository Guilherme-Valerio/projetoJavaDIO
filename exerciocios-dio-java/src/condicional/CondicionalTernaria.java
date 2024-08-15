package condicional;
public class CondicionalTernaria {
    public static void main(String[]args){
        int nota = 5;
        String resultado = nota >= 7 ? "Aprovado" : nota == 6 || nota == 5 ? "Recuperação" : "Reprovado";
        
        System.out.println(resultado);
    }
}
