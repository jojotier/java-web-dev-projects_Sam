import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> classRoster = new HashMap<>();
        System.out.print("Student: ");
        String newStudent = input.nextLine();
        do {
          if(!newStudent.equals("")){
              System.out.print("ID: ");
              Integer newID = input.nextInt();
              classRoster.put(newID, newStudent);
              input.nextLine();
              break;
          }

        } while(!newStudent.equals(""));
    input.close();
    System.out.println("\nClass Roster:");
    for(Map.Entry<Integer, String> student : classRoster.entrySet()){
        System.out.println(student.getValue() + "'s ID: " + student.getKey());
    }
    System.out.println("Number of students in the roster: " + classRoster.size());
    }
}
