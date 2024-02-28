# WidgetAB3  Dependency Injection POC

# comment out tight coupling code add your code to do DI

public class WidgetA {
	
   private WidgetB b;
   
   //Tight Coupling <br>
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
