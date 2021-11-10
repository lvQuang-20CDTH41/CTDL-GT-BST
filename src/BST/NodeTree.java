package BST;

public class NodeTree {
	NodeTree left, right;
	int info;
	NodeTree(int info){
		this.info = info;
		left = right = null;
	}
	public void print() {
		System.out.print(info + " ");
	}
}
