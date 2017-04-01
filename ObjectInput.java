 
class ObjectInput
{  
 public static void main(String args[])throws Exception
 {  
   File f=new File("f:\\studentdetails.txt"); 
   ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));  
   Student s=(Student)in.readObject();  
   System.out.println(s.id+" "+s.name);  
   in.close();  
 }  
}  