package Three;

/**
 * Created by jc321013 on 18/09/16.
 */
public class DemoPhoneCalls
{
    public static void main(String[] args)
    {
        IncomingPhoneCall inCall = new IncomingPhoneCall("212-555-3096");
        OutgoingPhoneCall outCall = new OutgoingPhoneCall("312-874-0232", 10);
        inCall.getInfo();
        outCall.getInfo();
    }
}
