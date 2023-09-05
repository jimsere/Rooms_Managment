import java.util.List;

public class Rooms_Managment {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        //1st Floor Rooms
        Room room1 = new Room("101", "Double", 50, true);
        Room room2 = new Room("102", "Single", 30, true);
        Room room3 = new Room("103", "Double", 50, true);
        Room room4 = new Room("104", "Double", 50, true);
        Room room5 = new Room("105", "Familly", 60, true);
        
        //2nd Floor Rooms
        Room room6 = new Room("201", "Single", 30, true);
        Room room7 = new Room("202", "Single", 30, true);
        Room room8 = new Room("203", "Double", 50, true);
        Room room9 = new Room("204", "Single", 30, true);
        Room room10 = new Room("205", "Double", 50, true);

        //3rd Floor Rooms
        Room room11 = new Room("301", "Single", 30, true);
        Room room12 = new Room("302", "Familly", 60, true);
        Room room13 = new Room("303", "Double", 50, true);
        Room room14 = new Room("304", "Double", 50, true);
        Room room15 = new Room("305", "Familly", 60, true);

        //4th Floor Rooms
        Room room16 = new Room("401", "Suite", 30, true);
        Room room17 = new Room("402", "Suite", 60, true);
        Room room18 = new Room("403", "Suite", 50, true);
        Room room19 = new Room("404", "Suite", 50, true);
        Room room20 = new Room("405", "Suite", 60, true);

        //Adding the rooms into the list
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);
        hotel.addRoom(room5);
        hotel.addRoom(room6);
        hotel.addRoom(room7);
        hotel.addRoom(room8);
        hotel.addRoom(room9);
        hotel.addRoom(room10);
        hotel.addRoom(room11);
        hotel.addRoom(room12);
        hotel.addRoom(room13);
        hotel.addRoom(room14);
        hotel.addRoom(room15);
        hotel.addRoom(room16);
        hotel.addRoom(room17);
        hotel.addRoom(room18);
        hotel.addRoom(room19);
        hotel.addRoom(room20);

        //Reservations
        System.out.println("Reservations:"+"\n------------------------------------------------------");
        hotel.makeReservation("01", "303", "2023-08-12", "2023-08-17", "Papadoloulos Giorgos");
        hotel.makeReservation("02", "203", "2023-07-12", "2023-07-17", "Konstantinidou maria");
        hotel.makeReservation("03", "101", "2023-08-12", "2023-08-17", "lefteris georgiou");
        hotel.makeReservation("04", "401", "2023-06-20", "2023-06-25", "Papadoloulos Giorgos");
        hotel.makeReservation("05", "102", "2023-07-20", "2023-07-25", "grhgoris serefias");
        hotel.makeReservation("06", "105", "2023-08-27", "2023-09-02", "thaleia tsakona");
        hotel.makeReservation("07", "205", "2023-07-25", "2023-07-30", "Papadoloulos Giorgos");
        hotel.makeReservation("08", "203", "2023-08-02", "2023-08-07", "Serefias dimitris");
        hotel.makeReservation("09", "104", "2023-07-30", "2023-08-05", "Eleftherios lyratzis");
        hotel.makeReservation("010", "405", "2023-08-01", "2023-08-06", "Leiloglou nikos");
        hotel.makeReservation("011", "301", "2023-07-02", "2023-07-07", "Papadoloulos Giorgos");
        hotel.makeReservation("012", "302", "2023-08-22", "2023-08-27", "Petros daxhs");
        hotel.makeReservation("013", "205", "2023-06-01", "2023-06-06", "Papadoloulos Giorgos");
        hotel.makeReservation("014", "303", "2023-08-21", "2023-08-26", "nafsika kazanidi");
        hotel.makeReservation("015", "105", "2023-06-10", "2023-06-15", "kalaitzis axilleas");
        hotel.makeReservation("016", "405", "2023-06-30", "2023-07-05", "kapshs ektoras");
        System.out.println("------------------------------------------------------");
 
        //Available rooms
        System.out.println("Availability"+"\n---------------------------------------");
        List<Room> availableRooms = hotel.getAvailableRooms("2023-08-12");
        for(Room room : availableRooms){
            System.out.println("Room No:" + room.getRoomNumber()+ " " + "is available");
        }
        System.out.println("---------------------------------------");

        //View the reservations for one specific client
        System.out.println("Reservations for one client"+"\n---------------------------------------");
        hotel.printResevationsByClient("Papadoloulos Giorgos");

        System.out.println("---------------------------------------");
        System.out.println("View the reservations for one specific room"+"\n---------------------------------------");
        //View the reservations for one specific room
        hotel.printReservationsByRoom("203");
        System.out.println("---------------------------------------");

        System.out.println("Delete a reservation");
        System.out.println("---------------------------------------");
        hotel.DeleteReservation("02");
        // "Showing the reservations for room 203 after the delete of one of it's reservations(there were 2 in the beginning)
        hotel.printReservationsByRoom("203");
    }
}
