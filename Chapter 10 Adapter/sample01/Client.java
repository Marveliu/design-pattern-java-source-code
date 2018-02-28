public class Client
{
	public static void main(String args[])
	{
		// 类适配器
		Robot robot=(Robot)XMLUtil.getBean();
		robot.cry();
		robot.move();
	}
}