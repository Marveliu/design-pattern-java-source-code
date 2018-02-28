public class Singleton
{

	// 饿汉模式

	// 静态实例属性，直接被实例化
	private static final Singleton instance = new Singleton();
	
	private Singleton()
	{	
	}
	
	// 生成器
	public static Singleton getInstance()
	{
		return instance;
	}
}