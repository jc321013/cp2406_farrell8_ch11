package Three;

/**
 * Created by jc321013 on 18/09/16.
 */
public class OutgoingPhoneCall extends PhoneCall
{
    public final static double RATE = .04;
    private int minutes;
    public OutgoingPhoneCall(String num, int mins)
    {
        super(num);
        minutes = mins;
        price = minutes * RATE;
    }
    public void getInfo()
    {
        System.out.println("Outgoing " +
                getPhoneNumber() + " " + RATE +
                " per minute at " + minutes +
                " minutes. Total is $" +
                getPrice());
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
