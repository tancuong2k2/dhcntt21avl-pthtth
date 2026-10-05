package binarysearchtree;

public class Main {
	public static Node addNode(Node root, int value) {
		if(root==null) return new Node(value);
		if(value<root.label) {
			if(root.left==null) root.left = new Node(value);
			else root.left = addNode(root.left, value);
		}
		else
		{
			if(root.right==null) root.right = new Node(value);
			else root.right = addNode(root.right, value);
		}
		return root;
	}
	
	public static void readtree(Node root) {
		if(root!=null) {
			readtree(root.left);
			System.out.print(root.label+" ");
			readtree(root.right);
		}
	}
	
	public static boolean findNode(Node root, int value) {
		if (root==null) return false;
		if (value==root.label) return true;
		else if (value<root.label) return findNode(root.left, value);
		else return findNode(root.right, value);
	}
	
	public static Node deleteNode(Node root, int value) {
		if(root==null) return null;
		if(root.label == value) {
			if(root.left==null) return root.right;
			if(root.right==null) return root.left;
			Node T = theleftNode(root.right);
			Node L = root.left;
			Node R = deleteNode(root.right, T.label);
			T.left = L;
			T.right = R;
			return T;
		}
		if (value<root.label) root.left = deleteNode(root.left, value);
		else root.right = deleteNode(root.right, value);
		return root;
	}
	
	public static Node theleftNode(Node root) {
		if(root==null) return null;
		if(root.left==null) return root;
		else return theleftNode(root.left);
	}
	
	public static void main(String[] args) {
		Node root = null;
		root = addNode(root, 50);
		root = addNode(root, 40);
		root = addNode(root, 60);
		root = addNode(root, 70);
		root = addNode(root, 55);
		root = addNode(root, 45);
		root = addNode(root, 65);
		System.out.print("Readtree root: ");
		readtree(root);
		System.out.println();
		System.out.println("FindNode 100: "+findNode(root, 100));
		root = deleteNode(root, 55);
		System.out.println("Cay root sau khi xoa node 55: ");
		readtree(root);
		
	}
}
