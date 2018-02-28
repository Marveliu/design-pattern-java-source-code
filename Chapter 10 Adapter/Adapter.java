public class Adapter extends Target
{

	// 模板

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee)
	{
		this.adaptee=adaptee;
	}
	
	public void request()
	{
		adaptee.specificRequest();
	}
}