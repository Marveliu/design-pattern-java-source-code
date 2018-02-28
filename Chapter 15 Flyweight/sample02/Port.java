public class Port
{
	// 外部状态 端口
	// 内部状态 设备
	private String port;
	
	public Port(String port)
	{
		this.port=port;	
	}
	
	public void setPort(String port)
	{
		this.port=port;
	}
	
	public String getPort()
	{
		return this.port;
	}
}