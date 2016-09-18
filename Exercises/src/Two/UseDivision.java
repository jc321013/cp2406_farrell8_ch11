package Two;

/**
 * Created by jc321013 on 18/09/16.
 */
public abstract class UseDivision
{
    public static void main(String[] args)
    {
        DomesticDivision abcDomDiv = new
                DomesticDivision("Sales", 111, "Australia");
        DomesticDivision xyzDomDiv = new
                DomesticDivision("Technology", 222, "Australia");
        InternationalDivision abcIntDiv = new
                InternationalDivision("Technology", 333, "Australia", "Australian");
        InternationalDivision xyzIntDiv = new
                InternationalDivision("Marketing", 444, "Australia",
                "Australia");
        abcDomDiv.display();
        xyzDomDiv.display();
        abcIntDiv.display();
        xyzIntDiv.display();
    }
}

