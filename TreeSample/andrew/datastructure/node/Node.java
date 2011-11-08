package andrew.datastructure.node;

abstract public class Node{
	public Node[] children = new Node[2];
	public Node parent;
	public Number value;
	
	public Node()
	{

	}
		
	public Node(Number value)
	{
		this.value = value;
	}
	
	public void setChild(Node child)
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
	
	public void printNode()
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
