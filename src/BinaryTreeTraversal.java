
public class BinaryTreeTraversal {

	public void preOrder(BinaryTreeNode t)
	{
		if (t !=null)
		{
			visit(t);
			preOrder(t.getLeftChild());
			preOrder(t.getRightChild());
		}
	}
	
	public void inOrder(BinaryTreeNode t)
	{
		if (t != null)
		{
			inOrder(t.getLeftChild());
			visit(t); 
			inOrder(t.getRightChild());			
		}
	}
	
	public void postOrder(BinaryTreeNode t)
	{
		if (t != null)
		{
			inOrder(t.getLeftChild());
			inOrder(t.getRightChild());	
			visit(t);
		}
	}

	
	   public void levelOrder(BinaryTreeNode t)
	   {
	      ArrayQueue q = new ArrayQueue();
	      while (t != null) 
	      {
	         // call the method visit() here
	    	  	visit(t);
	         // put t's children on queue
	         if (t.getLeftChild() != null) 
	            q.put(t.getLeftChild());
	         if (t.getRightChild() != null)
	            q.put(t.getRightChild());
	   
	         // get next node to visit
	         t = (BinaryTreeNode) q.remove();
	      }
	    }
	
	
	public void visit(BinaryTreeNode t)
	{
		System.out.print(t.getValue());
	}
	
	
}
