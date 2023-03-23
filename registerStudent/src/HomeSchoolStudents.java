public class HomeSchoolStudents extends Student{

    public HomeSchoolStudents(String _first_name, String _last_name, int _id, String _school, double _score) {
        super(_first_name, _last_name, _id, _school, _score);
    }
    
    @Override
    public void displayStudentDetails() {
        System.out.println("Homeschool student: ");
        super.displayStudentDetails();
    }
}
