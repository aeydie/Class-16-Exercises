package Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> allMenuItems = new ArrayList<>();
//    private LocalDate lastupdated;

    public ArrayList<MenuItem> getAllMenuItems() {
        return allMenuItems;
    }

    public void setAllMenuItems(ArrayList<MenuItem> allMenuItems) {
        this.allMenuItems = allMenuItems;
    }

    public ArrayList<MenuItem> printAllMenuItems() {
        return allMenuItems;
    }

    public static void addMenuItem(MenuItem itemToBeAdded) {
        allMenuItems.add(itemToBeAdded);
    }


}

//import java.time.LocalDate;
//        import java.util.ArrayList;
//
//public class Menu {
//
//    //fields
//    private static ArrayList<MenuItem> menuItems = new ArrayList<>();
//    private LocalDate lastUpdated;
//
//    //getter and setter
//    public static ArrayList<MenuItem> getMenuItem() { return menuItems; }
//
//    public LocalDate getLastUpdated() {
//        return lastUpdated;
//    }
//
//    public void setLastUpdated(LocalDate lastUpdated) {
//        this.lastUpdated = lastUpdated;
//    }
//
//    //methods
//    public static ArrayList<MenuItem> printAllMenuItems() {
//        return menuItems;
//    }
//
//    public static MenuItem printMenuItem(MenuItem itemToBePrinted) {
//        return itemToBePrinted;
//    }
//
//    public static void addMenuItem(MenuItem itemToBeAdded) {
//        menuItems.add(itemToBeAdded);
//    }
//
//    public static void removeMenuItem(MenuItem itemToBeRemoved) {
//        menuItems.remove(itemToBeRemoved);
//    }
//
////    public static MenuItem lastUpdated(MenuItem itemToBeDated) {
////        return itemToBeDated.dateCreated;
////    }
//
//
//
//}
