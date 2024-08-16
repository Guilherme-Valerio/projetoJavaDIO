package lista.Ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private final List<Pessoa> peopleList;

    public OrdenacaoPessoas() {
        this.peopleList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
       peopleList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(peopleList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    } 

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(peopleList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Guilherme", 19, 1.8);
        ordenacaoPessoas.adicionarPessoa("Giovanna", 19, 1.52);
        ordenacaoPessoas.adicionarPessoa("Luana", 16, 1.65);
        ordenacaoPessoas.adicionarPessoa("Sergio", 44, 1.83);
        ordenacaoPessoas.adicionarPessoa("Lucia", 45, 1.63);
        
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}
