package Lec45;

import java.util.HashMap;
import java.util.Scanner;


public class Trie_Contacts {

	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isterminal;
		int count = 1;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
		}
	}

	private Node root;

	public Trie_Contacts() {
		// TODO Auto-generated constructor stub
		root = new Node('*');
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node nn = new Node(ch);
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isterminal = true;
	}

	public int startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Trie_Contacts t = new Trie_Contacts();
		while (n-- > 0) {	
			String s1 = sc.next();
			String s2 = sc.next();
			if (s1.equals("add")) {
				t.insert(s2);
			} else {
				System.out.println(t.startsWith(s2));
			}

		}

	}

}
