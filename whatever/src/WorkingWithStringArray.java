
public class WorkingWithStringArray {

    public static void main(String[] args) {
        String name = "bombam2018";
       
        for (int i = 0; i < name.length(); i++) {
            
           // while (name.length()>0) {
                //System.out.println(name.substring(0,1));
               //name = name.substring(1);
                
            //}
            // System.out.println(name.substring(0, 1)); // b
           //System.out.println(name.charAt(i)); //bombam
          // System.out.println(name.substring(i, i + 1));
          //System.out.println(name.substring(1));
           System.out.println(name.substring(i+1));
            
        }

    }

}
