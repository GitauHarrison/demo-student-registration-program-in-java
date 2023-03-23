import java.util.ArrayList;


public class Programs {
    private String programName;
    private int programCode;
    private int term;

    // Create array list object
    ArrayList<Student> studentsArrayList = new ArrayList<>();

    // Create a constructor of programs
    public Programs(String _programName, int _programCode, int _term){
        this.programName = _programName;
        this.programCode = _programCode;
        this.term = _term;
    }

    // Getters and setters
    public String getProgramName() {
        return programName;
    }

    public int getProgramCode() {
        return programCode;
    }

    public int getTerm() {
        return term;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setProgramCode(int programCode) {
        this.programCode = programCode;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    // Add students to studentArrayList
    public void addStudent(Student student) {
        // Check for the maximum size of the program
        // If not exceeded, update the list
        if (studentsArrayList.size() < 10) {
            studentsArrayList.add(student);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Capacity is full!");
        }
    }

    // Display program details
    public void displayProgramDetails() {
        System.out.println();
        System.out.println("Current programs seen below:");
        System.out.println(
            "Program Name: " + getProgramName() + 
            ", Program Code: " + getProgramCode() +
            ", Program Term: " + getTerm()
        );        
    }
}
