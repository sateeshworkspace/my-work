  

class FileOStream
{  
  public static void main(String args[])
  {  
   try
   {  
	   String s="java is powerful language to create any application";
	   File f=new File("f:\\abc.txt");
       FileOutputStream fout=new FileOutputStream(f);  
       byte b[]=s.getBytes();    //converting string into byte array  
       fout.write(b);  
       fout.close();  
       System.out.println("success...");  
    }
    catch(Exception e)
    {
    System.out.println(e);
    }  
  }  
}  