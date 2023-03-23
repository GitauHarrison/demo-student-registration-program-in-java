public class StemStudent extends Student{

    public StemStudent(String _first_name, String _last_name, int _id, String _school, double _score) {
        super(_first_name, _last_name, _id, _school, _score);
    }
    
    @Override
    public void displayStudentDetails() {
        System.out.println("STEM student: ");
        super.displayStudentDetails();
    }
}
