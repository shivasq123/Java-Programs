package project;
import java.util.* ;
import java.io.* ;

class StopWords
{
        public  String readfile()
        {
            try
            {
                File myObj = new File ("\\C:\\Users\\admin\\Desktop\\java\\project\\src\\detail4.txt");
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
        public void Stopworddetctor(){
            ArrayList<String> EditDialogues = new ArrayList<String>();
            ArrayList<String> NoDialogues = new ArrayList<String>();
            String[] x=readfile().split("\n",0);
            for(int i=0;i<x.length;i++)
            {
                NoDialogues.add(x[i]);
                EditDialogues.add(x[i].replaceAll(" the","").replaceAll("The","").replaceAll("Is","").replaceAll(" is","").replaceAll("Was","").replaceAll(" was",""));
            }
            System.out.println("{Before}          ---          {After}");
            for(int i=0;i<EditDialogues.size();i++)
            {
                System.out.println("{"+NoDialogues.get(i)+"} --- {"+EditDialogues.get(i)+"}");
            }
        }
}
public class prgrm4
{
    public static void main(String[] args) {
        StopWords sw=new StopWords();
        sw.Stopworddetctor();
    }
}