

public class Library {

    String title;
    String author;
    String publicationDate;

    Library(String title,
            String author,
            String publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public static void main(String[] args) {

        Library l1 = new Library("The Great Aashik", "William Shakesphere", "2030-01-09");
        String author=l1.getAuthor();
        System.out.println("The author is "+author);

    }

}
