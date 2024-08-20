package set;
import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private final long codigo;
    private final String nome;
    private final double preco;
    private final int quantidade;
    
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true; // Verifica se os objetos são exatamente a mesma instância.
        if(!(o instanceof Produto produto)) return false; // Verifica se 'o' é uma instância de Produto.
        return getCodigo() == produto.getCodigo(); // Compara o campo 'codigo' dos dois objetos.
    }

    @Override
    public int hashCode(){
        return Objects.hash(getCodigo()); // Gera um hash code usando 'codigo'.
    }

    @Override
    public String toString() {
        return " Produto[codigo: " + codigo + ", nome: " + nome + ", preco: " + preco + ", quantidade: " + quantidade + "] ";
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }   
}

class ComparatorPorPreco implements Comparator<Produto>{
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
        
    }