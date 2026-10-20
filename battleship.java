import java.util.Random;
import java.util.Scanner;

public class battleship{
    public static int rows = 5;
    public static int columns = 5;
    public static int shots = 10;
    public static int boatLength = 3;
    public static String map = "";
    public static Boolean win = false;

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

        map = map.substring(0, index) + "x"
            + map.substring(index + 1);
    }

    return map;
}

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("BATTLESHIP");
        makeMap();
        System.out.println(map);
        while (win = false){
            System.out.print("Where to you want to shoot: ");
            String target = scanner.nextLine();
            if (target.length() != 2){
                System.out.println("Thats Bad");
            }  
        }
        scanner.close();
    }
}
