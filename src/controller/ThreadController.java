package controller;

public class ThreadController extends Thread{
	private int thread;
	
	public ThreadController(int thread) {
		this.thread = thread;
	}
	
	@Override
	public void run() {
		retorna();
	}

	private void retorna() {
		System.out.println("ID: "+getId()+"\nTHREAD: "+thread);
	}
}
