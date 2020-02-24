package business;

import java.util.Date;




public class Ticket {
    private int ticketID;
    private Seat seat;
    private double price;
    private String departure;
    private String arrival;
    private Date orderTime;
    
    private static int idCounter = 1;


    public Ticket(Seat seat, String departure, String arrival){
        this.seat = seat;
        this.departure = departure;
        this.arrival = arrival;
        this.orderTime = new Date();
        this.ticketID = idCounter ++;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
    
    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString(){
        return this.ticketID + " " + this.seat;
    }
}
