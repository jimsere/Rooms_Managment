public class Room {

    private String roomNumber;
    private String type;
    private int price;
    private boolean state;

    //Constructor
    public Room (String roomNumber,String type,int price, boolean state){
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.state = state; 
    }
    
   

    public void printState(){
        if(state == false){System.out.println("This room is taken");}
        else
            {
                System.out.println("This room is available");
            }

    }
    
    public void printRoomStats(){

        System.out.println("Room Number:"+roomNumber+"  "+"Room Type:"+type+"   "+"Price for one night:"+price+"    "+"Availability:"+state);
    }

    //GETTERS
    public String getRoomNumber(){
        return roomNumber;
    }
     public String getType(){
        return type;
    }
     public int getPrice(){
        return price;
    } 
    public boolean getAvailability(){
        return state;
    }
    //SETTERS
    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;                       
    }
    public void setType(String type){
        this.type = type;                       
    }
    public void setPrice(int price){
        this.price = price;                       
    }
    public void setAvailability(Boolean state){
        this.state = state;                       
    }
}