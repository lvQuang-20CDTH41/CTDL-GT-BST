package BST;

public class BinarySearchTree {
	NodeTree root;
	BinarySearchTree(){
		root = null;
	}
//	add
	public void addBST(int value) {
		root = addBST(root, value);
	}
	public NodeTree addBST(NodeTree root, int value) {
		if(root == null) {
			root = new NodeTree(value);
			root.left = root.right = null;
		}else if(root.info > value){
			root.left = addBST(root.left, value);
		}else {
			root.right = addBST(root.right, value);
		}
		return root;
	}
//	print
	public void print() {
		print(root);
	}
	private void print(NodeTree root) {
		if(root == null) return;
		root.print();
		print(root.right);
		print(root.left);
	}
//	Đếm BST
	public int count() {
		return count(root);
	}
	private int count(NodeTree root) {
		if(root == null) return 0;
		int a = count(root.right);
		int b = count(root.left);
		return a + b + 1;
	}
//	Tính trung bình cộng
	public double average() {
		return average(root) / count();
	}
	private double average(NodeTree root) {
		if(root == null) return 0;
		double sum = (root.info + average(root.right) + average(root.left));
		return sum;
	}
	public void odd() {
		odd(root);
	}
	private void odd(NodeTree root) {
		if(root == null) return;
		else if(root.info % 2 != 0 && root.right != null && root.left != null){
			root.print();
		}
		odd(root.right);
		odd(root.left);
	}
//	Đếm xem có bao nhiêu nút có 2 con
	public int countTree() {
		return countTree(root);
	}
	private int countTree(NodeTree root) {
		if(root == null) return 0;
		if(root.left != null && root.right != null) {
			return countTree(root.right) + countTree(root.left) + 1;
		}else {
			return countTree(root.right) + countTree(root.left);
		}
	}
// đếm số chia hết cho x & ko chia hết cho y
	public int division(int x, int y) {
		return division(root, x, y);
	}
	private int division(NodeTree root, int x, int y) {
		if(root == null) return 0;
		if(root.info % x == 0 && root.info % y != 0) {
			return division(root.right, x, y) + division(root.left, x, y) + 1;
		}else {
			return division(root.right, x, y) + division(root.left, x, y);
		}
	}
//	length
	public int heightTree() {
		return heightTree(root);
	}
	public int heightTree(NodeTree root) {
		if(root == null) return 0;
		else {
			int hLeft = heightTree(root.left);
			int hRight = heightTree(root.right);
			if(hLeft > hRight) return hLeft + 1;
			else return hRight + 1;
		}
	}
}
