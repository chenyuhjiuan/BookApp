public class Main {

    public static void main(String arg[]){

        Book book1= new Book("director","Mary","She published a book");
        book1.getDisplayText();

        Book book2= new Book(5.0,true);
        book2.getTotalrice(5);

        Book book3= new Book(15,false);
        book3.getTotalrice(5);
    }
}
