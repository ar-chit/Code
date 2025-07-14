import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LandRecord {
    private String ownerName;
    private String ownerFather;
    private int landSize;

    public LandRecord(String ownerName, String ownerFather, int landSize) {
        this.ownerName = ownerName;
        this.ownerFather = ownerFather;
        this.landSize = landSize;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerFather() {
        return ownerFather;
    }

    public int getLandSize() {
        return landSize;
    }

    @Override
    public String toString() {
        return ownerName + " S/o " + ownerFather + " has " + landSize + " acres of land.";
    }
}

public class LandRecordSystem {
    private List<LandRecord> landRecords;

    public LandRecordSystem() {
        landRecords = new ArrayList<>();
    }

    public void addLandRecord(String ownerName, String ownerFather, int landSize) {
        LandRecord record = new LandRecord(ownerName, ownerFather, landSize);
        landRecords.add(record);
    }

    public List<LandRecord> selectWhereName(String name) {
        List<LandRecord> result = new ArrayList<>();
        for (LandRecord record : landRecords) {
            if (record.getOwnerName().equals(name)) {
                result.add(record);
            }
        }
        return result;
    }

    public int selectSumWhereName(String name) {
        int sum = 0;
        for (LandRecord record : landRecords) {
            if (record.getOwnerName().equals(name)) {
                sum += record.getLandSize();
            }
        }
        return sum;
    }

    public List<LandRecord> selectWhereFamilyTree(String name) {
        List<LandRecord> result = new ArrayList<>();
        for (LandRecord record : landRecords) {
            if (record.getOwnerName().equals(name) || record.getOwnerFather().equals(name)) {
                result.add(record);
            }
        }
        return result;
    }

    public int selectSumWhereFamilyTree(String name) {
        int sum = 0;
        for (LandRecord record : landRecords) {
            if (record.getOwnerName().equals(name) || record.getOwnerFather().equals(name)) {
                sum += record.getLandSize();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        LandRecordSystem landRecordSystem = new LandRecordSystem();

        // Input statements
        Scanner scanner = new Scanner(System.in);
        String statement;
        while (true) {
            System.out.print("Enter a statement (or type 'exit' to finish): ");
            statement = scanner.nextLine();
            if (statement.equalsIgnoreCase("exit")) {
                break;
            }
            // Parse and add the land records based on the input statement.
            // You need to implement the logic to parse the input statement and add the records.
        }

        // Example queries (similar to previous code):
        // ...

        scanner.close();
    }
}
