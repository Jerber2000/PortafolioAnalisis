import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.rmi.server.ExportException;

import static org.junit.Assert.*;


public class ModelDuckTest {

    private  Duck d;
    private ByteArrayOutputStream out;

    public ModelDuckTest (){

    }

    @Before
    public void setOut() throws Exception{

        d = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.out.println(new PrintStream(out));
    }

    @Test
    public void testDisplay(){
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato"));

    }
    @Test
    public  void testPerfomrSound(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("quack"));
    }
    @Test
    public  void testToString(){
        
    }
}