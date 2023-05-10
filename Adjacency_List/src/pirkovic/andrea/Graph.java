package pirkovic.andrea;
/*Lista susednosti ili Adjacency list je strukturi podataka, u kojoj nije cilj da uskladištimo vrednost svih različitih parova cvorova. Umesto toga, za svaki čvor čuvamo samo susedne čvorove.

Da bismo to uradili, kreiramo niz odredjene veličine. Svaka ćelija u nizu će sadržati povezanu listu. Svaki objekat unutar povezane liste će uskladištiti indeks čvora C koji je povezan sa čvorom sa indeksom U. 
Prema tome, svaka ćelija u će imati povezanu listu veličine N_u, gde N_u odgovara broju čvorova povezanih sa čvorom u. U slučaju da imamo posla sa weighted grafovima, onda će svaki objekat unutar povezane liste sadržati dve informacije, susedni čvor v i tezinu veze između u i v.*/
import java.util.List;
import java.util.ArrayList;

public class Graph {

	    int nodes;
	    List<List<Integer>> adjlist;

	    Graph (int arg_nodes) { // konstruktor grafa, sa cvorovima(nodes) i  listom veza (adjacency list)
	        nodes = arg_nodes;
	        adjlist = new ArrayList<>(nodes);
	        for (int i=0; i<nodes; i++)
	            adjlist.add(new ArrayList<>());
	    }

	    void AddEdge (int src, int dst) { // metod za dodavanje veza u adjacency list
	        adjlist.get(src).add(dst);
	        adjlist.get(dst).add(src);
	    }

	    void Iterate (int src) { // metod za prolazak kroz graf
	        System.out.print("\n" + src + " : ");
	        for(Integer adj_node : adjlist.get(src)) {
	            System.out.print(adj_node + " ");
	        }
	    }
	    
	    public static void main (String[] args) {
	    	// Kreiranje grafa sa 8 cvorova
	        Graph g = new Graph(8);
	        g.AddEdge(0,1);// Dodavanje veza jedna po jedna
	        g.AddEdge(0,2);
	        g.AddEdge(1,3);
	        g.AddEdge(1,4);
	        g.AddEdge(2,3);
	        g.AddEdge(3,5);
	        g.AddEdge(4,6);
	        g.AddEdge(5,6);

	        System.out.print("Adjacency list implementation for graph");

	        g.Iterate (0);
	        g.Iterate (1);
	        g.Iterate (2);
	        g.Iterate (3);
	        g.Iterate (4);
	        g.Iterate (5);
	    }
	}

