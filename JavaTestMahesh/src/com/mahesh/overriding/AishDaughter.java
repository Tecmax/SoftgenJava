package com.mahesh.overriding;

class Amithab {
	public void dialogues() {
		System.out.println("Dialogues method of Amithab class");
	}

	public void acting() {
		System.out.println("Acting() method of Amithab class");
	}
}

class Abhishek extends Amithab {
	public void dialogues() {
		System.out.println("Dialogues() method of Abhishek class");
	}

	public void acting() {
		System.out.println("Acting() method of Abhishek class");
	}
	public void dance() {
		System.out.println("dance() method of Abhishek class");
	}
}

class AishDaughter extends Abhishek {
	public void acting() {
		System.out.println("AishDaug method of Acting class");
	}

	public void emotions() {
		System.out.println("xyz() method of Child class");
	}
	
	public void baby() {
		System.out.println("baby() method of Child class");
	}
	public static void main(String args[]) {
		Amithab obj = new AishDaughter();
		obj.dialogues();
		obj.acting();
//		obj.dance();
//		obj.baby();
//		obj.emotions();
	}
}
