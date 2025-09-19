import java.time.Year;
public class Student {
    private String studentId;
    private String fullName;
    private int birthYear;
    private String address;

    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }
    public Student(String studentId, String fullName, int birthYear, String address) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.address = address;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return Year.now().getValue() - birthYear;
    }
    public void printInfo() {
        System.out.println("Thong tin sinh vien:");
        System.out.println("- Ma sinh vien: " + studentId);
        System.out.println("- Ho ten: " + fullName);
        System.out.println("- Nam sinh: " + birthYear);
        System.out.println("- Dia chi: " + address);
    }
}
