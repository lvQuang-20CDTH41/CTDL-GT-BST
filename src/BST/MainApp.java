package BST;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		bst.addBST(42);bst.addBST(23);bst.addBST(11);bst.addBST(74);bst.addBST(65);
		bst.addBST(58);bst.addBST(94);bst.addBST(36);bst.addBST(99);bst.addBST(87);
		
		System.out.println("Binary Search Tree");
		bst.print();
		
		System.out.println("\nAverage: " + bst.average());
		
		System.out.println("Các nút lẽ có lá: ");
		bst.odd();
		
		System.out.println("\nSố nút có 2 con: " + bst.countTree());
		
		System.out.println("Nhập x: ");
		int x = sc.nextInt();
		System.out.println("Nhập y: ");
		int y = sc.nextInt();
		System.out.println("\nChia hết cho x, ko chia hết cho y: " + bst.division(x, y));
		System.out.println("Chiều cao của cây: " + bst.heightTree());
	}
}
