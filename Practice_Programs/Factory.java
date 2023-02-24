public class Factory {

    public static void main(String[] args) {

        try{
          //  int a[]=new int[5];
           // a[5]=1;
            String a=null;
          //  System.out.println(a.length());
            System.out.print(a.charAt(0));
        }

        catch(IndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}