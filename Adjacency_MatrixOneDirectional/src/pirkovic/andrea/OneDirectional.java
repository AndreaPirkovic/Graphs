package pirkovic.andrea;
/*možemo da skladištimo grafove kao matricu susednosti čiji su redovi i kolone isti kao i broj cvorova. 
 * Presek svakog reda i kolone označava prisustvo ili odsustvo veze. U non-weighted grafu prisustvo veze je označeno sa 1 
 * dok je u weighted grafu zamenjeno težinom veze. Odsustvo veze je oznaceno sa 0*/

//Primer:
//4 cvora (A, B, C, i D) i 3 veze: A sa B, B sa C, i C sa D koji se predstavljeni pomocu adjacency matrix sa jednosmernim vezama.
public class OneDirectional {
	
		  static int[][] matrix; // Adjacency matrix
		  static int numVertices; // broj cvorova

		  public static void main(String[] args) {
		    // postaviti broj cvorova
		    numVertices = 4;

		    // Inicijalizacija adjacency matrix
		    matrix = new int[numVertices][numVertices];

		    // dodavanje veza jedna po jedna
		    matrix[0][1] = 1;
		    matrix[1][2] = 1;
		    matrix[2][3] = 1;

		 
		    
		 // Stampa adjacency matrix
		    System.out.print("  ");
		    for (int i = 0; i < numVertices; i++) {
		      System.out.print((char)('A' + i) + " ");
		    }
		    System.out.println();
		    for (int i = 0; i < numVertices; i++) {
		      System.out.print((char)('A' + i) + " ");
		      for (int j = 0; j < numVertices; j++) {
		        System.out.print(matrix[i][j] + " ");
		      }
		      System.out.println();
		    }
		  }
		}

