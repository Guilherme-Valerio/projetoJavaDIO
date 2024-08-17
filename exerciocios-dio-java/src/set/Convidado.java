package set;
import java.util.Objects;

public class Convidado {
    //atributos
    private final String nome;
    private final int codigoConvite;
    
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) return true; // Verifica se é o mesmo objeto
    if (!(o instanceof Convidado convidado)) return false; // Verifica se o tipo é compatível
    return getCodigoConvite() == convidado.getCodigoConvite(); // Compara atributos
    // O método equals() é utilizado para comparar dois objetos e determinar se eles são "iguais". Por padrão, o método equals() na classe Object compara as referências de memória (ou seja, verifica se os dois objetos são exatamente o mesmo objeto). No entanto, em muitos casos, queremos comparar os atributos dos objetos para definir igualdade.
  }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite()); 
        // A regra geral é que se dois objetos são iguais (segundo o método equals()), eles devem ter o mesmo código hash, ai mudamos o código hash para levar em consideração o Codigo Convite.
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }
    
}
