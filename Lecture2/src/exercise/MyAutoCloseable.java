package exercise;

import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable {

	public void saySomething() throws IOException {
		
		throw new IOException("Saysomething catch");
		//System.out.println("Saysomething Method");
	}
	
	@Override
	public void close() throws IOException {
		
		throw new IOException("Close catch");
		//System.out.println ("Close method");
	}

}
