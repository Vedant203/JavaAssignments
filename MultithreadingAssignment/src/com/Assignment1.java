package com;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread even = new Thread(() -> {
            for (int i = 0; i <= 50; i += 2) {
                System.out.println("Even: " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        Thread odd = new Thread(() -> {
            for (int i = 1; i < 50; i += 2) {
                System.out.println("Odd: " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        even.start();
        odd.start();
	}

}
