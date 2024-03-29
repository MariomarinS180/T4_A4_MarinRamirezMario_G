import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Menu extends GFG {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		byte opc = 0;
		System.out.println("Algoritmos de Grafos a traves de Geeks For Geeks y \nel libro de Luis Joyanes.");
		do {
			System.out.println("Elija una opcion:\n1)Geeks For Geeks\n2) Luis Joyanes\n3)Salir");
		opc = e.nextByte();
		switch (opc) {
		case 1:
			int v1 = 5;
		Graph grafo = new Graph(v1);
		
		addEdge(grafo, 0, 1);
		addEdge(grafo, 0, 4);
		addEdge(grafo, 1, 2);
		addEdge(grafo, 1, 3);
		addEdge(grafo, 1, 4);
		addEdge(grafo, 2, 3);
		addEdge(grafo, 3, 4);
		printGraph(grafo);
			break;
		case 2: 
			BufferedReader entrada = new BufferedReader (
	              new InputStreamReader (System.in));
	      String v, w;
	      try {
	        int n;
	        System.out.println("N�mero de nodos: ");
	        n = Integer.parseInt(entrada.readLine());
	        GrafoMatriz gra = new GrafoMatriz(n);
	      
	        System.out.println("Lista de " + n + " vertices");
	        for (int i = 1; i <= n; i++)
	        {
	          v = entrada.readLine();
	          gra.nuevoVertice(v);
	        }
	      
	        System.out.println
	         ("Arcos, pares de vertices separados por un espacio");
	        boolean fin = false;
	        do {
	          StringTokenizer r;
	          r = new StringTokenizer(entrada.readLine());
	          v = r.nextToken();
	          if (! v.equalsIgnoreCase("fin"))
	          {
	            w = r.nextToken();
	            gra.nuevoArco(v, w);
	            gra.nuevoArco(w, v); 
	          }
	          else fin = true;
	        } while (!fin);
	      
	        System.out.println("Vertices del grafo");
	        Vertice [] vs = new Vertice[n];
	        vs = gra.vertices();
	        for (int i = 0; i < n; i++)
	          System.out.print(vs[i] + " ");
	      
	      }
	      catch(Exception e1)
	      {
	        System.out.println("Error en la entrada del grafo ");
	      }
			break;
		case 3: System.out.println("Sali�...");
		 	break; 
		default: System.out.println("No esta en la lista...");
			break;
		}
		} while (opc != 3);
	}//main
}//class
