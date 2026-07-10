import java.util.ArrayList;
public class Drill113ArraywithLoop {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();

        countries.add("Ethiopia");
        countries.add("Kenya");
        countries.add("Nigeria");
        countries.add("Gahana");
        countries.add("Egypt");

        for(int i = 0; i < countries.size(); i++) {
            System.out.println("Country " + (i+1) + ": " + countries.get(i));
        }
    }
}
