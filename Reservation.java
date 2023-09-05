public class Reservation {
    
    private String reservationNumber;
    private String roomNumber;
    private String dateIn;
    private String dateOut;
    private String clientName;

    //constructor
    public Reservation (String reservationNumber,String roomNumber,String dateIn,String dateOut,String clientName ){
        this.reservationNumber = reservationNumber;
        this.roomNumber = roomNumber;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.clientName = clientName;
    }





//GETTERS
public String getReservationNumber(){
    return reservationNumber;
}
public String getroomNumber(){
    return roomNumber;
}
public String getDatein(){
    return dateIn;
}
public String getDateOut(){
    return dateOut;
}
public String getclientName(){
    return clientName;
}

//SETTERS
public void setReservationNumber(String reservationNumber){
    this.reservationNumber = reservationNumber;
}
public void setRoomNumber(String roomNumber){
    this.roomNumber = roomNumber;
}
public void setDateIn(String dateIn){
    this.dateIn = dateIn;
}
public void setDateOut(String dateOut){
    this.dateOut = dateOut;
}
public void setclientName(String clientName){
    this.clientName = clientName;
}
}
