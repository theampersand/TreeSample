package andrew.datastructure;

import andrew.datastructure.node.BinarySearchNode;
import andrew.datastructure.tree.BinarySearchTree;
import andrew.datastructure.tree.BinaryTree;

public class TreeSampleHarness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("Binary Tree Example");
//		BinaryTree binaryTree = new BinaryTree();
//		binaryTree.setRoot(7);
//		binaryTree.addNode(7, 10);
//		binaryTree.addNode(7, 9);
//		binaryTree.addNode(10, 2);
//		binaryTree.printNodes();
		
		System.out.println("Binary search tree example");
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.setRoot(7);
		binarySearchTree.addNode(10);
		binarySearchTree.addNode(1);
		binarySearchTree.addNode(2);
		binarySearchTree.addNode(8);
		binarySearchTree.printNodes();
	}

}
