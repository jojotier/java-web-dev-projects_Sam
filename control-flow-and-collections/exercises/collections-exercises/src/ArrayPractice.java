import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int [] newIntegerArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < newIntegerArray.length; i++){
            if(newIntegerArray[i] % 2 !=0) {
                System.out.println(newIntegerArray[i]);
            }
        }

        String newString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = newString.split("\\.");
        System.out.println(Arrays.toString(words));


    }

}
