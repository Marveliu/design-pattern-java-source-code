public class Client
{
	public static void main(String a[])
	{

		// 两个维度 Color,Pen

		Color color;
		Pen pen;
		
		color=(Color)XMLUtilPen.getBean("color");
		pen=(Pen)XMLUtilPen.getBean("pen");
		
		pen.setColor(color);
		pen.draw("鲜花");
	}
}