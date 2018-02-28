public abstract class Pen
{

	// 抽象类

	protected Color color;
	public void setColor(Color color)
	{
		this.color=color;
	}
	public abstract void draw(String name);
} 