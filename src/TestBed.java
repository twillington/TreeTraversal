
public class TestBed {

	BinaryTreeNode root;
	BinaryTreeTraversal btt = new BinaryTreeTraversal();
	
	public static void main(String args[])
	{
		TestBed tb = new TestBed();
	}
	
	public TestBed()
	{
		generateTree();	
		generateTree2();	
		generateTree3();	
	}
	
	public void generateTree()
	{
		System.out.println("Tree");
		BinaryTreeNode t = new BinaryTreeNode(new BinaryTreeNode(null,null,"A"),new BinaryTreeNode(null,null,"B"), "+");
		root = t;
		System.out.print("In Order : ");
		btt.inOrder(root);	
		System.out.println(" ");
		System.out.print("Pre Order : ");
		btt.preOrder(root);
		System.out.println(" ");
		System.out.print("Post Order : ");		
		btt.postOrder(root);
		System.out.println(" ");
		System.out.print("Level Order : ");
		btt.levelOrder(root);	
		System.out.println(" ");
	}
	
	public void generateTree2()
	{
		System.out.println("Tree2");
		BinaryTreeNode t = new BinaryTreeNode(new BinaryTreeNode(new BinaryTreeNode(null,null,"A"),new BinaryTreeNode(null,null,"B"),"-"),new BinaryTreeNode(null,null,"C"), "/");
		root = t;
		System.out.print("In Order : ");
		btt.inOrder(root);	
		System.out.println(" ");
		System.out.print("Pre Order : ");
		btt.preOrder(root);
		System.out.println(" ");
		System.out.print("Post Order : ");		
		btt.postOrder(root);
		System.out.println(" ");
		System.out.print("Level Order : ");
		btt.levelOrder(root);
		System.out.println(" ");
	}
	
	public void generateTree3()
	{
		System.out.println("Tree3");
		BinaryTreeNode t = new BinaryTreeNode(new BinaryTreeNode(new BinaryTreeNode(null,null,"A"),new BinaryTreeNode(null,null,"B"),"*"),new BinaryTreeNode(new BinaryTreeNode(null,null,"C"),new BinaryTreeNode(new BinaryTreeNode(null,null,"D"),new BinaryTreeNode(null,null,"E"),"^"),"^"), "/");
		root = t;
		System.out.print("In Order : ");
		btt.inOrder(root);	
		System.out.println(" ");
		System.out.print("Pre Order : ");
		btt.preOrder(root);
		System.out.println(" ");
		System.out.print("Post Order : ");		
		btt.postOrder(root);
		System.out.println(" ");
		System.out.print("Level Order : ");
		btt.levelOrder(root);
		System.out.println(" ");
	}
}
