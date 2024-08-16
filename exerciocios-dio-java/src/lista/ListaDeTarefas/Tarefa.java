package lista.ListaDeTarefas;

public class Tarefa {
    //atributo
    private final String descricao;
    
    //metodo construtor
    public Tarefa(String descricao) {
      this.descricao = descricao;
    }
    
    //metodo get para sabermos o valor
    public String getDescricao(){
      return descricao;
    }

    //@Override indica que você está mudando o padrão de como esse método funciona.
    //o método toString() foi modificado para que, ao imprimir o objeto Tarefa, ele mostre a descrição da tarefa em vez de mostrar algo que não faz sentido.
    @Override
    public String toString() {
      return descricao;
    }
  }