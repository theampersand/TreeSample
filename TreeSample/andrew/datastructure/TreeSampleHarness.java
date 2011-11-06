package andrew.datastructure;

import tree.BinaryTree;

public class TreeSampleHarness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree binaryTreeSample = new BinaryTree();
		binaryTreeSample.setRoot(7);
		binaryTreeSample.addNode(7, 10);
		binaryTreeSample.addNode(7, 9);
		binaryTreeSample.addNode(10, 2);
		binaryTreeSample.printNodes();
	}

}
