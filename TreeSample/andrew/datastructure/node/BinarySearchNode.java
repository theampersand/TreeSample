package andrew.datastructure.node;

public class BinarySearchNode extends BinaryNode {

	public BinarySearchNode[] children = new BinarySearchNode[2];
	
	public BinarySearchNode()
	{
		super();
	}
	public BinarySearchNode(Integer value)
	{
		super(value);
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
}
