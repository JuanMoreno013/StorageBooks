import java.util.ArrayList;

public class RemoveMagazines implements OpeMag{


    @Override
    public void add(ArrayList<Megazine> megAd, String title, String author, int npages, int volume) {

    }

    @Override
    public void opRemov(ArrayList<Megazine> mgz, int selectIndex) throws Exception {
        if( mgz == null || mgz.size()==0 )
        {
            try {
                throw new BookException("There are no magazines in the library at present");
            } catch (BookException e) {
                System.out.println("Something went wrong!" + e.getMessage());
            }
        }
        else
        {
            remove(mgz, selectIndex);
        }
    }

    public void remove(ArrayList<Megazine> mgz, int selectIndex) {

        if (mgz.size() < selectIndex) {
            try {
                throw new BookException(" \n Fail! Your put something wrong, there is not enough books ");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "");
            }
        }else {
            mgz.remove(selectIndex);
        }

    }
}
