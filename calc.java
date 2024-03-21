public class calc
{
    public static void main(String[] args)
    {
        int a, b;
        a = Integer.parseInt(args[0]);
        String op = args[1];
        b = Integer.parseInt(args[2]);

        if(op.equals("+"))
        {
            System.out.println("Addition of the number is "+(a+b));
        }
        else if(op.equals("-"))
        {
            System.out.println("Subtraction the numbers is "+(a-b));
        }
        else if(op.equals("*"))
        {
            System.out.println("Multiplication of the numbers is "+(a*b));
        }
        else if(op.equals("/"))
        {
            System.out.println("Division of the numbers is "+(a/b));
        }
    }
}