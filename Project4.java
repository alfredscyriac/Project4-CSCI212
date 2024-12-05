import java.util.TreeMap;
public class Project4 {
    public static void main(String[] args) {
        String filePath = args[0];
        TreeMap<String, Refrigerator> refrigerators = new TreeMap<>(new ApplianceComparator());
        TreeMap<String, Dishwasher> dishwashers = new TreeMap<>(new ApplianceComparator());
        TreeMap<String, Microwave> microwaves = new TreeMap<>(new ApplianceComparator());
    }
    
}