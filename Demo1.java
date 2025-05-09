public class Demo1{



    static String college="KMIT";

    public void Test()
    {
        System.out.println(college);
    }

    public static void main(String args[])
    {
        System.out.println(college);
        Demo1 d1=new Demo1();
        //  System.out.println(this.college);
        d1.Test();

         d1=null;
          System.out.println(d1.college);


    }
}