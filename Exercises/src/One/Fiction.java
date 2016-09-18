package One;

/**
 * Created by jc321013 on 18/09/16.
 */
public class Fiction extends Book
{
    public Fiction(String bookTitle){
        super(bookTitle);
        setPrice();
    }
    public void setPrice()
    {
        super.bookPrice = 24.99;

    }
}
