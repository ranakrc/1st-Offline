package TestStudent;

/**
 * Created by Ranakrc on 19-Sep-15.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private boolean status;

    public Room() {
        this.hallName = "";
        this.roomNo = 0;
        this.status = false;
    }

    Room(String hallName, int roomNo) {
        this.hallName = hallName;
        this.roomNo = roomNo;
        this.status = false;
    }

    public String getHallName() {
        return this.hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getRoomNo() {
        return this.roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void print() {
        if(status==true)
            System.out.println("Room No, " +  getRoomNo() + " of " + getHallName() + " Hall, is currently allocated");
        else
            System.out.println("Room No, " +  getRoomNo() + " of " + getHallName() + " Hall, is currently available for allotment");
    }


}
