import java.lang.reflect.Field;
import java.lang.reflect.Method;
class Student{

    int Roll;
    String name;

    public void set(int roll,String name)
    {
        this.Roll=roll;
        this.name=name;
    }

     public void get()
    {
      System.out.println("Roll number : "+Roll);
      System.out.println("Name is : "+name);
    }
}

public class LoaderDetails{

    public static void main(String args[])
    {
        Student s1=new Student();

        Class c=s1.getClass();
         System.out.println(c.getName());

         Method []m=c.getDeclaredMethods();

         for(int i=0;i<m.length;i++)
         {
            System.out.println(m[i]);

         }



           Field [] fields=c.getDeclaredFields();

         for(int i=0;i<fields.length;i++)
         {
            System.out.println(fields[i]);
            
         }

    }
}