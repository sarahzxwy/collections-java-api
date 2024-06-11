package main.java.List.Pesquisa.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
   private List<Livro> listalivros;

   public CatalogoLivros() {
        this.listalivros = new ArrayList<>();
   }

   public void adicionarLivro(String titulo, String autor, int anoPublicado) {
      listalivros.add(new Livro(titulo, autor, anoPublicado));
   }

   public List<Livro> pesquisarPorAutor(String autor) {
      List<Livro> livrosPorAutor = new ArrayList<>();
      if (!listalivros.isEmpty()) {
         for (Livro l : listalivros) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
               livrosPorAutor.add(l);
            }
         }
      }
      return livrosPorAutor;
   }

   public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
      List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
      if (!listalivros.isEmpty()) {
         for (Livro l : listalivros) {
            if (l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <= anoFinal) {
               livrosPorIntervaloAnos.add(l);
            }
         }
      } 
      return livrosPorIntervaloAnos;
   }

   public Livro pesquisarPorTitulo(String titulo) {
      Livro livroPorTitulo = null;
      if (!listalivros.isEmpty()) {
         for (Livro l : listalivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
               livroPorTitulo = l;
               break;
            }
         }
      } 
      return livroPorTitulo;
   }
  
   public static void main(String[] args) {
      
      CatalogoLivros catalogoDeLivros = new CatalogoLivros();

      catalogoDeLivros.adicionarLivro("Memórias póstumas de Brás Cubas", "Machado de Assis", 1881);
      catalogoDeLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
      catalogoDeLivros.adicionarLivro("O Meu Pé de Laranja Lima", "José Mauro de Vasconcelos", 1968);
      catalogoDeLivros.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
      catalogoDeLivros.adicionarLivro("Crime e Castigo", "Fiódor Dostoiévski", 1866);

      System.out.println("Livros encontrados por autor:" + catalogoDeLivros.pesquisarPorAutor("Machado de assis"));

      System.out.println("Livros encontrados por intervalo dos anos pesquisados: " + catalogoDeLivros.pesquisarPorIntervaloAnos(1800, 1990));

      System.out.println("Livro encontrado por título: " + catalogoDeLivros.pesquisarPorTitulo("memórias póstumas de Brás Cubas"));
      
   }
}
