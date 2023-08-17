import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> tenIntegers = new ArrayList<>();
            tenIntegers.add(1);
            tenIntegers.add(2);
            tenIntegers.add(3);
            tenIntegers.add(4);
            tenIntegers.add(5);
            tenIntegers.add(6);
            tenIntegers.add(6);
            tenIntegers.add(6);
            tenIntegers.add(6);

         int result = evenSum(tenIntegers);

         System.out.println(result);
    }

    public static int evenSum(ArrayList<Integer> arr){
    int total = 0;
    for(int integer : arr){
        if(integer%2 == 0){
            total += integer;
        }
    }
        return total;
    }

    public static void stringPractice(String[] args){
        String newString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strSplit = newString.split("");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));
    }

}
