package lista.carrinho_de_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

  private final List<Item> listaItens;
  
  //metodo construtor
  public CarrinhoCompras(){
    this.listaItens = new ArrayList<>();
  }
  
  public void adicionarItem(String nome, double preco, int quantidade){
    Item item = new Item(nome, preco, quantidade);
    this.listaItens.add(item); 
  }
  
  public void removerItem(String nome){
    List<Item> itensParaRemover = new ArrayList<>();
    if(!listaItens.isEmpty()){
      for(Item i : listaItens){
        if(i.getNome().equalsIgnoreCase(nome)){
          itensParaRemover.add(i);
        }   
      }
      listaItens.removeAll(itensParaRemover);
    } else{
      System.out.println("A lista está vazia!");
    }
  }
  
  public double calcularValorTotal(){
    double valorTotal = 0d;
    if (!listaItens.isEmpty()) {
      for (Item item : listaItens) {
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
  
  public void exibirItens(){
    if(!listaItens.isEmpty()){
      System.out.println(this.listaItens);
    } else {
      System.out.println("A lista está vazia!");
    }
  }
  
  @Override
  public String toString() {
    return "CarrinhoDeCompras{itens= " + listaItens + '}';
  }

  public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
    CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

     // Adicionando itens ao carrinho
    carrinhoCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoCompras.adicionarItem("Caneta", 5d, 4);
    carrinhoCompras.adicionarItem("Tesoura", 3.2d, 2);
    carrinhoCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é: " + carrinhoCompras.calcularValorTotal());
  }
}