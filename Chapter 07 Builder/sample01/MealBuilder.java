public abstract class MealBuilder
{
	// builder

	protected Meal meal=new Meal();
	public abstract void buildFood();
	public abstract void buildDrink();
	public Meal getMeal()
	{
		return meal;
	}
}