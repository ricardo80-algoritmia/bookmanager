import models.Book;

public class BookRunner {

    public static void main(String[] args)
    {
        Book book1 = new Book();
        book1.setTitle("The art Of Computer Programing");

        Book book2 = new Book();
        book2.setTitle("Effective Java");



        System.out.println("O nome do livro e " + book1.getTitle());
        System.out.println("O nome do livro e " + book2.getTitle());
    }

}
