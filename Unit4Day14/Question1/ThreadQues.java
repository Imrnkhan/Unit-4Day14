package Unit4Day14.Question1;

class ThreadA extends Thread{
	@Override
	public void run(){
		int total = 1;
		for(int i=1;i<=10;i++){
			total*=i;
			System.out.println(i);
		}
		System.out.println("Product :"+ total);
	}
}
