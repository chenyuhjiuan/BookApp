import java.util.Scanner;

public class Main {

    public static void main(String arg[]){

        Book book1= new Book("director","Mary","She published a book");
        book1.getDisplayText();

        Book book2= new Book(5.0,true);
        book2.getTotalrice(5);

        Book book3= new Book(15,false);
        book3.getTotalrice(5);

        System.out.println("Enter a number of book number");
        Scanner sc = new Scanner(System.in);
        int noBook =sc.nextByte();
        sc.nextLine();
        double total=book1.getTotalrice(noBook);
        System.out.println("Total price is "+total+".");

    }
}
