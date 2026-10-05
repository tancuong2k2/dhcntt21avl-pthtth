package tree;

public class Main {

	public static int sumNode(Node root) {
		if (root == null)
			return 0;
		return root.label + sumNode(root.left) + sumNode(root.right);
	}

	public static int treeHeight(Node root) {
		if (root == null)
			return 0;
		int leftHeight = treeHeight(root.left);
		int rightHeight = treeHeight(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}

	// Tính trung bình
	public static double averageNode(Node root) {
		int total = sumNode(root);
		int count = countNode(root);
		if (count == 0)
			return 0; // tránh chia cho 0
		return (double) total / count;
	}

	public static int countSmaller(Node root, double avg) {
		if (root == null)
			return 0;
		int count = (root.label < avg) ? 1 : 0;
		return count + countSmaller(root.left, avg) + countSmaller(root.right, avg);
	}

	public static int countGreater(Node root, double avg) {
		if (root == null)
			return 0;
		int count = (root.label > avg) ? 1 : 0;
		return count + countGreater(root.left, avg) + countGreater(root.right, avg);
	}

	public static Node theleftNode(Node root) {
		if (root == null)
			return null;
		if (root.left == null)
			return root;
		else
			return theleftNode(root.left);
	}

	public static Node therightNode(Node root) {
		if (root == null)
			return null;
		if (root.right == null)
			return root;
		else
			return therightNode(root.right);
	}

	public static int countLeaf(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		else
			return countLeaf(root.left) + countLeaf(root.right);
	}

	public static int countNode(Node root) {
		if (root == null)
			return 0;
		else
			return 1 + countNode(root.left) + countNode(root.right);
	}

	public static void readtree(Node root) {
		if (root != null) {
			readtree(root.right);
			readtree(root.left);
			System.out.print(root.label + " ");
		}
	}

	public static void main(String[] args) {
		Node n7 = new Node(7);
		Node n5 = new Node(5);
		Node n12 = new Node(12);
		Node n3 = new Node(3);
		Node n6 = new Node(6);
		Node n9 = new Node(9);
		Node n15 = new Node(15);
		Node n1 = new Node(1);
		Node n4 = new Node(4);
		Node n8 = new Node(8);
		Node n10 = new Node(10);
		Node n13 = new Node(13);
		Node n17 = new Node(17);
		n3.left = n1;
		n3.right = n4;
		n9.left = n8;
		n9.right = n10;
		n15.left = n13;
		n15.right = n17;
		n5.left = n3;
		n5.right = n6;
		n12.left = n9;
		n12.right = n15;
		n7.left = n5;
		n7.right = n12;
		System.out.println("Doc cay root theo thu tu RLN: ");
		Node root = n7;
		readtree(root);
		System.out.println();
		System.out.println("Tổng số Node của cây root là: " + countNode(root));
		System.out.println("Tổng số Node lá của cây root là: " + countLeaf(root));
		System.out.println("Node bên trái nhất có lable là: " + theleftNode(root).label);
		System.out.println("Node bên phải nhất có lable là: " + therightNode(root).label);
		System.out.println("Giá trị trung bình của các node là: " + averageNode(root));
		double avg = averageNode(root);
		System.out.println("Số node nhỏ hơn trung bình: " + countSmaller(root, avg));
		System.out.println("Số node lớn hơn trung bình: " + countGreater(root, avg));
		System.out.println("Chiều cao của cây là: " + treeHeight(root));
	}
}
