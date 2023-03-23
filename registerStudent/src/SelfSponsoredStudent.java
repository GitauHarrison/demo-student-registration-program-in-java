// This class also inherits from the Student class
public class SelfSponsoredStudent extends Student {

    public SelfSponsoredStudent(String _first_name, String _last_name, int _id, String _school, double _score) {
        super(_first_name, _last_name, _id, _school, _score);
    }
    
    @Override
    public void displayStudentDetails() {
        System.out.println("Self-sponsored students: ");
        super.displayStudentDetails();
    }
}
