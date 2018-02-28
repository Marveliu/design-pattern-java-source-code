public class Singleton
{

	// 懒汉模式

	// 静态实例属性
	private static Singleton instance = null;
	
	private Singleton()
	{	
	}
	
	// 生成器
	public static Singleton getInstance()
	{
		if(instance==null)
		    instance=new Singleton();	
		return instance;
	}
}