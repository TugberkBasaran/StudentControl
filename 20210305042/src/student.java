
public class student {

	private String name;
    private String surname;
    private int StudentNumber;

    public student(String name, String surname, int StudentNumber) {

        this.name = name;
        this.surname = surname;
        this.StudentNumber = StudentNumber;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getStudentNumber() {
        return StudentNumber;
    }


    public void setStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
    }


    public void showInspection() {


        System.out.println(" Name: " + this.name);
        System.out.println(" Surname: " + this.surname);
        System.out.println(" Student Number: " + this.StudentNumber);


    }
}
