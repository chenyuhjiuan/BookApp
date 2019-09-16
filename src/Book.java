public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private Boolean isInStock;

    public Book() {
    }

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public Book(double price, Boolean isInStock) {
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

    public void getDisplayText(){

        System.out.println("The author is "+getAuthor()+".");
        System.out.println("The title is "+getTitle()+".");
        System.out.println(getDescription()+".");
    }

    public void getTotalrice (int number){

        if(getInStock()==true){
            double totalprice= number*getPrice();
            System.out.println("Total price is "+totalprice);

        }else{
            System.out.println("The price is not available now.");
        }


    }


}
