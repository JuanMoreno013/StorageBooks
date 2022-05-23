import java.time.LocalDate;
import java.util.ArrayList;

public class AddLetter implements OpeLetter {

    @Override
    public void add(ArrayList<Letter> let, String title, String author, int npages, LocalDate dateWrite) {
        if ( title == null || title.isBlank() || author == null || author.isBlank() || npages<0 || dateWrite.isBefore(LocalDate.now())){
            try {
                throw new BookException(" \n Fail! Your put something wrong, you can not put values null or empty ");

            } catch (BookException e) {
                System.out.println("Something went wrong! " + e.getMessage());
            }
        } else {
            let.add( new Letter(title, author,npages, dateWrite));
        }
    }

    @Override
    public void opRemov(ArrayList<Letter> let, int selectIndex) throws Exception {

    }
}

interface OpeLetter {

    public void add(ArrayList<Letter> let, String title, String author, int npages, LocalDate dateWrite);

    public void opRemov(ArrayList<Letter> let, int selectIndex) throws Exception;
}