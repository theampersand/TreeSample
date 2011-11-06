import java.util.ArrayList;
import java.util.List;


public class BinaryTreeSample {
	
	Node rootNode = new Node();
	
	BinaryTreeSample()
	{
		
	}
	
	public void printNodes()
	{
		printNodes(rootNode);
	}
	
	private void printNodes(Node key)
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
	
	public void setRoot(Number value)
	{
		rootNode.value = value;
	}
	
	public void addNode(Number parentValue, Number newNodeValue)
	{		
		Node parent = new Node(parentValue);		
		Node target = findNode(parent, rootNode);
		Node newNode = new Node(newNodeValue);
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
		Node parent;
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
			if(this.children[0] == null)
			{
				this.children[0] = child;
				this.children[0].parent = this;
				return;
			}
			if(this.children[1] == null)
			{
				this.children[1] = child;
				this.children[1].parent = this;
				return;
			}
		}
		
		void printNode()
		{
			if(this.value != null)
			{
				System.out.println("Node: " + this + " (Parent=" + this.parent + ")");
			}
			if(children[0] != null)
			{
				System.out.println("Node.children[0]: "  + this.children[0]);
			}
			if(children[1] != null)
			{
				System.out.println("Node.children[1]: " + this.children[1]);
			}
			if(children[0] == null && children[1] == null)
			{
				System.out.println("Node is a leaf.");
			}
		}
		
		public String toString(){
			return String.valueOf(this.value);
		}
		
	}
}
