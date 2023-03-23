import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Student student;

        ArrayList<Programs> programsArrayList = new ArrayList<>();

        int response;

        // Use a do while loop to ensure that the program is executed at least once
        do {
            System.out.println();
            System.out.println(
                "WELCOME TO A DEMO STUDENT REGISTRATION PROGRAM USING JAVA. " + 
                "FOLLOW THE INSTRUCTIONS GIVEN TO TEST OUT THE PROGRAM.");
            System.out.println("1 - Add a new program");
            System.out.println("2 - Add a new student to the program");
            System.out.println("3 - Show all student details in select program");
            System.out.println("4 - Exit the program");

            // Get user input from the console
            Scanner user_response = new Scanner(System.in);
            response = user_response.nextInt();

            // Check responses
            if (response ==  1) {
                // Add program to list
                ArrayList <Programs> returnProgramList = addProgram(user_response, programsArrayList);
                // Outcome of a null list
                if (returnProgramList == null) {
                    programsArrayList = returnProgramList;
                }


                
            } else if (response ==  2) {
                // Guide user to respond appropriately
                System.out.println("Enter a program code to continue (1 - 5)");
                // Show listed programs
                showPrograms(programsArrayList);
                // The program code is used to located a listed program
                // Use user input to start the reference
                int progCode = user_response.nextInt();
                Programs get_program = findProgram(progCode, programsArrayList);
                // If there is no program
                if (get_program == null) {
                    System.out.println("There is no such program");
                } else {
                    // If program exist
                    // Add a pre-defined student to the list of student programs
                    Scanner object = new Scanner(System.in);
                    if (progCode == 1) {
                        System.out.println("What is the student's first name (text) ? ");
                        String first_name = object.next();
                        System.out.println("What is the student's last name (text) ? ");
                        String last_name = object.next();
                        System.out.println("What is the student's ID (any number)? ");
                        int id = object.nextInt();
                        System.out.println("What is the student's school (text)? ");
                        String school = object.next();
                        System.out.println("What is the student's latest term score at his/her school (as percentage. Example: 50.00)? ");
                        Double score = object.nextDouble();

                        student = new ScholarshipStudents(first_name, last_name, id, school, score);
                        addStudentToProgram(student, get_program);
                    } else if (progCode == 2) {
                        System.out.println("What is the student's first name (text) ? ");
                        String first_name = object.next();
                        System.out.println("What is the student's last name (text) ? ");
                        String last_name = object.next();
                        System.out.println("What is the student's ID (any number)? ");
                        int id = object.nextInt();
                        System.out.println("What is the student's school (text)? ");
                        String school = object.next();
                        System.out.println("What is the student's latest term score at his/her school (as percentage. Example: 50.00)? ");
                        Double score = object.nextDouble();

                        student = new SelfSponsoredStudent(first_name, last_name, id, school, score);
                        addStudentToProgram(student, get_program);
                    } else if (progCode == 3) {
                        System.out.println("What is the student's first name (text) ? ");
                        String first_name = object.next();
                        System.out.println("What is the student's last name (text) ? ");
                        String last_name = object.next();
                        System.out.println("What is the student's ID (any number)? ");
                        int id = object.nextInt();
                        System.out.println("What is the student's school (text)? ");
                        String school = object.next();
                        System.out.println("What is the student's latest term score at his/her school (as percentage. Example: 50.00)? ");
                        Double score = object.nextDouble();

                        student = new HomeSchoolStudents(first_name, last_name, id, school, score);
                        addStudentToProgram(student, get_program);
                    } else if (progCode == 4) {
                        System.out.println("What is the student's first name (text) ? ");
                        String first_name = object.next();
                        System.out.println("What is the student's last name (text) ? ");
                        String last_name = object.next();
                        System.out.println("What is the student's ID (any number)? ");
                        int id = object.nextInt();
                        System.out.println("What is the student's school (text)? ");
                        String school = object.next();
                        System.out.println("What is the student's latest term score at his/her school (as percentage. Example: 50.00)? ");
                        Double score = object.nextDouble();

                        student = new TuitionStudent(first_name, last_name, id, school, score);
                        addStudentToProgram(student, get_program);
                    } else if (progCode == 5) {
                        System.out.println("What is the student's first name (text) ? ");
                        String first_name = object.next();
                        System.out.println("What is the student's last name (text) ? ");
                        String last_name = object.next();
                        System.out.println("What is the student's ID (any number)? ");
                        int id = object.nextInt();
                        System.out.println("What is the student's school (text)? ");
                        String school = object.next();
                        System.out.println("What is the student's latest term score at his/her school (as percentage. Example: 50.00)? ");
                        Double score = object.nextDouble();

                        student = new StemStudent(first_name, last_name, id, school, score);
                        addStudentToProgram(student, get_program);
                    }
                    // Once student and course has been added, display some notification
                    System.out.println(get_program.getProgramName());
                }


            } else if (response == 3) {
                System.out.println("Enter a program code to see the list of students already enrolled: ");
                int resp = user_response.nextInt();

                // Find the program
                Programs getYourProgram = findProgram(resp, programsArrayList);
                // Show the size of students already enrolled in the select program
                System.out.println(getYourProgram.studentsArrayList.size());
                // Get all students' details
                for (Student student_in_select_program : getYourProgram.studentsArrayList) {
                    student_in_select_program.displayStudentDetails();
                }
            }

            // ----------------
            // end of the loop
        } while (response != 4); 
            // ----------------

        System.out.println("Exit the program!");
    }




    // ==========================================
    // Other methods used to create the program
    // ==========================================

    // Add course to list
    public static ArrayList<Programs> addProgram(Scanner response, ArrayList<Programs> programsArrayList) {
        // Limit size to 10
        if (programsArrayList.size() < 10) {
            System.out.println("Enter a program name (text):");                 // prompt user
            String programName = response.next();                          // Create scanner object
            System.out.println("Program Name: " + programName.toString()); // Display response to user

            System.out.println("Enter a program code (number): ");
            int programCode = response.nextInt();
            System.out.println("Program Code: " + programCode);

            System.out.println("Enter the term you wish to take the program (1 - 3): ");
            int programTerm = response.nextInt();
            System.out.println("You will take this progam in term: " + programTerm);

            // Add all user input to list
            programsArrayList.add(new Programs(programName, programCode, programTerm));
            System.out.println("Program details added successfull!");
        } else {
            System.out.println("The program's capacity has been reached, and cannot be extended. Sorry.");            
        }
        return programsArrayList;
    }

    // Find a program
    public static Programs findProgram(int code, ArrayList<Programs> programsArrayList) {
        for (Programs programs : programsArrayList) {
            if (programs.getProgramCode() == code) {
                return programs;
            }
        }
        return null;
    }

    // Add student to a program
    public static void addStudentToProgram(Student student, Programs programs) {
        programs.addStudent(student);
    }

    // Display course info
    public static void showPrograms(ArrayList<Programs> programsArrayList) {
        for (Programs programs : programsArrayList) {
            programs.displayProgramDetails();
        }
    }





    // ==========================================
    // End
    // ==========================================
}
