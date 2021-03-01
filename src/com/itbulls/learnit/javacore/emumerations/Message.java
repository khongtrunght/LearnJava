package com.itbulls.learnit.javacore.emumerations;

public enum Message {
	A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);
	
	private Priority pri;
	
	private Message(Priority pri) {
		this.pri = pri;
	}
	
	public Priority getPriority() {
		return this.pri;
	}
}
