public class AdvancedCipher extends CipherDecorator
{
	public AdvancedCipher(Cipher cipher)
	{
		super(cipher);
	}
	
	// 增强了源于的加密方法
	public String encrypt(String plainText)
	{
		String result=super.encrypt(plainText);
		result=mod(result);
		return result;
	}
	
	public String mod(String text)
	{
		String str="";
		for(int i=0;i<text.length();i++)
		{
			String c=String.valueOf(text.charAt(i)%6);
			str+=c;
		}
		return str;
	}
}
