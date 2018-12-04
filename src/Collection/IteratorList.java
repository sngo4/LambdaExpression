package Collection;

import java.util.ArrayList;
import java.util.List;

public class IteratorList {

	public static void main(String[] args) {

        // Create list with no parameter
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            // Add element to list
            list.add("0" + i);
        }
        System.out.println("list.size() = " +  list.size());
       
        // traversing the list in the forward direction
//        for (String item : list) {
//            list.remove(item);
//        }
//        for (int i = 4; i >= 0; i--) {
//            // Add element to list
//        	list.remove(i);
//        }
//        list.forEach(o -> list.remove(o));
        System.out.println("list.isEmpty() = " + list.isEmpty());
	}

}
