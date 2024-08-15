package lista.carrinho_de_compras;

public class Item {
  
    //atributos
    private final String nome;
    private final Double preco;
    private final Integer quantidade;
    
    //metodo construtor
    public Item(String nome, Double preco, Integer quantidade){
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
    }
    
    //getters
    public String getNome(){
      return nome;
    }
    
    public Double getPreco(){
      return preco;
    }
  
    public Integer getQuantidade(){
      return quantidade;
    }

    @Override
	public String toString() {
		return "Item{" +
				"nome='" + nome + '\'' +
				", preco=" + preco +
				", quant=" + quantidade +
				'}';
	}
  }