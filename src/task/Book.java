package task;

public class Book {

    private final Author author;
    private final String titleOfTheBook;
    Integer yearOfPublication;

    public Book(Author author, String titleOfTheBook, Integer yearOfPublication) {

        this.author = author;
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublication = yearOfPublication;

    }

    public Author getAuthor() {
        return author;
    }

    public String getTitleOfTheBook() {
        return titleOfTheBook;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleOfTheBook='" + titleOfTheBook + '\'' +
                ", author=" + author +
                ",yearOfPublication + yearOfPublication + " +
                '}';
    }
}
