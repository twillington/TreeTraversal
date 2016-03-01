
public class BinaryTreeNode {

	private String value;
	private BinaryTreeNode leftChild, rightChild;
	
	public BinaryTreeNode(BinaryTreeNode leftChild, BinaryTreeNode rightChild, String value)
	{
		this.setValue(value);
		this.setLeftChild(leftChild);
		this.setRightChild(rightChild);
	}

	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
