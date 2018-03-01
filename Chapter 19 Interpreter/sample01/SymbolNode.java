public abstract class SymbolNode implements Node
{
	// 非终结
	protected Node left;
	protected Node right;
	
	public SymbolNode(Node left,Node right)
	{
		this.left=left;
		this.right=right;
	}
}