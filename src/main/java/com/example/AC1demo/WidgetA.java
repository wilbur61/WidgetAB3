package com.example.AC1demo;

import org.springframework.stereotype.Component;

@Component
public class WidgetA {
	

   private WidgetB b;
   
   //Tight Coupling
   public WidgetA(){
    	this.b = new WidgetB();
    	b.doSomething();
   }

    // dependency injection   
    // YOUR CODE HERE

	public String doSomething() {
		return("CALLED doSomething() in WidgetA");
	}

}