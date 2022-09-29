import java.util.*;
class stkop
{
   int[] arr = new int[10];
   int top=-1 ;

     void  push()
     {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter vlaue to push:");
       int x = sc.nextInt();
       top++;
       arr[top]= x;
       System.out.println("item pushed ");
     }
     void pop()
     {
       top--;
       System.out.println("item pop ed ");
     }
     void display ()
     {
       for (int i=0;i<=top;i++)
        {
           System.out.println(arr[i]);
        }
     }
  public static void main(String[] args)
    {
      stkop s=new stkop();
    /*  obj.push();
      obj.pop();
      obj.display();*/
      int x =5;
         while (x != 4)
         {

           Scanner sc = new Scanner(System.in);
           System.out.println("\n 1.push \n 2.pop \n 3.display stack \n 4. exit ");
           System.out.print("enter the value from above to perform  :");
           x = sc.nextInt();
            switch(x)
             {
              case 1:
               {
                 System.out.print("enter value to push ");
         //int jyo = sc.nextInt();
                 s.push();
                                                                  
                 System.out.println("item pushed");
                 break ;
               }
              case 2:
               {
                 System. out. println("you are choosen to delete(pop)element");
                 s.pop();
                 s.display();
                 System. out. println(":YOUR STACK IS...... ..lastly entered item popped ");
                 break;
               }
              case 3:
               {
                System.out.print("ur stack is :");
                s.display();
                break ;
               }
              case 4:
               {
                System.out.println("exiting ");
                System.exit(0);
                break;
               }
     
          }
      }

    }
}                                                           
