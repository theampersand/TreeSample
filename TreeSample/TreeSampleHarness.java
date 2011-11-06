
public class TreeSampleHarness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTreeSample binaryTreeSample = new BinaryTreeSample();
		binaryTreeSample.setRoot(7);
		binaryTreeSample.addNode(7, 10);
		binaryTreeSample.addNode(7, 9);
		binaryTreeSample.addNode(10, 2);
		binaryTreeSample.printNodes();
	}

}
