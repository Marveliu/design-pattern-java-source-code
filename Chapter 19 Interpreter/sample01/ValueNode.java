public class ValueNode implements Node
{
	// 终结
	private int value;
	
	public ValueNode(int value)
	{
		this.value=value;
	}
		
	public int interpret()
	{
		return this.value;
	}
}