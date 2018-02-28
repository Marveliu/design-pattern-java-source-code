import java.util.function.ToDoubleBiFunction;

public class Client
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
			TVFactory factory;
			// 根据xml决定要生成什么样的工厂类
			factory=(TVFactory)XMLUtil.getBean();
         	tv=factory.produceTV();
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
