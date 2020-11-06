package project;
import java.util.* ;
import java.io.* ;


class StudentSelection
{
    public  String read()
    {
        try
        {
            File obj = new File ("\\C:\\Users\\admin\\Desktop\\java\\project\\src\\detail3.txt");
            Scanner reader = new Scanner(obj);
            String x="";
            String y="\n";
            while(reader.hasNextLine())
            {
                String data= reader.nextLine();
                x+=data;
                x=x+y;
            }
            reader.close();
            return x;
        }
        catch (FileNotFoundException e)
        {
            return ("File not found!");
        }
    }
    public void dectector(int m)
    {
        String x= read().replaceAll("\n",",");
        String[] y=x.split(",",0);
        ArrayList<String> Nameinfo = new ArrayList<String>();
        ArrayList<String> Subjectinformation = new ArrayList<String>();
        for(int i=0;i<y.length;i++)
        {
            if(y[i].trim().startsWith("Name"))
            {
                Nameinfo.add(y[i]);
            }
            if(y[i].trim().startsWith("Subjects"))
            {
                Subjectinformation.add(y[i]);
            }
        }
        int count=m - Nameinfo.size();
        if(count==0)
        {
            System.out.println("Read n numbers!");
        }
        else{
            if(count>0)
                System.out.println("Read only "+ Nameinfo.size()+" Integers ");
            else
            {
                int countx= count * -1;
                System.out.println("Sorry Not fully read due to Limitation ("+ countx +" Left to read)");
            }
        }
        System.out.println();
        int count1;
        if(count<0)
        {
            count1=m;
        }
        else
        {
                count1= Nameinfo.size();
        }
        for (int i = 0; i < count1; i++)
        {
            System.out.println(Nameinfo.get(i)+" | "+ Subjectinformation.get(i));
        }
        System.out.println();
        ArrayList<String> SelectedStudent = new ArrayList<String>();
        for (int i = 0; i < count1; i++)
        {
           // SelectedStudent.add(Subjects.get(i).split("+",0));
            if(Subjectinformation.get(i).contains("Math") && Subjectinformation.get(i).contains("Oops"))
            {
                SelectedStudent.add(Nameinfo.get(i));
            }
        }
        System.out.println("The Student who learned both Oops and Maths are: ");
        for (int i = 0; i < SelectedStudent.size(); i++)
       {
            System.out.println(SelectedStudent.get(i));
       }
        System.out.println();
    }
}
class TeacherSelection
{
    public  String read()
    {
        try
        {
            File myObj = new File ("\\C:\\Users\\admin\\Desktop\\java\\project\\src\\detail3.txt");
            Scanner myReader = new Scanner(myObj);
            String x="";
            String y="\n";
            while(myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                x+=data;
                x=x+y;
            }
            myReader.close();
            return x;
        }
        catch (FileNotFoundException e)
        {
            return ("File not found!");
        }
    }
    public void detector(int m)
    {
        String x= read().replaceAll("\n",",");
        String[] y=x.split(",",0);
        ArrayList<String> NameInfo = new ArrayList<String>();
        ArrayList<String> SubjectsInformation = new ArrayList<String>();
        for(int i=0;i<y.length;i++)
        {
            if(y[i].trim().startsWith("Name"))
            {
                NameInfo.add(y[i]);
            }
            if(y[i].trim().startsWith("Teaches"))
            {
                SubjectsInformation.add(y[i]);
            }
        }
        int count=m - NameInfo.size();
        if(count==0)
        {
            System.out.println("Reading m Integers!");
        }
        else{
            if(count>0)
                System.out.println("Read only "+ NameInfo.size()+" Integers ");
            else {
                int countx= count * -1;
                System.out.println("Sorry Not fully read due to Limitation"+ countx +" Left to read");
            }
        }
        System.out.println();
        int count1;
        if(count<0)
        {
            count1=m;
        }
        else
        {
            count1= NameInfo.size();
        }
        for (int i = 0; i < count1; i++)
        {
            System.out.println(NameInfo.get(i)+" | "+ SubjectsInformation.get(i));
        }

        ArrayList<String> FacultySelected = new ArrayList<String>();
        for (int i = 0; i < count1; i++)
        {
            // SelectedStudent.add(Subjects.get(i).split("+",0));
            if(SubjectsInformation.get(i).contains("Math") && SubjectsInformation.get(i).contains("Oops"))
            {
                FacultySelected.add(NameInfo.get(i));
            }
        }
        System.out.println();
        System.out.println("The Teachers who Teaches both Oops and Maths are: ");
        for (int i = 0; i < FacultySelected.size(); i++)
        {
            System.out.println(FacultySelected.get(i));
        }
    }
}
public class prgrm3 {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n=sc.nextInt();
        System.out.println("Enter the value of m to select Teachers");
        int m=sc.nextInt();
        TeacherSelection th=new TeacherSelection();
        StudentSelection st=new StudentSelection();
        st.dectector(n);
        th.detector(m);
    }
}
