public class Boletim {
    public static void main(String[] args) {
        int mediaFinal = 5;
        boolean notaMinerva = true;
        
        if (mediaFinal > 6)
            System.out.println("Aprovado");
        else if (mediaFinal == 6 && notaMinerva == true)
            System.out.println("Prova Minerva");
        else
            System.out.println("Reprovado");
    }
}
