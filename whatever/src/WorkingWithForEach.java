
public class WorkingWithForEach {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    int[] number = {1,2,3,4,5};
    //old way
    for (int i = 0; i < number.length; i++) {
        System.out.println(number[i]);
        
    }
    // for each
    for (int i:number) {
        System.out.println(i);
        
    }
    }

}
