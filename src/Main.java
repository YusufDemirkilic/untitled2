import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        // Book nesnesinin nitelikleri ile kitapları oluşturduk
        books.add(new Book("Fareler ve İnsanlar", "John Steinbeck", 111, 1937));
        books.add(new Book("Zengin Baba, Yoksul Baba", "Robert Kiyosaki", 400, 1997));
        books.add(new Book("Alamut Kalesi", "Vladimir Bartol", 512, 1938));
        books.add(new Book("Simyacı", "Paulo Coelho", 184, 1998));
        books.add(new Book("Seker Portakalı", "José Mauro de Vasconcelos", 200, 1968));
        // kitapları kümeyi ters,ne sırayı çevirerek alfabetik olarak sıraladık
        for (Book num : books.reversed()) {
            System.out.println(num.getBookName() + "  yazar: " + num.getAuthorName());
        }
        System.out.println("\n");
        // Integer tipinde sayfa sayısını comparator ile istediğimiz sırlama ile büyükten küçüğe sıraladık
        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookPage() - o2.getBookPage();
            }
        });
        books2.add(new Book("Fareler ve İnsanlar", "John Steinbeck", 111, 1937));
        books2.add(new Book("Zengin Baba, Yoksul Baba", "Robert Kiyosaki", 400, 1997));
        books2.add(new Book("Alamut Kalesi", "Vladimir Bartol", 512, 1938));
        books2.add(new Book("Simyacı", "Paulo Coelho", 184, 1998));
        books2.add(new Book("Seker Portakalı", "José Mauro de Vasconcelos", 200, 1968));
            // sayfa sayınıs yazdırdık.
        for (Book i : books2.reversed()) {
            System.out.println("kitap isimi: " + i.getBookName() + " Kitap sayfası:  " + i.getBookPage() + "  Yayın tarihi: " + i.getRelaseDateOfBook());
        }
    }


}