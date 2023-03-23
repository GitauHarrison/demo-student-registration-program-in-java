// This class inherits from the Student class
// And extends it
public class ScholarshipStudents  extends Student{

    public ScholarshipStudents(String _first_name, String _last_name, int _id, String _school, double _score) {
        super(_first_name, _last_name, _id, _school, _score);
    }
    
    @Override
    public void displayStudentDetails() {
        System.out.println("Scholarship student: ");
        super.displayStudentDetails();
    }
}
