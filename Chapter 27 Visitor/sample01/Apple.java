public class Apple implements Product
{

  // element

  public void accept(Visitor visitor)
  {
      visitor.visit(this);
  }	
}