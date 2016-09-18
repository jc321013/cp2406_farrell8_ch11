package Two;

/**
 * Created by jc321013 on 18/09/16.
 */
public class DomesticDivision extends Division
{
    protected String state;
    public DomesticDivision(String title, int acct, String st)
    {
        super(title, acct);
        state = st;
    }
    public void display()
    {
        System.out.println("Domestic Division: " +
                divisionTitle + "  Acct #" + acctNum +
                "\nLocated in " + state);
    }
}

