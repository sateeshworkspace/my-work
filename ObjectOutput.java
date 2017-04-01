

class ObjectOutput
{  
 public static void main(String args[])throws Exception
 {  
   Student s1=new Student(211,"rakesh");  
   File f=new File("f:\\studentdetails.txt");
   FileOutputStream fout=new FileOutputStream(f);  
   ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  