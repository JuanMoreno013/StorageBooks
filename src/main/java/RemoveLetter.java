import java.time.LocalDate;
import java.util.ArrayList;

public class RemoveLetter implements OpeLetter{
    @Override
    public void add(ArrayList<Letter> let, String title, String author, int npages, LocalDate dateWrite) {

    }

    @Override
    public void opRemov(ArrayList<Letter> let, int selectIndex) throws Exception {
        if( let == null || let.size()==0 )
        {
            try {
                throw new BookException("There are no Letters in the library at present");
            } catch (BookException e) {
                System.out.println("Something went wrong!" + e.getMessage());
            }
        }
        else
        {
            remove(let, selectIndex);
        }
    }

    public void remove(ArrayList<Letter> let, int selectIndex) {

        if (let.size() < selectIndex) {
            try {
                throw new BookException(" \n Fail! Your put something wrong, there is not enough Letters to remove ");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "");
            }
        }else {
            let.remove(selectIndex);
        }

    }
}
