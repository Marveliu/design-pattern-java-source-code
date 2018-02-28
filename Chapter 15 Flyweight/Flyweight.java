// 享元工厂
public class FlyweightFactory
{
	// 享元池
	private static HashMap flyweights = new HashMap();
	
	// 单例模式
	public static Flyweight getFlyweight(String key)
	{
		if(flyweights.containsKey(key))
		{
			return (Flyweight)flyweights.get(key);
		}
		else
		{
			Flyweight fw = new ConcreteFlyweight();
			flyweights.put(key,fw);
			return fw;
		}
	}
}

// 抽象享元类
public class Flyweight
{
	// 内部状态
	// 相当与一个指针指向享元池
	private String intrinsicState;
	
	public Flyweight(String intrinsicState)
	{
		this.intrinsicState=intrinsicState;
	}
	
	// 外部状态
	public void operation(String extrinsicState)
	{
	}	
}