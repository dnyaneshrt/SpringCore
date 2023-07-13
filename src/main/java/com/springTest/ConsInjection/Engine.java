package com.springTest.ConsInjection;

public class Engine {
private String name;
private String uniqueNumber;

public Engine(String name, String uniqueNumber) {
	super();
	this.name = name;
	this.uniqueNumber = uniqueNumber;
}

@Override
public String toString() {
	return "Engine [name=" + name + ", uniqueNumber=" + uniqueNumber + "]";
}

}
