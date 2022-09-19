package task;

public class Main {


    public static void main(String[] args) {

    var author = new Author("Лев","Толстой");
    var author1 = new Author("Павел","Иванов");
    var author2 = new Author("Анна","Полетаева");
    var book = new Book(author,"Война и мир", 1987);
    var book1 = new Book(author1,"Радуга", 2007);
    var book2 = new Book(author2,"Неизвестность", 1999);

        System.out.println( book.getAuthor() +" "+ book.getTitleOfTheBook()+" "+book.getYearOfPublication());

       // Book book = new Book("Страна эльфов", 1971);
         //System.out.println(book);
        // System.out.println("book.yearOfPublication = " + book.getYearOfPublication());
        // book.setYearOfPublication(1975);
        //System.out.println("book.getYearOfPublication = " + book.getYearOfPublication());

       // Book book1 = new Book("Волшебство", 2013);
        //System.out.println("book.titleOfTheBook = " + book1.getTitleOfTheBook());
        //System.out.println("book.yearOfPublication = " + book1.getYearOfPublication());
        book1.setYearOfPublication(2022);
        System.out.println( book1.getAuthor() +" "+ book1.getTitleOfTheBook()+" "+book1.getYearOfPublication());
    }
}