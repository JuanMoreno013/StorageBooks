
import java.util.Collection;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Search <E extends ItemOp>{


    public int countElem(Collection <E> element)
    {
       return element.size();
    }
    public Optional<E> searchName(String title, Collection<E> element)
    {
        if (title==null)
            throw new NullPointerException();

        if (title.isEmpty())
            throw new IllegalArgumentException();

        return element.stream()
                .filter(entry -> title.equals(entry.getTitle()))
                .findFirst();
    }

    public Optional<E> searchElement (Object obj, Collection<E> elements)
    {

        if (obj==null)
            throw new NullPointerException();

        Predicate<ItemOp> itemPredicate = d-> obj.equals(d.getTitle());
        Predicate<ItemOp> namePredicate = d-> obj.equals(d.getAuthor());
        Predicate<ItemOp> pagePredicate = d-> obj.equals(d.getPages());
        Predicate<ItemOp> datePredicate = d-> obj.equals(d.getDateWrite());



        return elements.stream()
                .filter(itemPredicate.or(namePredicate).or(pagePredicate).or(datePredicate))
                .collect(Collectors.toList())
                .stream()
                .findFirst();
    }


    public List<E> searchFullElements (Object obj, Collection<E> elements)
    {

        if (obj==null)
            throw new NullPointerException();

        if (obj.toString().isBlank())
            throw new IllegalArgumentException();



        Predicate<ItemOp> titleActive = e -> obj.equals(e.getTitle());
        Predicate<ItemOp> namePredicate = d-> obj.equals(d.getAuthor());
        Predicate<ItemOp> datePredicate = d-> obj.equals(d.getDateWrite());
        Predicate<ItemOp> pagePredicate = d-> obj.equals(d.getPages());

        return elements.stream()
                .filter(titleActive.or(namePredicate).or(pagePredicate).or(datePredicate))
                .collect(Collectors.toList());

    }

}
