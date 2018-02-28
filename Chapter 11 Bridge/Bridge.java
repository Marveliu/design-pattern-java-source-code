
//实现类
public interface Implementor
{
	public void operationImpl();
}

// 具体实现类
public class ConcreteImplementor implements Implementor
{
	public void operationImpl()
	{
		//具体实现
	}
}

// 抽象类
public abstract class Abstraction
{
	protected Implementor impl;
	
	public void setImpl(Implementor impl)
	{
		this.impl=impl;
	}
	
	public abstract void operation();
}

// 扩充抽象类
public class RefinedAbstraction extends Abstraction
{
	public void operation()
	{
		//代码
		impl.operationImpl();
		//代码
	}
}