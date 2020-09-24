package com.revature.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
	
	// Checked exceptions require either throws or
	// a try/catch/finally block
	public void checkedExceptionTryCatch() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// This code will always run regardless
			// of if an exception is thrown
		}
	}

	// You can use throws to kick exception handling
	// to the calling method
	public void checkedExceptionThrows() throws FileNotFoundException {
		FileReader fr = new FileReader("file.txt");
	}
	
	public void moreTryCatch() {
		try {
			FileReader fr = new FileReader("file.txt");
			fr.close();
		} 
		// Can chain catch blocks together
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		// Could also use inheritance property of Exception
		// to catch all exceptions
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// We can also throw exceptions
	public void throwAnException(int i) throws Exception {
		if (i > 10) {
			throw new Exception("i is too big.");
		}
	}
}
