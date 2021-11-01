/**
 *
 *  @author Stanczewski Patryk S22901
 *
 */

package zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListCreator <T, S> {
    private List<T> lista = new ArrayList<>();



    // tworzenie obiektu typu T
    public static <T,S> zad1.ListCreator collectFrom(List<T> x)
    {
        zad1.ListCreator<T,S> tmp = new zad1.ListCreator<>();
        tmp.lista= x;
        return tmp;
    }

    // usuwanie z listy elementy nie spelniajace wymagan
    public zad1.ListCreator<T,S> when(Predicate<T> x)
    {
        ListCreator <T,S> arr=new ListCreator<>();
        // usuwam z listy select
        for(int i = 0; i < lista.size(); i++)
        {
            T element = lista.get(i);
            if(x.test(element))
            {
                arr.lista.add(lista.get(i));
            }
        }
        return arr;
    }

    //
    public List<S> mapEvery(Function<T, S> mapInt)
    {
        List<S> listaZwracana = new ArrayList<S>();
        for(int i = 0; i < lista.size(); i++)
        {
            // pobieram element listy
            T element = lista.get(i);

            // przy okazji typ zmienia sie z T na S
            S elementZmodyfikowany = mapInt.apply(element);

            // zapisuje nowa wartosc w miejsce starej na liscie
            listaZwracana.add(elementZmodyfikowany);
        }
        return listaZwracana;
    }
}

