# UTP_Projects
There u can find all Projects thats i use to work with 



**UTP 1**
Zadanie: tabela państw

Przedstawić w tabeli JTable państwa z pliku.

Plik powinien mieć następującą postać:

nazwa_kol1<TAB>nazwa_kol2<TAB> ....
nazwa_państwa1<TAB>stolica1<TAB> ludność1 ....

Na przykład:
Name    Capital    Population
Republic of Poland    Warsaw    38500
Chech Republic    Prague    10500 
Kingdom of Spain    Madrid    46599
Nalezy zwrócić uwagę, że pola są rozdzielane przez znak tabulacji, liczba ludności podawana jest w tysiącach. Plik powinien znajdować się w katalogu data projektu i mieć nazwę countries.txt

Dodatkowe wymagania:

kolumny tabeli mają mieć nazwy z pierwszego wiersza pliku
dane o ludności mają być traktowane jako liczby
i pokazywane w tabeli jak liczby
pokazać w tabeli flagi państw (wymaga modyfikacji pliku państw i dodanie kolumny, pokazującej flagę jako grafikę)
zapewnić pokazywanie wszystkich państw świata (jakich narzędzi użyjemy, żeby to łatwo zrobić)
wyróżnić komórki z liczbą ludności dla państw z ludnością > 20 mln czerwonym kolorem pisma
 
**UTP2**

 Napisać aplikację, która symuluje zakupy w kwiaciarni "samoobsługowej". W kwiaciarni są kwiaty, kwiaty mają swoje nazwy oraz kolory. Ceny kwiatów znajdują się w cenniku. Do kwiaciarni przychodzą klienci. Klienci mają imiona oraz dysponują jakimś zasobem pieniędzy. Wybierają kwiaty i umieszczają je na wózku sklepowym. Następnie płacą za zawartość wózka i przepakowują ją do pudełka (jakiegoś pudełka na kwiaty).

Dodawanie do programu nowych rodzajów kwiatów ma byc bardzo łatwe. Przy dodaniu nowego rodzaju kwiatów nie wolno modyfikować żadnych innych klas programu. Wymagania dodatkowe:

należy wykorzystać klasy abstrakcyjne i polimorfizm
należy zminimalizować kod klas ShoppingCart i Box
należy zdefiniować klasę PriceList jako singleton (możemy mieć zawsze tylko jeden cennik
Ważne uwagi. W kwiaciarni mogą być kwiaty, których zapomniano dodać do cennika. Wtedy przy płaceniu są one usuwane z naszego wózka. Może się okazać, że klient nie dysponuje odpowiednią kwotą pieniędzy aby zapłacić za całą zawartość wóżka. Wtedy z wózka usuwane są kwiaty, za które klient nie może zapłacić (ale nie pojedyńczo, tylko w kompletach np. po stefan.get(new Lilac(3)) usuwane są te trzy bzy na które Stefan nie ma pieniędzy). Warto zwrócić uwagę na odpowiednio zdefiniowanie metody toString() w niektórych klasach.

I na koniec: nie przejmujemy się tym, że np. róże mogą mieć wiele kolorów. Dla uproszczenia przyjęliśmy, że róże są czerwone itd.

**UTP3**

 zadanie
Zadanie: ceny przelotów - lambda1

Lista dest zawiera informacje o cenach przelotów w postaci napisów:

port_wylotu port_przylotu cena_w_EUR
Należy utworzyć listę wynikową, której elementy będą opisywać ceny przelotów do poszczególnych miejsc (tylko) z Warszawy w PLN i wypisać na konsoli jej kolejne elementy.

Aby rozwiązać to zadanie, należy utworzyć sparametryzowaną klasę ListCreator, zawierającą: statyczną metodę collectFrom (lista) metodę when metodę mapEvery które działają w taki sposób, że symboliczny zapis:

 collectFrom(list).when(lambda-1).mapEvery(lambda-2)
spowoduje utworzenie listy wynikowej, której elementy stanowią wybrane przez lambda-1 elementy listy list, przekształcone za pomocą podanego lambda-2.

Uwagi: w zadaniu nie wolno korzystać z własnych interfejsów, klasa ListCreator i jej metody powinny działać dla list (źródłowej i docelowej) elementów dowolnego typu.

Programma wyprowadzić na konsolę napisy:

to HAV - price in PLN: 5160
to DPS - price in PLN: 8600
to HKT - price in PLN: 4300
zadanie
Zadanie: ceny przelotów - lambda2

Lista dest zawiera informacje o cenach przelotów w postaci napisów:

port_wylotu port_przylotu cena_w_EUR
Należy utworzyć listę wynikową, której elementy będą opisywać ceny przelotów do poszczególnych miejsc (tylko) z Warszawy w PLN i wypisać na konsoli jej kolejne elementy, używając następującego programu:

public class Main {

  public static void main(String[] args) {
    // Lista destynacji: port_wylotu port_przylotu cena_EUR 
    List<String> dest = Arrays.asList(
      "bleble bleble 2000",
      "WAW HAV 1200",
      "xxx yyy 789",
      "WAW DPS 2000",
      "WAW HKT 1000"
    );
    double ratePLNvsEUR = 4.30;
    List<String> result = 
    /*<-- tu należy dopisać fragment
     * przy czym nie wolno używać żadnych własnych klas, jak np. ListCreator
     * ani też żadnych własnych interfejsów
     */

    for (String r : result) System.out.println(r);
  }
}
Program ma wyprowadzić na konsolę:

to HAV - price in PLN: 5160
to DPS - price in PLN: 8600
to HKT - price in PLN: 4300
UTP4
zadanie

          **Zadanie: Generics**

Stworzyć sparametryzowane interfejsy:

Selector - z metodą select, zwracającą true jesli argument spełnia warunek zapisany w metodzoe i false w przeciwnym razie
Mapper - z metodą map, będącą dowolną funkcją: argument -> wynik
oraz sparametryzowaną klasę ListCreator, zawierającą:
statyczną metodę collectFrom (lista)
metodę when
metodę mapEvery
które działają w taki sposób, że symboliczny zapis:

 collectFrom(list1).when(selektor).mapEvery(mapper)
spowoduje utworzenie listy wynikowej, której elementy stanowią wybrane przez selektor elementy listy list1, przekształacone za pomocą podanego mappera.

Gdy w metodzie test1 selektor wybiera z listy liczby < 10, a mapper zwraca liczbę-argument powiększoną o 10, to na konsoli powinniśmy zobaczyć: [11, 17, 19]

Gdy w metodzie test2 selektor wybiera z listy napisy, których długiość jest większa od 3 znakow, a mapper dzwraca dlugość przekazanego napisu, powiększoną o 10, to na konsoli zobaczymy: [14, 17]

**zadanie**
                                                          
Zadanie: klasa Maybe

Zdefiniować klasę Maybe o następujących właściwościach.

Obiekty Maybe reprezentują kontenery, które mogą zawierać lub nie pojedynczą wartość. Motywacją do wprowadzenia takiej konstrukcji jest ułatwienie programowania w sytuacji, gdy zmienna może mieć wartość null, szczególnie kiedy wymagane jest jej dalsze bezpieczne przetwarzanie (na przykład za pomocą lambda-wyrażeń, oznaczających jakieś funkcje). Bezpieczne - to znaczy takie, które nie powoduje wyjątku NullPointerException.

Obiekty typu Maybe zawierają jakąś wartość lub są puste (nigdy nie powinny mieć wartości null). W klasie Maybe zdefiniować następujące metody:

Maybe.of(x) - ta metoda statyczna zwraca obiekt Maybe, „opakowujący” wartość x, dowolnego typu referencyjnego.
void ifPresent(Consumer cons) - jeżeli w obiekcie Maybe znajduje się wartość, wykonywana jest operacja cons z tą wartością jako argumentem, w przeciwnym razie - gdy obiekt Maybe jest pusty - nic się nie dzieje.
Maybe map(Function func) - jeżeli w obiekcie jest wartość, wykonywana jest funkcja func z tą wartością jako argumentem i zwracany jest jej wynik „zapakowany” w nowy obiekt klasy Maybe (to opakowanie jest niezbędne, bo wynik mógłby być null, a tego chcemy uniknąć w ewentualnym dalszym przetwarzaniu; jeśli wynikiem funkcji jest null, zwracany jest pusty obiekt klasy Maybe).
T get() zwraca zawartość obiektu Maybe, ale jeśli jest on pusty, powinna zgłosić wyjątek NoSuchElementException. boolean isPresent() - zwraca true jeśli w obiekcie Maybe zawarta jest wartośc, a false - gdy jest on pusty
T orElse(T defVal) - zwraca zawartość obiektu Maybe lub domyślną wartosć defVal, jeśli obiekt Maybe jest pusty.
Maybe filter(Predicate pred) - zwraca to Maybe, jeśli spełniony jest warunek pred lub to Maybe jest puste; zwraca puste Maybe, jeśli warunek pred jest niespełniony.
UTP5
zadanie
Zadanie badawczo-analityczne:

klasa InputConverter - bezpieczeństwo fazy wykonania

Zobaczmy przykładowy fragment z poprzedniego zadania:

  public static void main(String[] args) {
    /*
     *  definicja operacji w postaci lambda-wyrażeń:
     *  - flines - zwraca listę wierszy z pliku tekstowego
     *  - join - łączy napisy z listy (zwraca napis połączonych ze sobą elementów listy napisów)
     *  - collectInts - zwraca listę liczb całkowitych zawartych w napisie
     *  - sum - zwraca sumę elmentów listy liczb całkowitych
     */

    String fname = System.getProperty("user.home") + "/LamComFile.txt"; 
    InputConverter<String> fileConv = new InputConverter<>(fname);
    List<String> lines = fileConv.convertBy(flines);
    String text = fileConv.convertBy(flines, join);
    List<Integer> ints = fileConv.convertBy(flines, join, collectInts);
    Integer sumints = fileConv.convertBy(flines, join, collectInts, sum);

    System.out.println(lines);
    System.out.println(text);
    System.out.println(ints);
    System.out.println(sumints);

    List<String> arglist = Arrays.asList(args);
    InputConverter<List<String>> slistConv = new InputConverter<>(arglist);  
    sumints = slistConv.convertBy(join, collectInts, sum);
    System.out.println(sumints);
  }
Przy powierzchownej konstrukcji klasy InputConverter i metody convertBy następujący fragment:

 slistConv.convertBy(collectInts, sum); 
spowoduje powstanie wyjątku ClassCastException

Zadania badawcze: jak temu zaradzić w fazie wykonania programu, tak by uzyskiwać operacyjne wyniki (i nigdy NullPointerException)

To wymaga odpowiedniej definicji klasy InputConverter oraz ew. modyfikacji klasy Main (są tu dozwolone) .

zadanie
Zadanie badawcze Przekazywanie wyjątków kontrolowanych z lambda-wyrażeń do obsługi w bloku otaczającym lambda.

Uwaga: w programie nie wolno definiować żadnych własnych interfejsów (za wyjątkiem być może rozszerzeń interfejsów z pakietu java.util.function), a więc operacje flines, join, itp. muszą opierać się na gotowych interfejsach funkcyjnych z pakietu java.util.function lub ich rozszerzeniach.

Operacja flines zawiera odczyt pliku, zatem może powstać wyjątek IOException. Wymagane jest, aby tę operację zdefiniowac jako lambda-wyrażenie. Ale z lambda wyrażeń, opierających się na interfejsach funkcyjnych z pakietu java.util.function, nie możemy przekazać obsługi wyjatków do otaczającego bloku. I wobec tego musimy pisać w definicji flines try { } catch { } Jak spowodować, aby nie było to konieczne i w przypadku powstania wyjątku IOException zadziałała klauzula throws metody main ?

zadanie
Zadanie. Lambda-wyrażenia dla niefunkcyjnych interfejsów ? Spowodować, by w programie, po naciśnięciu klawisza myszki na przycisku b na konsoli zostało wypisane "ok".

zadanie
 

 **Zadanie: dodatkowe operacje na listach**

Stworzyć klasę XList, dostarczającą dodatkowych możliwości tworzenia list i operowania na nich. W klasie powinny znaleźć się odpowiednie konstruktory oraz statyczne metody of, umożliwiające tworzenie obiektów XList z innych kolekcji, tablic oraz argumentów podawanych przez przecinki.

Dodatkowo pomocnicze metody do tworzenia xlist z napisów:

ofChars(napis) - zwraca x-listę znaków napisu,
ofTokens(napis, [ sep ]) - zwraca x-listę symboli napisu, rozdzielonych separatorami z sep (jesśi brak - to białymi znakami).
Oprócz tego dostarczyć metod:

union(dowolna_kolekcja) - zwraca nową x-list z dołączaną do tej x-list zawartością kolekcji,
diff(dowolna_kolekcja) - zwraca x-list zawierającą te elementy tej x-list, które nie występują w kolekcji,
unique() - zwraca nową x-list, która zawiera wszystkie niepowtarzające się elementy tej x-list
combine() - zwraca x-listę list-kombinacji elementów z poszczególnych kolekcji, będących elementami tej x-listy
collect(Function) - zwraca nową x-listę, której elemenatmi są wyniki funkcji stosowanej wobec elementów tej x-listy,
join([sep]) - zwraca napis, będący połączeniem elementów tej x-listy, z ewentualnie wstawionym pomiędzy nie separatorem,
forEachWithIndex(konsumer_z_dwoma argumentami: element, index) - do iterowania po liście z dostępem i do elementów i do ich indeksów.
