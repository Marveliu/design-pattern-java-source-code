class Singleton {  
    
    // IoDH
    //Initialization on Demand Holder

    private Singleton() {  
    }  

    // 静态内部类
    // 静态单例对象没有作为Singleton的成员变量直接实例化，因此类加载时不会实例化Singleton，
    private static class HolderClass {
        // 内部类创建单例对象
        private final static Singleton instance = new Singleton();  
    }  

    // 静态内部工厂方法
    // 第一次调用getInstance()时将加载内部类HolderClass，会初始化单例对象，Java虚拟机来保证其线程安全性
    public static Singleton getInstance() {  
        return HolderClass.instance;  
    }  

    public static void main(String args[]) {  
        Singleton s1, s2;   
        s1 = Singleton.getInstance();  
        s2 = Singleton.getInstance();  
        System.out.println(s1==s2);  
    }  
}