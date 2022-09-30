import java.util.*;
class Node
{
  int data;
  Node next;
}

class stacker
{
        Node top ;
        int nodescount;

    public void push( )
    {
      Node node = new Node();
      Scanner sc= new Scanner(System.in);
      int x = sc.nextInt();
      node.data =x ;
      node.next = top;
      top = node;
      this.nodescount+=1;
    }
    public void pop()
    {
      this.nodescount-=1;
      this.top = (this.top).next;
    }
    public void display ()
    {
      Node current = top ;
      while (current !=null)
      {
        System.out.println(current.data);
        current= current.next;
      }
    }
    public static void main(String[] args)
    {
     stacker obj = new stacker();
     Scanner sc = new Scanner(System.in);
     int x = 5 ;
     while (x !=4)
     {
       System.out.println("1.push 2.pop 3.dislay 4.exit");
  System.out.print("choose one value from the above ");
       int y = sc.nextInt();
       switch (y)
        {
          case 1:
             {
               obj.push();
               System.out.println("item pushed ");
               break;
             }
          case 2:
             {
               obj.pop();
               System.out.println("item removed");
               break;
             }
          case 3 :
             {
               obj.display();
               break;
             }
          case 4:
         {
             System.out.println("exiting from the code .....");
             System.exit(0);
             }
           default :
             {
             System.out.println("please enter the valid one ");
             break;
             }
         }
     }
    }
}
                                                       
