package juPrograms;
import static org.junit.Assert.*;
import org.junit.Test;
import exampleTest.unitj;

import exampleTest.unitj;

public class TESTprogram {

	
	@Test
	public void exampleTest() 
	{
       unitj obj= new unitj();
       int x=obj.example(5,5);
       assertEquals(10,x); //(ASSUMTION,ACTUAL)
       
	}

}
