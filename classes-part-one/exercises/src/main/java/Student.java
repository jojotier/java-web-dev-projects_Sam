public class Student {

        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;


        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public String getName(){
                return name;
        }
        public void setName(String name){
                this.name = name;
        }
        public void setStudentId(int studentId){
                this.studentId = studentId;
        }
        private void setNumberOfCredits(int numberOfCredits){
                this.numberOfCredits = numberOfCredits;
        }
        public void setGpa(double gpa){
                this.gpa = gpa;
        }
        public String getName(String name){
                return name;
        }
        public int getStudentId(int studentId){
                return studentId;
        }
        public int getNumberOfCredits(int numberOfCredits){
                return numberOfCredits;
        }
        public double getGpa(double gpa){
                return gpa;
        }

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

}
