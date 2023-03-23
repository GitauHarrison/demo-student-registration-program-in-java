// Define a student to register
public class Student {
    // Class attributes used to define a student
    private String first_name, last_name, school;
    private int id;
    private double score;

    // Setters and getters to access private variables
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public int getId() {
        return id;
    }

    public String getSchool() {
        return school;
    }
    public double getScore() {
        return score;
    }

    // Constructor that defines a student object
    Student(String _first_name, String _last_name, int _id, String _school, double _score){
        this.first_name=_first_name;
        this.last_name=_last_name;
        this.id=_id;
        this.school=_school;
        this.score=_score;


    }
    
    // Show student data
    public  void displayStudentDetails(){
        System.out.println(
            "First Name: " + getFirstName() + 
            " Last Name: " + getLastName() + 
            " ID: " + getId() + 
            " Score: "+ getScore() + 
            " School: "+ getSchool());;


    }
}
