package business;



public class Seat {
    private String seatID;
    private boolean isAvai;
    private Seat leftPosition;
    private Seat rightPosition;
    
    public Seat(String seatId){
        this.seatID = seatId;
        this.isAvai = true;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public boolean isIsAvai() {
        return isAvai;
    }

    public void setIsAvai(boolean isAvai) {
        this.isAvai = isAvai;
    }

    public Seat getLeftPosition() {
        return leftPosition;
    }

    public void setLeftPosition(Seat leftPosition) {
        this.leftPosition = leftPosition;
    }

    public Seat getRightPosition() {
        return rightPosition;
    }

    public void setRightPosition(Seat rightPosition) {
        this.rightPosition = rightPosition;
    }

    @Override
    public String toString(){
        return this.seatID;
    }
 
}
