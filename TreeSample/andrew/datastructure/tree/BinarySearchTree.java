package andrew.datastructure.tree;

import andrew.datastructure.node.BinarySearchNode;

public class BinarySearchTree extends BinaryTree {
	BinarySearchNode rootNode = new BinarySearchNode();
	
	public void setRoot(Number rootValue)
	{
		rootNode.value = rootValue;
	}
	
	public void addNode(Number newNodeValue)
	{
		BinarySearchNode newNode = new BinarySearchNode(newNodeValue);
	}
}
