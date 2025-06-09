package com;

public class Assignment2 extends Thread {
	
	@Override
	public void run() {
        while (true) {
            java.time.LocalTime now = java.time.LocalTime.now();
            System.out.println("Time: " + now);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment2().start();
	}

}
