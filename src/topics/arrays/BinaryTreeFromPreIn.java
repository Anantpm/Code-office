package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Construct Tree from given Inorder and Preorder traversals
 * 
 *         Input : Inorder sequence: D B E A F C Preorder sequence: A B D E C F
 *
 *         Output : 
 *
 */

class Node {
	private char data;
	private Node left;
	private Node right;

	public Node(char data) {
		this.data = data;
		left = right = null;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}

public class BinaryTreeFromPreIn {
	static int preIndex = 0;

	public static void main(String[] args) {
		char[] in = { 'D', 'B', 'E', 'A', 'F', 'C' };
		char[] pre = { 'A', 'B', 'D', 'E', 'C', 'F' };
		Node root = buildTree(in, pre, 0, in.length - 1);
		System.out.println(root);
	}

	private static Node buildTree(char[] in, char[] pre, int inStrt, int inEnd) {
		if (inStrt > inEnd)
			return null;
		Node root = new Node(pre[preIndex++]);
		if (inStrt == inEnd)
			return root;
		int index = search(in, inStrt, inEnd, root.getData());

		root.setLeft(buildTree(in, pre, inStrt, index - 1));
		root.setRight(buildTree(in, pre, index + 1, inEnd));
		return root;
	}

	private static int search(char[] in, int inStrt, int inEnd, char c) {
		int i;
		for (i = inStrt; i <= inEnd; i++) {
			if (in[i] == c)
				return i;
		}
		return i;
	}

}
