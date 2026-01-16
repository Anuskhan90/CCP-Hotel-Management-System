
public class Rooms {

	    private int number;
	    private RoomType roomType; 
	    private boolean isOccupied;
	    private Guest guest; // Room mein kaun ruka hai

	    public Rooms(int number, RoomType roomType) {
	        this.number = number;
	        this.roomType = roomType;
	        this.isOccupied = false;
	        this.guest = null;
	    }

	    public int getNumber() {
	        return number;
	    }

	    public RoomType getRoomType() {
	        return roomType;
	    }

	    public boolean isOccupied() {
	        return isOccupied;
	    }

	    // Guest ko room dena
	    public void setGuest(Guest guest) {
	        this.guest = guest;
	        this.isOccupied = (guest != null);
	    }
	    
	    public Guest getGuest() {
	        return guest;
	    }
	}

