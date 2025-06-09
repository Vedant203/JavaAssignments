package com;

class QA {
    boolean questionAsked = false;

    public synchronized void askQuestion(String question) {
        while (questionAsked) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Student: " + question);
        questionAsked = true;
        notify();
    }

    public synchronized void giveAnswer(String answer) {
        while (!questionAsked) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Teacher: " + answer);
        questionAsked = false;
        notify();
    }
}

class Student implements Runnable {
    QA qa;
    Student(QA qa) { this.qa = qa; }
    public void run() {
        String[] questions = {"What is Java language?", "What does OOPs mean?", "What is multithreading?"};
        for (String q : questions) {
            qa.askQuestion(q);
        }
    }
}

public class Assignment4 implements Runnable {
	QA qa;
    
	public Assignment4(QA qa) {
		super();
		this.qa = qa;
	}

    public void run() {
        String[] answers = {"Java is an OOP oriented programming language.", "OOPs stands for Object Oriented Programming.", "Multithreading allows concurrent execution in JAVA."};
        for (String a : answers) {
            qa.giveAnswer(a);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QA qa = new QA();
        new Thread(new Student(qa)).start();
        new Thread(new Assignment4(qa)).start();
	}

}
