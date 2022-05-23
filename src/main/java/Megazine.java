public class Megazine extends ItemOp{


    private String title;
    private int volume;



    public Megazine (String title, String author,  int pages,  int volume )
    {
        super(author, pages);
        this.title= title;
        this.volume=volume;

    }

    public String getTitle() {
        return title;
    }

    public int getVolume() {
        return volume;
    }

    public String toString() {
        return
                "\n Title: " + getTitle() +
                "\n Volume: " + getVolume() +
                 super.toString();
    }

}
