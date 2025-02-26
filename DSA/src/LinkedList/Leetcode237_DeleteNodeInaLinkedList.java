package LinkedList;

public class Leetcode237_DeleteNodeInaLinkedList {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 1, 9 };
		Node head = ArrayToLinkedList.constructLL(arr);
		Node toDelete = head.next.next;
		deleteNode(toDelete);
		ArrayToLinkedList.printLinkedList(head);
	}

	public static void deleteNode(Node node) {
		if (node == null)
			return;
		node.data = node.next.data;
		node.next = node.next.next;
		return;
	}

}
