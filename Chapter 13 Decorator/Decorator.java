// 抽象装饰类
public class Decorator extends Component
{
	// 抽象构件成员变量
	private Component component;
	
	public Decorator(Component component)
	{
		this.component=component;
	}
	
	public void operation()
	{
		component.operation();
	}
}

// 具体装饰类
public class ConcreteDecorator extends Decorator
{
	public ConcreteDecorator(Component component)
	{
		super(component);
	}
	
	public void operation()
	{
		super.operation();
		addedBehavior();
	}
	
	public void addedBehavior()
	{
		
	}
}