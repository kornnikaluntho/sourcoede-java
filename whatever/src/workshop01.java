import org.omg.CORBA.PUBLIC_MEMBER;

public class workshop01 {

    public static void main(String[] args) {

      //  int a, b, c = 0;
      //  a = c++;
      //  System.out.println(a);
      //  b = ++a;
       // System.out.println(b);
     //   c++;
       // System.out.println(c);

     //   b = ++c + a++;
        
     //   a = --b + c++;
       // System.out.println(a);
       // System.out.println(b);
       // System.out.println(c);
        
       
         int  x1= 2, x2=0;
         int  y1= 1, y2=0;
         int  z1= 3 ,z2=6;
         
       double x = Math.pow((x1 - x2), 2);
       double y = Math.pow((y1 - y2), 2);
       double z = Math.pow((z1 - z2), 2);
       double   distance = Math.sqrt(x + y +z);
       System.out.println(Math.sqrt(x + y +z ));
       
    }
    
   
    
    

}
