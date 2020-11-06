package project;
import java.util.* ;
import java.io.* ;

class Teacher
{
    public String read()
    {
        try
        {
            File myObj = new File("\\C:\\Users\\admin\\Desktop\\java\\project\\src\\detail1.txt");
            Scanner myReader = new Scanner(myObj);
            String x="";
            while(myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                x+=data;
                //System.out.println(data);
            }
            myReader.close();
            return x;
        }
        catch (FileNotFoundException e)
        {
            return ("File not found!");
        }
    }
    public void condition(String a1,String a2,String a3,String a4)
    {
        String x= read().replaceAll(a1,"%%");
        String y=(String) x.replaceAll(a2,"%%").replaceAll(a3,"%%").replaceAll(a4,"%%");
        String[] z= y.split("%%",0 );
        System.out.println(a1+" :");
        int q=1;
        for(int i=1;i<z.length;i=i+4)
        {
            System.out.println(q+"  "+z[i]);
            q++;
        }
        System.out.println();
        System.out.println(a2+" :");
        q=1;
        for(int i=2;i<z.length;i=i+4)
        {
            System.out.println(q+"  "+z[i]);
            q++;
        }
        System.out.println();
        System.out.println(a3+" :");
        q=1;
        for(int i=3;i<z.length;i=i+4)
        {
            System.out.println(q+"  "+z[i]);
            q++;
        }
        System.out.println();
        System.out.println(a4+" :");
        q=1;
        for(int i=4;i<z.length;i=i+4)
        {
            System.out.println(q+"  "+z[i]);
            q++;
        }
    }
}
public class prgrm1 {
    public static void main(String[] args)
    {
        System.out.println("Enter the Side heading in an order: (Maximum 4 Only):");
        Scanner sc=new Scanner(System.in);
        System.out.println("main side heading:");
        String a1=sc.nextLine();
        System.out.println("Second Side heading:");
        String a2=sc.nextLine();
        System.out.println("Third Side heading:");
        String a3=sc.nextLine();
        System.out.println("Fourth Side heading:");
        String a4=sc.nextLine();
        Teacher x=new Teacher();
        x.condition(a1,a2,a3,a4);
    }
}
