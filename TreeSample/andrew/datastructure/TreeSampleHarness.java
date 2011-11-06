package andrew.datastructure;

import tree.BinaryTree;

public class TreeSampleHarness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRoot(7);
		binaryTree.addNode(7, 10);
		binaryTree.addNode(7, 9);
		binaryTree.addNode(10, 2);
		binaryTree.printNodes();
	}

}
