import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student newStudent = new Student("Sam", 123, 1, 4.0);
    }

    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudent;
    }

    public class Teacher{
private String firstName;
private String lastName;
private String subject;
private int yearsTeaching;

public void setFirstName(String firstName){
    this.firstName = firstName;
}
public void setLastName(String lastName){
    this.lastName = lastName;
}
public void setSubject(String subject){
    this.subject = subject;
}
private void setYearsTeaching(int yearsTeaching){
    this.yearsTeaching = yearsTeaching;
}

public String getFirstName(){
    return firstName;
}
public String getLastName(){
    return lastName;
}
public String getSubject(){
    return subject;
}
public int getYearsTeaching(){
    return yearsTeaching;
}
    }
}
