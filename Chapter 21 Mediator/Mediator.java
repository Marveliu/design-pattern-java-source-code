public abstract class Mediator
{
	// mediator

	// colleague storage
	protected ArrayList colleagues;
	public void register(Colleague colleague)
	{
		colleagues.add(colleague);
	}
	
	public abstract void operation();
	
}

public abstract class Colleague
{
	// refer mediator
	protected Mediator mediator;
	
	public Colleague(Mediator mediator)
	{
		this.mediator=mediator;
	}
	
	public abstract void method1();
	
	public abstract void method2();
}

public class ConcreteMediator extends Mediator
{
	
	public void operation()
	{
		((Colleague)(colleagues.get(0))).method1();
		
	}
}

public class ConcreteColleague extends Colleague
{
	public ConcreteColleague(Mediator mediator)
	{
		super(mediator);
	}
	
	// insider method
	public void method1()
	{
	}
	
	// dependency method
	public void method2()
	{
		mediator.operation1();
	}
}