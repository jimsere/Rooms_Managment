import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;
    public Hotel(){
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
    public void removeRoom(String roomNumber) {
        rooms.removeIf(room -> room.getRoomNumber().equals(roomNumber));
    }
    public void printAllRooms(){
        for(Room room : rooms){
            room.printRoomStats();
        }
    }

    public Room getRoomByNumber(String roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)){
                return room;
            }
        }
        return null;
    }

     public Reservation getReservationByNumber(String reservationNumber) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationNumber().equals(reservationNumber)){
                return reservation;
            }
        }
        return null;
    }

    public boolean roomIsAvailable(String roomNumber, String startDate, String endDate) {
        LocalDate newStartDate = LocalDate.parse(startDate);
        LocalDate newEndDate = LocalDate.parse(endDate);
    
        for (Reservation existingReservation : reservations) {
            if (existingReservation.getroomNumber().equals(roomNumber)) {
                LocalDate existingStartDate = LocalDate.parse(existingReservation.getDatein());
                LocalDate existingEndDate = LocalDate.parse(existingReservation.getDateOut());
    
                if ((newStartDate.isEqual(existingStartDate) || newStartDate.isAfter(existingStartDate)) && newStartDate.isBefore(existingEndDate) 
                    || (newEndDate.isAfter(existingStartDate) && (newEndDate.isBefore(existingEndDate) || newEndDate.isEqual(existingEndDate)))) {
                    return false; // Το δωμάτιο δεν είναι διαθέσιμο
                }
            }
        }
        return true; // Το δωμάτιο είναι διαθέσιμο
    }
    
    public void makeReservation(String ReservationNumber, String roomNumber, String startDate, String endDate, String customerName){
        Room room = getRoomByNumber(roomNumber);
        if (room != null && roomIsAvailable(roomNumber, startDate, endDate)) {
            Reservation reservation = new Reservation(ReservationNumber, roomNumber, startDate, endDate, customerName);
            reservations.add(reservation);
            System.out.println("Reservation made successfully!");
        } else {
            System.out.println("Room "+ roomNumber +" is either taken or not found!");
        }
    }
   
    public void DeleteReservation(String ReservationNumber){
            Reservation reservation = getReservationByNumber(ReservationNumber);
            if (reservation != null){
                reservations.remove(reservation);
                System.out.println("Delete for reservation number:"+ReservationNumber+" "+"was made successfully!");
            }
    }

    public List<Room> getAvailableRooms(String desiredDate){

        List<Room> availableRooms = new ArrayList<>();

        for(Room room: rooms){
            boolean isAvailable = true;

        for (Reservation reservation : reservations){
            if (reservation.getroomNumber().equals(room.getRoomNumber())){
                if ((desiredDate.compareTo(reservation.getDatein()) >= 0) &&
                    (desiredDate.compareTo(reservation.getDateOut()) <= 0)) {
                    isAvailable = false;
                    break;
                }
            }
        }
            if (isAvailable) {
                availableRooms.add(room);
            }
        }

            return availableRooms;

    }

    public void printReservationsByRoom(String roomNumber){
        for(Reservation reservation : reservations){
            if(reservation.getroomNumber().equals(roomNumber)){
                System.out.println("Room Number:"+reservation.getroomNumber()+" "+"Reservation Number:"+ reservation.getReservationNumber()+
                ", Date In:" + reservation.getDatein()+ 
                ", Date Out"+ reservation.getDateOut()+
                ",client Name:" + reservation.getclientName());
            }
        }
    }

    public void printResevationsByClient(String clientName){
        for(Reservation reservation : reservations){
            if(reservation.getclientName().equals(clientName)){
                System.out.println("Client Name:"+reservation.getclientName()+"     "+
                "Reservations Number:"+ reservation.getReservationNumber()+"     "+
                ",Room Number:"+ reservation.getroomNumber()+
                ", Date In:" + "    "+reservation.getDatein()+ "    "+
                ", Date Out:"+ reservation.getDateOut());
            }
        }
    }




}
