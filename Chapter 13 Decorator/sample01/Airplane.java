public class Airplane extends Changer
{
	// 具体构件类
	public Airplane(Transform transform)
	{
		super(transform);
		System.out.println("变成飞机！");
	}
	
	public void fly()
	{
		System.out.println("在天空飞翔！");	
	}
}