package BooksList;

import java.util.*;


//Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
// Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
// Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
// Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.
//Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
public class Book implements Comparable<Object>{
    private String bookName,authorName;
    private Integer bookPage,relaseDateOfBook;
    @Override
    public int compareTo(Object o) {
        o=this.bookName;
        Set<Object> books=new TreeSet<>();

        books.add("Fareler ve İnsanlar,John Steinbeck");
        books.add("Zengin Baba, Yoksul Baba,Robert Kiyosaki");
        books.add("Alamut Kalesi,Vladimir Bartol");
        books.add("Simyacı, Paulo Coelho");
        books.add("Seker Portakalı, José Mauro de Vasconcelos");


        Iterator<Object> booksList= books.iterator();

        while (booksList.hasNext()){
            System.out.println(booksList.next());
        }
        return 0;
    }


    public Integer getRelaseDateOfBook() {
        return relaseDateOfBook;
    }

    public void setRelaseDateOfBook(Integer relaseDateOfBook) {
        this.relaseDateOfBook = relaseDateOfBook;
    }

    public Integer getBookPage() {
        return bookPage;
    }

    public void setBookPage(Integer bookPage) {
        this.bookPage = bookPage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
