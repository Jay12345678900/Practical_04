// Jay Patel
// 21CE092

import java.util.*;

public class TryCatchExample
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("There is an ArithmeticExecption");
        }
    }
}
