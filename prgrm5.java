package project;
import java.util.*;
class prgrm5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char choice='1';
        int choicee;
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        Iterator<String> itr = my_dict.values().iterator();
        do {
            System.out.println("Menu\n1.Insert\n2.Search\n3.exit\nEnter the choice");
            choice=in.nextLine().charAt(0);
            choicee= choice-'0';
            if(choicee == 1)
            {
                System.out.println("Enter key : ");
                String x = in.nextLine();
                System.out.println("Enter value : ");
                String y = in.nextLine();
                if(my_dict.containsKey(x))
                {
                    String ext= my_dict.get(x);
                    String ext1= y+" , "+ext;
                    my_dict.put(x, ext1);
                }
                else {
                    my_dict.put(x, y);
                }
            }
            else if(choicee == 2)
            {
                System.out.println("Enter key : ");
                String x = in.nextLine();
                System.out.println(my_dict.getOrDefault(x,"Not Available"));
            }
            else
            {
                System.out.println("Not Valid");
            }
        }while(choicee!=3);
    }
}