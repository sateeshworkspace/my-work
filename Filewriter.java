class Filewriter
{
	 public static void main(String args[])
	 {
	    try
	    {
		   FileWriter fw=new FileWriter("f:\\abc.txt");
		   fw.write("my name is Chandra");
		   fw.close();
	    }
  	    catch(Exception e)
        {
		  System.out.println(e);
  	    }
  		System.out.print("success");
 	}
}