package Jsexecutor;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
//Property files are used to get value for a property

public class propfile {
	public static void main(String[] args) throws Exception {
		System.out.println(getValue("Url"));
		System.out.println(getValue("UserName"));

		System.out.println(getValue("LastName"));
		setValue("UserName", "123445abcd");// replacing exciting First name with 123445
		// since files are invloved we are throwing the exceptions
		//Url,UserName,LastName are written in the file so we are using the same here

	}


	public static String getValue(String property) throws Exception
	{
		File src = new File("./App.properties");// searching a file with this name
		FileReader x= new FileReader(src);// File Reader is used to read the data from the file

		Properties prop = new Properties();
		prop.load(x);//load is used to load the contents of the file

		return prop.getProperty(property);// this is used to return the contents of the file


	}

	
	public static void setValue(String property,String value) throws Exception
	{
		File src = new File("./app.properties");
		FileReader x= new FileReader(src);

		Properties prop = new Properties();
		prop.load(x);
		prop.setProperty(property, value);// SetProperty is used to update the contents of the file
		
		
		prop.store(new FileWriter(src),"File Written..!");//updated contents are stored in File using prop.store
	}
}




