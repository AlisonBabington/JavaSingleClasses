//Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper
// left by number of copies * number of pages.
//        Create a method to refill the printer paper.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.

public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaperNumber() {
        return this.paper;
    }

    public boolean print(int i, int i1) {
        int absoluteNumbers = i * i1;
                if (absoluteNumbers <= this.paper && absoluteNumbers <= this.toner) {
                    this.paper -= absoluteNumbers;
                    this.toner -= absoluteNumbers;
                    return true;
                }
                return false;
    }

    public int refillPaper(int i) {
        return this.paper = i;
    }

    public int getTonerNumber() {
        return this.toner;
    }
}
