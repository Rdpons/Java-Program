public class MidtermExam{
   static public void getSymbol(){
      System.out.print("Enter how many times to loop: ");
      int sus = new java.util.Scanner(System.in).nextInt();
      
      for(int i = 1; i <= sus; i++)
      {
        for(int ctr = 1; ctr <= sus; ctr++)
            {
               if(ctr % 2 != 0)
               {
                 if(ctr % 2 != 0)
                     {
                        System.out.print("*");
                     }
                     else
                     {
                        System.out.print("_");
                     }
                     if(i % 2 != 0)
                     {
                        System.out.print("//");
                     }
                     else
                     {
                        System.out.print("_");
                     }
                     if(i % 2 != 0)
                     {
                        System.out.print("\\");
                     }
                     else
                     {
                        System.out.print("_");
                     }

                     if(ctr % 2 != 0)
                     {
                        System.out.print("*");
                     }
                     else
                     {
                        System.out.print("_");
                     }
                   }
               }
               System.out.println();
           }
       }
   //
   static public void main(String... args){
      getSymbol();
   }//end of main method
}//end of class
