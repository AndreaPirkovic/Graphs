package pirkovic.andrea;
	

//4 cvora (A, B, C i D) i 6 veza : A do B, B do C i C do D i B do A, C do B i D do C koje su predstavljene korišćenjem dvosmerne matrice susednosti (Adjacency matrix)
public class Bidirectional {
		
			  static int[][] matrix; // Adjacency matrix
			  static int numVertices; // broj cvorova

			  public static void main(String[] args) {
			    // podesiti broj cvorova
			    numVertices = 4;

			    // inicijalizacija matrice
			    matrix = new int[numVertices][numVertices];

			    // dodavanje veza
			    matrix[0][1] = 1;
			    matrix[1][2] = 1;
			    matrix[2][3] = 1;

			 // Uciniti matricu simetricnom, tj dvosmernom
			    for (int i = 0; i < numVertices; i++) {
			      for (int j = 0; j < i; j++) {
			        matrix[i][j] = matrix[j][i];
			      }
			    }
			    
			 // stampa matrice
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



