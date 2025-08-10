package Lec30;

import java.util.Stack;

public class Reverse_Nodes_in_k_Group {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			Stack<ListNode> st = new Stack<>();
			ListNode groupstart = head;
			ListNode dummy = new ListNode();
			ListNode temp = dummy;
			int count = 0;
			while (head != null) {
				st.push(head);
				count++;
				head = head.next;

				if (count == k) {
					while (!st.isEmpty()) {
						dummy.next = st.pop();
						dummy = dummy.next;

					}
					groupstart = head;
					count = 0;
				}

			}
			if (!st.isEmpty()) {
				dummy.next = groupstart;
			} else {
				dummy.next = null;
			}
			return temp.next;

		}
	}

}
