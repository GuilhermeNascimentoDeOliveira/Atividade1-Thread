package controller;

public class ati1 extends Thread{
	private int idThread;
	
	public ati1(int idThread) {
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		System.out.println("ID: " + getId() + ", Progresso: " + idThread);
		
	}
	
}
