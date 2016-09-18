package Three;

/**
 * Created by jc321013 on 18/09/16.
 */
public class DemoPhoneCalls
{
    public static void main(String[] args)
    {
        IncomingPhoneCall inCall = new IncomingPhoneCall("0475844994");
        OutgoingPhoneCall outCall = new OutgoingPhoneCall("0473895554", 10);
        inCall.getInfo();
        outCall.getInfo();
    }
}
