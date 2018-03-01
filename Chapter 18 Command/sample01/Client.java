public class Client
{
	public static void main(String a[])
	{
		// 命令
		AbstractCommand openCommand,closeCommand,changeCommand;
		
		openCommand = new TVOpenCommand();
		closeCommand = new TVCloseCommand();
		changeCommand = new TVChangeCommand();
		
		// 调用者
		Controller control = new Controller(openCommand,closeCommand,changeCommand);
		
		control.open();
		control.change();
		control.close();
	}
}