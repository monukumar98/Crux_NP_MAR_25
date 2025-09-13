package Lec39;

import java.util.HashSet;

public class GraphClient {
	public static void main(String[] args) {
		Graph g = new Graph(7);
		g.AddEdge(1, 2, 3);
		g.AddEdge(1, 4, 7);
		g.AddEdge(2, 3, 1);
		g.AddEdge(3, 4, 6);
		g.AddEdge(5, 4, 2);
		g.AddEdge(5, 6, 4);
		g.AddEdge(5, 7, 3);
		g.AddEdge(6, 7, 1);
		g.Display();
		System.out.println(g.hasPath(1, 6, new HashSet<>()));
		g.PrintPath(1, 6, new HashSet<>(), "");

	}

}
