public class CipherAdapter extends DataOperation
{

	// target DataOperation
	// adaptee Caesar

	private Caesar cipher;
	
	public CipherAdapter()
	{
		cipher=new Caesar();
	}
	
	public String doEncrypt(int key,String ps)
	{
		return cipher.doEncrypt(key,ps);
	}
}