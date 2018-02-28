public class Singleton2
{

	// 懒汉模式

	// 静态实例属性
	private static Singleton2 instance = null;
	
	private Singleton2()
	{	
	}
	
	// 生成器 部分synchronized
	public static  Singleton2 getInstance()
	{
		if(instance==null)
		synchronized (Singleton2.class) {  
            instance = new Singleton2();   
        }  
		return instance;
	}
}