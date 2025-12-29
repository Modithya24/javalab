public class CmdArgs
{
    public static void main(String[] args)
    {
        try
        {
            if (args.length < 2)
            {
                throw new Exception("Enter at least 2 numeric arguments");
            }

            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            System.out.println("Addition : " + (x + y));
            System.out.println("Subtraction : " + (x - y));
            System.out.println("Multiplication : " + (x * y));
            System.out.println("Division : " + (x / y));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input! Please enter only numbers");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Math Error : " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            System.out.println("Execution Completed!");
        }
    }
}