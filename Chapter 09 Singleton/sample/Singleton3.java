public class Singleton3
{

	// 懒汉模式，双重锁

	// 静态实例属性
	private static Singleton3 instance = null;
	
	private Singleton3()
	{	
	}
	
	// 生成器 
	public static  Singleton3 getInstance()
	{
		//第一重判断,防止A和B同时进入，A实例化之后，B不知道情况继续实例化  
		if (instance == null) {  
			//锁定代码块  
			synchronized (Singleton3.class) {  
				//第二重判断  
				if (instance == null) {  
					instance = new Singleton3(); //创建单例实例  
				}  
			}  
		}  
		return instance;
	}
}