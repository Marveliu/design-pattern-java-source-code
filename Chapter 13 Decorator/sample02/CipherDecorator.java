public class CipherDecorator implements Cipher
{
	// 抽象装饰类
	private Cipher cipher;
	
	public CipherDecorator(Cipher cipher)
	{
		this.cipher=cipher;
	}
	
	public String encrypt(String plainText)
	{
		return cipher.encrypt(plainText);
	}
}
