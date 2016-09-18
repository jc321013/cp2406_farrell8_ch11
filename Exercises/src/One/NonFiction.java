package One;

/**
 * Created by jc321013 on 18/09/16.
 */
public class NonFiction extends Book
{
    public NonFiction(String bookTitle){
        super(bookTitle);
        setPrice();
    }
    public void setPrice()
    {
        super.bookPrice = 37.99;

    }
}
