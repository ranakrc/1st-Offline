package TestStudent;
/**
 * Created by Ranakrc on 19-Sep-15.
 */
public class Student {
    private String studentName;
    private String studentNo;
    private Room room;

    public Student(String studentName, String studentNo, Room room) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.room = room;
    }

    public Student() {
        studentName = "";
        studentNo = "";
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentNo(String studentNo) { this.studentNo = studentNo; }

    public String getStudentNo() { return this.studentNo; }

    public void setRoom(Room room) { this.room = room; }

    public Room getRoom() {
        return this.room;
    }

    public void print() {
        System.out.println("Student No: " + getStudentNo() + ", " + getStudentName() + ", resides on " + room.getHallName() + " Hall, Room No, " + room.getRoomNo());
    }
}
