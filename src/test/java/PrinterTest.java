import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

//    @Test
//    public int getSheetsLeft(){
//        assertEquals(20, printer.getSheetsLeft());
//    }

    @Test
    public void print(){
        printer.print(3, 10);
        assertEquals(20, printer.getSheetsLeft());
    }

    @Test
    public void reduceToner(){
        printer.getTonerVolume();
        assertEquals(70, printer.reduceToner(30));
    }
}
