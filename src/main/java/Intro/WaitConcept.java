package Intro;

public class WaitConcept {

	public static void main(String[] args) {


		
		//script -->sync-->  app(slow, server slowness, network)

		//sync: wait
		//1. static wait: Thread.sleep(10000): 10 secs: 2secs(found): it will be wait for 8 secs
		//2. dynamic wait : 10 secs: 2secs: 8 secs will be cancelled
		
		//2.a: Implicitly wait: global wait applied for all the elements
		//2.b: Explicitly wait: wait for a specific element 
		             //i: WebDriverWait (Class)
		             //ii: FluentWait (Class)
		
		//Wait(I) : until(); --> FluentWait(C): until(){} + other methods --> WebDriverWait(C)
		 //               |
		//        Method with no body
		
		
		
		
	}

}
