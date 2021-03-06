package Three;

/**
 * Created by jc321013 on 18/09/16.
 */
public class IncomingPhoneCall extends PhoneCall
{
    public final static double RATE = .02;
    public IncomingPhoneCall(String num, int i)
    {
        super(num);
        price = RATE;
    }
    public void getInfo()
    {
        System.out.println("Incoming" +
                getPhoneNumber() + " " + RATE + " per call. Total is $" +
                + getPrice());
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public double getPrice()
    {
        return price;
    }
}
