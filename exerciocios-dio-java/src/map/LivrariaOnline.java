package map;
import java.util.*;

public class LivrariaOnline {
    private final Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livros.put(link, livro);
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

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor){
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livros.entrySet()){
            Livro livro = entry.getValue();
            if (livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Map.Entry<String, Livro>> obterLivroMaisCaro(){
        List<Map.Entry<String, Livro>> livroMaisCaro = new ArrayList<>();
        double precoMaior = Double.MIN_VALUE;
        for(Map.Entry<String, Livro> l : livros.entrySet()){
            if (l.getValue().getPreco() > precoMaior){
                precoMaior = l.getValue().getPreco();
                livroMaisCaro.clear();
                livroMaisCaro.add(l);
            }  else if (l.getValue().getPreco() == precoMaior) {
                livroMaisCaro.add(l);
            }
        }
        return livroMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;
    
        if (!livros.isEmpty()) {
          for (Livro livro : livros.values()) {
            if (livro.getPreco() < precoMaisBaixo) {
              precoMaisBaixo = livro.getPreco();
            }
          }
        } else {
          throw new NoSuchElementException("A livraria está vazia!");
        }
    
        for(Map.Entry<String, Livro> entry: livros.entrySet()) {
          if(entry.getValue().getPreco() == precoMaisBaixo) {
            Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
            livrosMaisBaratos.add(livroComPrecoMaisBaixo);
          }
        }
        return livrosMaisBaratos;
      }
    
      public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 3d));
    
        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());
    
        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());
    
        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        System.out.println("O autor tem esse/s livro/s: \n" +  livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));
    
        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: \n" + livrariaOnline.obterLivroMaisCaro());
    
        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: \n" + livrariaOnline.obterLivroMaisBarato());
    
        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livros);
    
      }
    
}
