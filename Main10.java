class SingleTable {
    private int numSeats;
    private int height;
    private double viewQuality;

    public SingleTable(int numSeats, double viewQuality, int height) {
        this.numSeats = numSeats;
        this.viewQuality = viewQuality;
        this.height = height;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        this.viewQuality = value;
    }
}

// Your required CombinedTable class implementation
class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        table1 = t1;
        table2 = t2;
    }

    public boolean canSeat(int people) {
        int totalSeats = table1.getNumSeats() + table2.getNumSeats() - 2;
        return totalSeats >= people;
    }

    public double getDesirability() {
        double averageView = (table1.getViewQuality() + table2.getViewQuality()) / 2.0;
        
        if (table1.getHeight() == table2.getHeight()) {
            return averageView;
        } else {
            return averageView - 10.0;
        }
    }
}

// Main execution runner using the exact values from the problem's sample chart
public class Main {
    public static void main(String[] args) {
        // Create sample single tables from the chart
        SingleTable t1 = new SingleTable(4, 60.0, 74);
        SingleTable t2 = new SingleTable(8, 70.0, 74);
        SingleTable t3 = new SingleTable(12, 75.0, 76);

        // Test Scenario 1: Combined table c1 (t1 + t2)
        System.out.println("--- Testing c1 (t1 + t2) ---");
        CombinedTable c1 = new CombinedTable(t1, t2);
        
        System.out.println("c1.canSeat(9): " + c1.canSeat(9)); // Expected: true
        System.out.println("c1.canSeat(11): " + c1.canSeat(11)); // Expected: false
        System.out.println("c1.getDesirability(): " + c1.getDesirability()); // Expected: 65.0

        // Test Scenario 2: Combined table c2 (t2 + t3)
        System.out.println("\n--- Testing c2 (t2 + t3) ---");
        CombinedTable c2 = new CombinedTable(t2, t3);
        
        System.out.println("c2.canSeat(18): " + c2.canSeat(18)); // Expected: true
        System.out.println("c2.getDesirability(): " + c2.getDesirability()); // Expected: 62.5 (72.5 - 10)

        // Test Scenario 3: Live updates to single table view quality
        System.out.println("\n--- Testing updates to single tables ---");
        t2.setViewQuality(80.0);
        System.out.println("c2.getDesirability() after t2 update: " + c2.getDesirability()); // Expected: 67.5
    }
}
