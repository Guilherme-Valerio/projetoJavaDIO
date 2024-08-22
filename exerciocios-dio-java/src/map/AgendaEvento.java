package map;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEvento {
    private final Map<LocalDate, Evento> eventosMap;

    public AgendaEvento() {
        this.eventosMap = new HashMap<>();
    } 

    public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
        eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
    } 
    
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento = null;
        LocalDate proximaData = null;
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximoEvento = entry.getValue();
                proximaData = entry.getKey();  
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
          } else {
            System.out.println("Não há eventos futuros na agenda.");
          }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEventos = new AgendaEvento();
    
        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 2, 20), "Programando Inteligência Artificial", "Discussão sobre como programar uma IA");
    
        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();
    
        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
      }
}
