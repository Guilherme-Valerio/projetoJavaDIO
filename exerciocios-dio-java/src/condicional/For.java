package condicional;
public class For {
    public static void main(String[]args){
        for(int x = 0; x <= 10; x++){
            if(x==0 || x==1) {
                System.out.println(x + " carneirinho");
            }else {
                System.out.println(x + " carneirinhos");
            }
        }

        String alunos[] = {"FELIPE", "JONAS", "GUILHERME", "LUCIA", "GIOVANNA"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
        }

        for(String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
