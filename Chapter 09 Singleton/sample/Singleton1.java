public class Singleton1
{

	// 懒汉模式

	// 静态实例属性
	private static Singleton1 instance = null;
	
	private Singleton1()
	{	
	}
	
	// 生成器 synchronized
	public static synchronized Singleton1 getInstance()
	{
		if(instance==null)
		    instance=new Singleton1();	
		return instance;
	}
}