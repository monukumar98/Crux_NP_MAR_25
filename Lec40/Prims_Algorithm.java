package Lec40;

import java.util.*;



public class Prims_Algorithm {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public int Prims() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
		HashSet<Integer> visited = new HashSet<>();
		int sum = 0;
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			PrimsPair rp = pq.poll();
			// 2. Ignore if Already visisted
			if (visited.contains(rp.vtx)) {
				continue;
			}
			// 3. Marked visited
			visited.add(rp.vtx);
			// 4. self work
			System.out.println(rp);
			sum += rp.cost;
			// 5. add unvisited nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Prims_Algorithm pq = new Prims_Algorithm(7);
		pq.AddEdge(1, 2, 5);
		pq.AddEdge(1, 4, 2);
		pq.AddEdge(3, 2, 3);
		pq.AddEdge(3, 4, 1);
		pq.AddEdge(5, 4, 6);
		pq.AddEdge(5, 6, 2);
		pq.AddEdge(5, 7, 4);
		pq.AddEdge(7, 6, 8);
		System.out.println(pq.Prims());
	}

	class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.acqvtx = acqvtx;
			this.cost = cost;
			this.vtx = vtx;
		}
		@Override
		public String toString() {
			return vtx+" "+acqvtx+" @ "+cost;
		}

	}

}
