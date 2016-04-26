package com.itcuties.android.apps.itcsqliteexample.sql;

public class Todo {

	private int id;
	private String text;
    private int priority;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public Integer getPriority() { return priority; }
    public void setPriority(Integer priority) {this.priority = priority;}
	
}
