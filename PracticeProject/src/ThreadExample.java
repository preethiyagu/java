
public class ThreadExample {
	
final static String resource1="Preethi";
final static String resource2 = "Tanvi";
public static void main(String args[]){
Thread t1= new Thread(){
	public void run(){
		synchronized(resource1){
			System.out.println("Thread 1 locked resource1");
			try{
				Thread.sleep(500);
			}catch(Exception e){
				
			}
			synchronized(resource2){
				System.out.println("Thread 1 locked resource2");
			}
		}
		
	}
};
Thread t2= new Thread(){
	public void run(){
		synchronized(resource2){
			System.out.println("Thread 2 locked resource2");
			try{
				Thread.sleep(500);
			}catch(Exception e){
				
			}
			synchronized(resource1){
				System.out.println("Thread 2locked resource1");
			}
		}
		
	}
};
t1.start();
t2.start();

}
}
