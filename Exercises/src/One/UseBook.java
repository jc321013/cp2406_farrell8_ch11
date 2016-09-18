package One;

/**
 * Created by jc321013 on 18/09/16.
 */
public class UseBook {
    public static void main(String[] args){
        Fiction aImaginary= new Fiction("Dr suss.");
        NonFiction aFactual= new
                NonFiction("The world");
        System.out.println("Fiction " +
                aImaginary.getTitle() + " costs $" +
                aImaginary.getPrice());
        System.out.println("Non-Fiction " +
                aFactual.getTitle() + " costs $" +
                aFactual.getPrice());
    }

}
