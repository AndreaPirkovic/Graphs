package pirkovic.andrea;

import java.util.*;

//klasa za konstruisanje veza weighted grafa
class Edge {
  int src, dest, weight;
  Edge(int src, int dest, int weight) {
          this.src = src;
          this.dest = dest;
          this.weight = weight;
      }
}
//Graph klasa sa konstruktorom 
class Graph {
  // cvor liste susednosti 
  static class Node {
      int value, weight;
      Node(int value, int weight)  {
          this.value = value;
          this.weight = weight;
      }
  };

//definisanje liste susednosti cvorova

List<List<Node>> adj_list = new ArrayList<>();

  //Graph konstruktor za dodavanje veza izmedju cvorova
  public Graph(List<Edge> edges)
  {
      
      for (int i = 0; i < edges.size(); i++)
          adj_list.add(i, new ArrayList<>());

      // dodavanje veza u grafu tj u adjacency List od polaznog(src) do ciljnog(dest) cvora
      for (Edge e : edges)
      {
           adj_list.get(e.src).add(new Node(e.dest, e.weight));
      }
  }
//stampa liste susednosti tj grafa
  public static void printGraph(Graph graph)  {
      int src_vertex = 0;
      int list_size = graph.adj_list.size();

      System.out.println("The contents of the graph:");
      while (src_vertex < list_size) {
          //prolazak kroz listu i stampa veza
          for (Node edge : graph.adj_list.get(src_vertex)) {
              System.out.print("Vertex:" + src_vertex + " ==> " + edge.value + 
                              " (" + edge.weight + ")\t");
          }

          System.out.println();
          src_vertex++;
      }
  }
}
class Main{
  public static void main (String[] args) {
      // definisanje veza unutar grafa 
      List<Edge> edges = Arrays.asList(new Edge(0, 1, 2),new Edge(0, 2, 4),
                 new Edge(1, 2, 4),new Edge(2, 0, 5), new Edge(2, 1, 4),
                 new Edge(3, 2, 3), new Edge(4, 5, 1),new Edge(5, 4, 3));

      // pozivanje konstruktora grafa
      Graph graph = new Graph(edges);

      // stampa grafa kao liste susednosti
      Graph.printGraph(graph);
  }
}
