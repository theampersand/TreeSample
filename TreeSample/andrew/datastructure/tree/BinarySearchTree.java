package andrew.datastructure.tree;

import andrew.datastructure.node.BinaryNode;
import andrew.datastructure.node.BinarySearchNode;

public class BinarySearchTree{
	BinarySearchNode rootNode = new BinarySearchNode();
	
	public void setRoot(Integer rootValue)
	{
		rootNode.value = rootValue;
	}
	
	public void printNodes()
	{
		printNodes(rootNode);
	}
	
	private void printNodes(BinarySearchNode key)
	{
		if(key.value != null)
		{
			key.printNode();
		}
		if(key.children[0] != null)
		{
			printNodes(key.children[0]);
		}
		if(key.children[1] != null)
		{
			printNodes(key.children[1]);
		}
	}
	
	public void addNode(Integer newNodeValue)
	{
		BinarySearchNode newNode = new BinarySearchNode(newNodeValue);
		addNode(newNode, rootNode);
	}
	
	private void addNode(BinarySearchNode node, BinarySearchNode key)
	{
		if(node.value < key.value)
		{
			if(key.children[0] == null)
			{
				key.children[0] = node;
				return;
			}
			else
			{
				addNode(node, key.children[0]);
			}
		}
		if(node.value > key.value)
		{
			if(key.children[1] == null)
			{
				key.children[1] = node;
				return;
			}
			else
			{
				addNode(node, key.children[1]);
			}
					
		}

	}
}
