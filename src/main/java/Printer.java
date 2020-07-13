public class Printer {
    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public int getTonerVolume(){
        return tonerVolume;
    }

    public void print(int pages, int copies) {
        if (sheetsLeft > pages * copies) {
            sheetsLeft = sheetsLeft - pages * copies;
        }
    }


    public int reduceToner(int pages) {
//        getTonerVolume();
        return tonerVolume - pages;
    }
}
