public class Client
{
	public static void main(String args[])
	{
		Transform camaro;
		camaro=new Car();
		camaro.move();
		System.out.println("-----------------------------");
	
		// 半透明装饰模式
		Airplane bumblebee=new Airplane(camaro);
		bumblebee.move();
		bumblebee.fly();
	}
}