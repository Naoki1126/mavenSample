package hello;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class GreeterTest {
	private Greeter greeter = new Greeter();

	@Test
	public void greeterSayHello() {
		System.out.println("test execute");
		assertEquals(greeter.sayHello(), "Hello world!");
	}
	
	@Test
	public void greeterSayHello2() {
		System.out.println("test execute");
		assertEquals(greeter.sayHello(), "Hello world");
	}

}
