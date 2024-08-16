package lista.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro i : livrosList){
                if(i.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(i);
                }
            }   
        } else {
            System.out.println("A lista esta vazia");
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro j : livrosList){
                if(j.getAnoPublicacao() >= anoInicial && j.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(j);
                }
            }
        } else{
            System.out.println("Lista Vazia");
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for(Livro k : livrosList){
                if (k.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = k;
                    break;
                }
            }
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1995);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2010);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2000);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2020);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2013);
    
        System.out.println(catalogoLivros.pesquisarPorAutor("autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2019));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
