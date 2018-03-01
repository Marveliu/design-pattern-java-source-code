public class Client
{
	public static void main(String a[])
	{
		BankTemplateMethod bank;

		// 模板选择
		bank=(BankTemplateMethod)XMLUtil.getBean();
		bank.process();
		System.out.println("---------------------------------------");
	}
}
