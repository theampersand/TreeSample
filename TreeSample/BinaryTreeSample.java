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
	
	public void addNode(Node node)
	{		
		findPosition(node, rootNode);
	}
	
	private Boolean findPosition(Node newNode, Node key)
	{
		if(key.isFull()){			
			Node[] children = key.getChildren();
			
			for(Node child : children){
				if(child.isFull()){
					continue;
				}
				else{
					child.setChild(newNode);
				}
			}
		}
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
		
		void setValue(Number value)
		{
			this.value = value;
		}
		
		boolean isFull()
		{
			for(Node node : children){
				if(node == null){
					return false;
				}
			}
			return true;
		}
		
		Node[] getChildren()
		{
			return this.children;
		}
		
		
	}
}
