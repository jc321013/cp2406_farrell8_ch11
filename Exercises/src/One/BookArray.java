package One;

/**
 * Created by jc321013 on 18/09/16.
 */
public class BookArray {
    public static void main(String[] args){

        Book book[] = new Book[10];
        int x;
        book[0] = new Fiction("2666");
        book[1] = new Fiction("All about Love");
        book[2] = new Fiction("Desert Solitaire");
        book[3] = new NonFiction("Disgrace");
        book[4] = new NonFiction("Geek Love");
        book[5] = new NonFiction("Infinite Jest");
        book[6] = new NonFiction("Gilead");
        book[7] = new NonFiction("Giovanni's Room");
        book[8] = new NonFiction("The HandMaids Tale");
        book[9] = new NonFiction("If on a Winters Night a Traveler");
        for(x = 0; x < book.length; ++x)
            System.out.println(book[x].getTitle() + "price is $" + book[x].getPrice());
    }
}
