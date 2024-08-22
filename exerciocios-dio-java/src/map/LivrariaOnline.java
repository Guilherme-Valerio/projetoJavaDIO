package map;
import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline(Map<String, Livro> livros) {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Map.Entry<String, Livro> entry : livros.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    chavesRemover.add(entry.getKey());
                }
            }
            for (String chave : chavesRemover) {
                livros.remove(chave);
            }
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        } 
        return livrosOrdenadosPorPreco;
    }

    public 
}
