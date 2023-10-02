public class FizzBuzz{
   static public void main(String... args){
      
      System.out.print("Enter Number: ");
      int n = new java.util.Scanner(System.in).nextInt();
      System.out.println("The Fizz, Buzz, and FizzBuzz numbers are: ");
      for(int i = 1; i <= n; i++ )
      {
         if(i % 3 == 0 && i % 5 == 0)
            System.out.print("FizzBuzz");
         else if(i % 3 == 0)
            System.out.print("Fizz");
         else if(i % 5 == 0)
            System.out.print("Buzz");
         else   
            System.out.print(i);
            System.out.println(",");
      }
   }//end of main method
}//end of class
