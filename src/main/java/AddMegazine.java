import java.util.ArrayList;
import java.util.Objects;

public class AddMegazine implements OpeMag {


    @Override
    public void opera(ArrayList<Megazine> megAd) {

    }

    @Override
    public void add(ArrayList<Megazine> megAd, String title, String author, int npages, int volume) {
        // 1



        if ( title == null || title.isBlank()  ){
            try {
                throw new BookException(" \n Fail! Your put something wrong, the name of your book can not to be null ");

            } catch (BookException e) {
                System.out.println("Something went wrong! " + e.getMessage());
            }
        } else {
            megAd.add( new Megazine(title, author,npages, volume));


        }

    }

}

 interface OpeMag {
    public void opera(ArrayList<Megazine> megAd);

    public void add(ArrayList<Megazine> megAd, String title, String author, int npages, int volume);
}