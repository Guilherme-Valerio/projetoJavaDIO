package operadores_tags;
public class Operadores {
    public static void main(String[] args) {

        int a, b;
        a = 5;
        b = 4;

        String resultado = a==b ? "verdadeiro" : "falso";

        //if (a == b)
        //    resultado = "true";
        //else 
        //    resultado = "false";

        System.out.println(resultado);



        String nomeUm = "GUI";
        String nomeDois = "GUI";
        System.out.println(nomeUm == nomeDois); //Comparações para números ou variáveis
        
        nomeDois = new String("GUI");
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois)); //Compara conteúdos de objetos


        boolean condicao1 = false;
        boolean condicao2 = true;

        if ((condicao1 && condicao2) == false) {
            System.out.println("As duas são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma delas são");
        }
    }
}
