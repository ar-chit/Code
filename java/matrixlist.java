import java.util.ArrayList;
import java.util.Arrays;

public class matrixlist {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        // arr.get(0).add(0, 1);


        System.out.println(arr.get(0));

    

    }
}
