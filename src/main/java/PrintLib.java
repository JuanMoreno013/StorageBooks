import java.util.List;

public class PrintLib<T> {

    public void displayAll(List<ItemOp> objtItem)
    {
        for ( ItemOp items: objtItem) {
            System.out.println(
                    //"\n Name: " + magazines.getTitle() +
                    (items.toString() + " \n "));

//            System.out.println();
        }
    }

//     <T> public void DisplaySingle(List<ItemOp> objtItem, T obj) {
//
//        if (objtItem.contains(obj))
//        {
//            for ( ItemOp items: objtItem) {
//                System.out.println(
//                        //"\n Name: " + magazines.getTitle() +
//                        (items.toString() + " \n "));
//
////            System.out.println();
//            }
//        }
//
//    }
}
