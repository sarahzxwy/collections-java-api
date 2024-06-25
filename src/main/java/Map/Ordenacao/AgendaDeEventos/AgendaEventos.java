package main.java.Map.Ordenacao.AgendaDeEventos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosmap;

    public AgendaEventos() {
        this.eventosmap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosmap.put(data, evento);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventosmap.entrySet()) {
          LocalDate dataEvento = entry.getKey();
          if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
            proximaData = dataEvento;
            proximoEvento = entry.getValue();
            break;
          }
        }
        if (proximoEvento != null) {
          System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
          System.out.println("Não há eventos futuros na agenda.");
        }
      }

    public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosmap);
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      Evento evento = entry.getValue();
      System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
    }
  }

  public static void main(String[] args) {
    
    AgendaEventos agendaDeEventos = new AgendaEventos();

    agendaDeEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
    agendaDeEventos.adicionarEvento(LocalDate.of(2020, 10, 8),  "Hackathon de Inovação", "Competição de soluções criativas");
    agendaDeEventos.adicionarEvento(LocalDate.of(2019, 4, 12), "Lançamento de Software", "Demonstração da nova versão");
    agendaDeEventos.adicionarEvento(LocalDate.of(2024, 6, 16), "Workshop de Programação", "Aula prática de desenvolvimento");

    agendaDeEventos.exibirAgenda();

    agendaDeEventos.obterProximoEvento();

  }
}
