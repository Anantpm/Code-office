package topics.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Construct Tree from given Inorder and Postorder traversals
 * 
 *         Input : in[] = {4, 8, 2, 5, 1, 6, 3, 7} post[] = {8, 4, 5, 2, 6, 7,
 *         3, 1}
 *
 *         Output :
 *
 */
class NodeI {
	private int data;
	private NodeI left;
	private NodeI right;

	public NodeI(int data) {
		this.data = data;
		left = right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public NodeI getLeft() {
		return left;
	}

	public void setLeft(NodeI left) {
		this.left = left;
	}

	public NodeI getRight() {
		return right;
	}

	public void setRight(NodeI right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}

public class BinaryTreeFromPostIn {
	private static int postIndex;
	private static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		int[] in = { 4, 8, 2, 5, 1, 6, 3, 7 };
		int[] post = { 8, 4, 5, 2, 6, 7, 3, 1 };
		postIndex = post.length - 1;
		IntStream.range(0, post.length).forEach(i -> {
			map.put(in[i], i);
		});
		System.out.println(map);
		NodeI root = buildTree(in, post, 0, in.length - 1);
		printPre(root);
	}

	private static void printPre(NodeI root) {
		if (root == null)
			return;
		System.out.print(root.getData() + " ");
		printPre(root.getLeft());
		printPre(root.getRight());

	}

	private static NodeI buildTree(int[] in, int[] post, int inStrt, int inEnd) {
		if (inStrt > inEnd)
			return null;
		NodeI node = new NodeI(post[postIndex--]);
		if (inStrt == inEnd)
			return node;
		int index = map.get(node.getData());// search(in, inStrt, inEnd, node.getData());
		node.setRight(buildTree(in, post, index + 1, inEnd));
		node.setLeft(buildTree(in, post, inStrt, index - 1));

		return node;
	}

	private static int search(int[] in, int inStrt, int inEnd, int data) {
		int i;
		for (i = inStrt; i < inEnd; i++)
			if (in[i] == data)
				return i;
		return i;
	}

}
