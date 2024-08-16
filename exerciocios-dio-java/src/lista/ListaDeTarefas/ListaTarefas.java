package lista.ListaDeTarefas;

import java.util.*;

public class ListaTarefas{
  //atributo
  private final List<Tarefa> tarefaList;
  
  //metodo construtor
  public ListaTarefas(){
    this.tarefaList = new ArrayList<>();
  }
  
  public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
  }
  
  public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for(Tarefa t: tarefaList){
      if (t.getDescricao().equalsIgnoreCase(descricao)){
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }
  
  public int obterNumeroTotalTarefas(){
    return tarefaList.size();
  }
  
  public void obterDescricaoTarefas(){
    System.out.println(tarefaList);
  }
  
  public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefa
    ListaTarefas listaTarefa = new ListaTarefas();

    // Adicionando tarefas à lista
    listaTarefa.adicionarTarefa("Comprar leite");
    listaTarefa.adicionarTarefa("Estudar para o exame");
    listaTarefa.adicionarTarefa("Fazer exercícios");

    // Exibindo o número total de tarefas na lista
    System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    // Exibindo as descrições das tarefas na lista
    listaTarefa.obterDescricaoTarefas();

    // Removendo uma tarefa da lista
    listaTarefa.removerTarefa("Trabalhar");

    // Exibindo o número total de tarefas na lista após a remoção
    System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    // Exibindo as descrições das tarefas atualizadas na lista
    listaTarefa.obterDescricaoTarefas();

    // Removendo uma tarefa da lista quando a lista está vazia
    listaTarefa.removerTarefa("Estudar para o exame");

    // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
    System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    // Exibindo as descrições das tarefas na lista
    listaTarefa.obterDescricaoTarefas();
  }
}