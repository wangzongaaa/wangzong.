
public class A {
	public static void main(String[] args) throws InterruptedException {
		abc t1=new abc();//创建线程
		abc t2=new abc();//创建线程
		abc t3=new abc(); //创建线程
		t1.setName("我是t1");
		t2.setName("我是t2");
		t3.setName("我是t3");
		for (int i = 0; i < 10; i++) {
			abc tt=new abc();
			tt.setName("拿弹弓打你家玻璃");
			tt.start();//启动线程
			tt.join();//设置最高级
		}
		t1.start(); //启动线程
		t1.join();  //设置优先级
		t2.start();//启动线程
		t2.join();//设置优先级
		t3.start();//启动线程
		t3.join();//设置优先级
		
		
	}
}
//创建线程
class abc extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("这是线程"+Thread.currentThread().getName());
	}
}