import java.util.Scanner;
// import perfectSquare.*;
class sunnynumber
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
      input();  
    }
    public static void input()
    {
        System.out.print("Enter a number: ");
      int userInput=sc.nextInt();
      calculateSum(userInput);
      
      
    }
    public static void calculateSum(int num)
    {
        int temp=num;
        temp+=1;
       boolean flag= squareRoot(temp);
       System.out.print(flag);
    }
    public static boolean squareRoot(int num)
    {
        boolean flag=false;
        int i=0;
        for(i=1;i<=num/2;i++)
        {
            int product=i*i;
            if(product==num)
            {
                flag=true;
              break;
            }
            
            

        }
        return flag;
    }
    //  public static void compare(boolean num,int i)
    // {
    //     if()
    // }
}