import java.util.EventListener;

//Abstract Observer
public interface LoginEventListener extends EventListener
{
	// 观察者类
	public void validateLogin(LoginEvent event);
}