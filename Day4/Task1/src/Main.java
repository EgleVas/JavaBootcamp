import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Declare and initialize String array with 7 arbitrary colors
        String[] colorArray = {"white", "blue", "black", "green", "yellow", "red", "orange"};
        System.out.println("Color Array : " + Arrays.toString(colorArray));

        // 2. Create new list "colors" (ArrayList) of type String
        ArrayList<String> colorList = new ArrayList<String>();

        // 3. Copy/add all elements from String array to colors list
        for (int i = 0; i < colorArray.length; i++) {
            colorList.add(colorArray[i]);
        }
        System.out.println("Color List : " + colorList);

        // 4. Remove 3rd element from colors list
        colorList.remove(2);
        System.out.println("Color List removed 3rd element: " + colorList);

        // 5. Add new color at the end of the colors list
        colorList.add("purple");
        System.out.println("Color List added new color at the end: " + colorList);

        // 6. Add new color at the beginning of the colors list
        colorList.add(0, "black");
        System.out.println("Color List added new color at the beginning: " + colorList);

        // 7. Loop through colors list and output all values (use for each loop)
        System.out.println();
        System.out.println("Color List by one:");
        for (String color : colorList) {
            System.out.println(color);
        }
        System.out.println();

        // 8. Create new list (colorsSublist) which will be sublist of the colors list (will contain elements from index 2 to index 5)
        // (hint: take a look at List interface and find a method which you can use to achieve this)
        List<String> colorSubList = colorList.subList(2, 6);
        System.out.println("Sublist of Color List from elements from index 2 to index 5 (inclusive): " + colorSubList);
        System.out.println();

        // 9. Use for loop to output each element of colorsSublist list
        System.out.println("Color Sublist by one:");
        for (String color : colorSubList) {
            System.out.println(color);
        }
    }
}