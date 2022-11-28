import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
        This will be our actual program that we define author and his books
        In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

        Full name = Stefan Zweig
        Country = Austria
        Is still alive: No (28 November 1881 – 22 February 1942)
        Some of his books as listed below:

        BookName                            Genre           TotalPage
        Amok                                tale            189
        The Royal Game                      novella         53
        24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE



        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite author’s first name?");
        String authorsFName = scanner.nextLine();

        System.out.println("What is your favorite author’s last name?");
        String authorsLName = scanner.nextLine();

        System.out.println("Where is your favorite author from?");
        String country = scanner.nextLine();

        System.out.println("Is your favorite author alive? Y/N");
        boolean isAlive = scanner.nextLine().equals("y");

        if (isAlive){
            System.out.println("How old is your favorite author?");
            int age = scanner.nextInt();
            scanner.nextLine();
            Author author = new Author(authorsFName, authorsLName, country, isAlive, age);
        }
        Author author = new Author(authorsFName, authorsLName, country, isAlive);

        List<Book> books = new ArrayList<>();


        do {

            System.out.println("Would you like enter book information? (Y/N");
            boolean enterBook = scanner.nextLine().toUpperCase().startsWith("Y");

            if (!enterBook)break;

            System.out.println("What is the book name?");
            String bookName = scanner.nextLine();

            System.out.println("What is genre of the book?");
            String bookGenre = scanner.nextLine();

            System.out.println("How many pages does book have?");
            int totalPages = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(bookName, bookGenre, totalPages);

            author.books.add(book);


        }while (true);

        System.out.println("Author's information = " + author);

        if (!author.books.isEmpty()) System.out.println("Author's books are as listed below:");
        for (Book book : author.books) {
            System.out.println(book);
        }










    }
}
