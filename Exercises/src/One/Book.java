package One;

/**
 * Created by jc321013 on 18/09/16.
 */
public abstract class Book {

    String bookTitle = new String();
    double bookPrice;
    Book(String n) {
        bookTitle = n;
    }
    public String getTitle(){
        return bookTitle;
    }
    public double getPrice(){
        return bookPrice;
    }
    public abstract void setPrice();


}
