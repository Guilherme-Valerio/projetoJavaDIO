package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatosMap() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone); //put pode ser utilizado como atualizar também, então ele sempre guaurda o ulitmo valor caso tenha maps com o mesmo nome.
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirContatos(){
        if(!agendaContatoMap.isEmpty()){
            System.out.println(agendaContatoMap);
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda.");
            } 
            return numeroPorNome; 
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        AgendaContatosMap agendaContatosMap = new AgendaContatosMap();
        // Adicionar contatos
        agendaContatosMap.adicionarContato("Camila", 123456);
        agendaContatosMap.adicionarContato("João", 5665);
        agendaContatosMap.adicionarContato("Carlos", 1111111);
        agendaContatosMap.adicionarContato("Ana", 654987);
        agendaContatosMap.adicionarContato("Maria", 1111111);
        agendaContatosMap.adicionarContato("Camila", 44444);

        agendaContatosMap.exibirContatos();

        // Remover um contato
        agendaContatosMap.removerContato("Maria");
        agendaContatosMap.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatosMap.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatosMap.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
  }
}
