//Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Create a method to refill the printer paper.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20, 50);
    }

    @Test
    public void hasPaperNumber() {
        assertEquals(20, printer.getPaperNumber());
    }

    @Test
    public void canPrintPagesAndCopies() {
        assertEquals(true, printer.print(2, 6));
        assertEquals(8, printer.getPaperNumber());
        assertEquals(38, printer.getTonerNumber());
    }

    @Test
    public void canStopPrintPagesAndCopies() {
        assertEquals(false, printer.print(30, 2));
    }

    @Test
    public void canRefillPaper() {
        assertEquals(20, printer.refillPaper(20));
    }

}
