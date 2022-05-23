import java.util.ArrayList;

public class AddMegazine implements OpeMag {


    @Override
    public void add(ArrayList<Megazine> megAd, String title, String author, int npages, int volume) {

        if ( title == null || title.isBlank() || author == null || author.isBlank() || npages<0 || volume<0){
            try {
                throw new BookException(" \n Fail! Your put something wrong, you can not put values null or empty ");

            } catch (BookException e) {
                System.out.println("Something went wrong! " + e.getMessage());
            }
        } else {
            megAd.add( new Megazine(title, author,npages, volume));
        }
    }

    @Override
    public void opRemov(ArrayList<Megazine> adb, int selectIndex) throws Exception {
    }
}

 interface OpeMag {

    public void add(ArrayList<Megazine> megAd, String title, String author, int npages, int volume);

    public void opRemov(ArrayList<Megazine> adb, int selectIndex) throws Exception;



}