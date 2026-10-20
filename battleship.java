import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class battleship{
    public static int rows = 5;
    public static int columns = 5;
    public static int shots = 10;
    public static int boatLength = 3;
    public static String map = "";
    public static List<Integer> remainingIndexes = new ArrayList<>();

    public static String makeMap(){
        
    Random rand = new Random();

    int direction = rand.nextInt(2);
    int boatStartRow;
    int boatStartColumn;
    

    if (direction == 0) {
        // Horizontal boat
        boatStartRow = rand.nextInt(rows);
        boatStartColumn = rand.nextInt(columns - boatLength + 1);
    } else {
        // Vertical boat
        boatStartRow = rand.nextInt(rows - boatLength + 1);
        boatStartColumn = rand.nextInt(columns);
    }

    map = "";

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            map += ".";
        }
        map += "\n";
    }

    for (int i = 0; i < boatLength; i++) {
        int row = boatStartRow;
        int column = boatStartColumn;

        if (direction == 0) {
            column += i;
        } else {
            row += i;
        }

        int index = row * (columns + 1) + column;
        remainingIndexes.add(index);
    }

    return map;
}

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("BATTLESHIP");
        makeMap();
        System.out.println(map);
        System.out.println(remainingIndexes);
        while (remainingIndexes.size != 0){
            System.out.print("Where to you want to shoot (0 - 24): ");
            int target = scanner.nextInt();
            scanner.nextLine();
            target += target / 5;
            if (remainingIndexes.contains(target)) {
                System.out.println("Hit");
                remainingIndexes.remove((Integer) target);
            } else {System.out.println("Miss");}
        }
        System.out.println("You Win!!!!");
        scanner.close();
    }
}
