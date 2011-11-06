import java.util.ArrayList;
import java.util.List;


public class BinaryTreeSample {
	
	Node rootNode = new Node();
	
	BinaryTreeSample()
	{
		
	}
	
	public void setRoot(Node node)
	{
		this.rootNode = node;
	}
	
	public void addNode(Node parent, Node newNode)
	{		
		Node target = findNode(parent, rootNode);
		target.setChild(newNode);
	}
	
	private Node findNode(Node target, Node key)
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
	
	private class Node
	{
		Node[] children = new Node[2];
		Number value;
		
		Node()
		{
	
		}
			
		Node(Number value)
		{
			this.value = value;
		}
		
		void setChild(Node child)
		{
			for(Node node : children){
				if(node == null){
					node = child;
				}
			}
		}
		
		
	}
}
