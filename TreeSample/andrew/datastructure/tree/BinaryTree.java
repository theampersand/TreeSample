package andrew.datastructure.tree;
import java.util.ArrayList;
import java.util.List;

import andrew.datastructure.node.BinaryNode;
import andrew.datastructure.node.Node;



public class BinaryTree {
	
	BinaryNode rootNode = new BinaryNode();
	
	public BinaryTree()
	{
		
	}
	
	public void printNodes()
	{
		printNodes(rootNode);
	}
	
	private void printNodes(BinaryNode key)
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
	
	public void setRoot(Integer value)
	{
		rootNode.value = value;
	}
	
	public void addNode(Integer parentValue, Integer newNodeValue)
	{		
		BinaryNode parent = new BinaryNode(parentValue);		
		BinaryNode target = (BinaryNode) findNode(parent, rootNode);
		BinaryNode newNode = new BinaryNode(newNodeValue);
		target.setChild(newNode);
	}
	
	private Node findNode(BinaryNode target, BinaryNode key)
	{
		if(key.value == target.value)
		{
			return key;
		}
		if(key.children[0] != null && findNode(target, key.children[0]) != null)
		{
			return key.children[0];
		}
		if(key.children[1] != null & findNode(target, key.children[1]) != null)
		{
			return key.children[1];
		}
		else
			return null;
	}
	
}
