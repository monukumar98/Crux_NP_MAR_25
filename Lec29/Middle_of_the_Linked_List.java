package Lec29;

public class Middle_of_the_Linked_List {
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
		public ListNode middleNode(ListNode head) {
          // logic
			ListNode fast=head;
			ListNode slow=head;
			while(fast!=null && fast.next!=null) {
				fast=fast.next.next;
				slow=slow.next;

			}
			return slow;
		}
	}
}














