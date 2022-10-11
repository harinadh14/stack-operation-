import java.util.*;
class queue
{
  int front=-1;
  int rear= -1;
  int[] arr = new int[10];
  void insert ()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value to insert:");
    int x = sc.nextInt();
    rear++;
    arr[rear]= x;
    System.out.println("item inserted into queue");
  }
  void delete()
  {
    front++;
    System.out.println("item deleted from the queue");
  }
  void display()
  {
          for(int i=front+1; i<=rear;i++)
          {
             System.out.println(arr[i]);

          }
  }
  public static void main(String[] args)
  {
    queue obj = new queue();
    int x = 5;
     while (x != 4)
     {
       System.out.println("1.insert  2.delete 3.display 4.exit");
       Scanner sc = new Scanner(System.in);
       System.out.print("choose one from the above ");
       int y = sc.nextInt();
       switch(y)
       {
         case 1:

          {
            obj.insert();
            break;
          }
           
         case 2:
          {
            obj.delete();
            break;
          }
         case 3:
          {
            obj.display();
            break;
          }
         case 4:
          {
            System.out.println("exiting from the code.....");
            System.exit(0);
          }
         default:
          {
            System.out.println("please enter valid options");
          }


       }

     }
  }
}
