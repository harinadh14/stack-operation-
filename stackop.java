import java.util.*;
class stackop
{
public static void main(String[] args)
  {
  Scanner sc = new Scanner( System.in);
  int x =0 ;
  Stack<Integer> s = new Stack<>();
  int top  = 0 ;
  while (x != 4)
  {
    System.out.println("\n 1.push \n 2.pop \n 3.display stack \n 4. exit ");
    System.out.print("enter the value from above to perform  :");
    x = sc.nextInt();
    switch(x)
    {
      case 1:
       {
         System.out.print("enter value to push ");
         int jyo = sc.nextInt();
         s.push(jyo);
         System.out.println("item pushed");
         break ;
          }
       case 2:
        {
          System. out. println("you are choosen to delete(pop)element");
          s.pop();
          System. out. println(s+":YOUR STACK IS...... ..lastly entered item popped ");
          break; 
        }
      case 3:
       {
         System.out.println("your stack is :"+ s );
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



/*

try this for menu:
System.out.println(" menu:  \n |------------------|\n | 1.push           | \n | 2.pop            |\n | 3.display stack  |\n | 4. exit          |\n |__________________| ");
*/
