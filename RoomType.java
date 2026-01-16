
public class RoomType {
	
    private String kind; // e.g., "Single", "Double"
    private double cost; // Price per night

    public RoomType(String kind, double cost) {
        this.kind = kind;
        this.cost = cost;
    }

    public String getKind() {
        return kind;
    }

    public double getCost() {
        return cost;
    }
}