package andrew.datastructure.node;

public class BinaryNode implements Node {

	public BinaryNode[] children = new BinaryNode[2];
	public Node parent;
	public Integer value;
	
	public BinaryNode(){
		super();
	}
	
	public BinaryNode(Integer value)
	{
		this.value = value;
	}
	
	
	public void setChild(Node child)
	{
		if(this.children[0] == null)
		{
			this.children[0] = (BinaryNode) child;
			this.children[0].parent = this;
			return;
		}
		if(this.children[1] == null)
		{
			this.children[1] = (BinaryNode) child;
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
