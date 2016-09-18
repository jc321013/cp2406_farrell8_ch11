package Three;

/**
 * Created by jc321013 on 18/09/16.
 */
public abstract class PhoneCall
{
    String phoneNumber;
    double price;
    public PhoneCall(String num)
    {
        phoneNumber = num;
        price = 0.0;
    }
    public void setPrice(double pr)
    {
        price = pr;
    }
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();
}
