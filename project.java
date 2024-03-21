import java.util.Scanner;
public class project {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int usernum = 0;
        int mynum = (int)(Math.random()*100);

        do{
            System.out.println("Guess the number: ");
            usernum=sc.nextInt();
            if(usernum == mynum){
                System.out.println("CORRECT");
                break;
            }
            else if(usernum > mynum){
                System.out.println(("Number is large"));
            }
            else{
                System.out.println(("Number is small"));
            }
        }
            while(usernum >= 0);

            System.out.print(("The correct number was: "));
            System.out.println(mynum);
        
    }
    
}
