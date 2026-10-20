import java.util.Scanner;
import java.util.Random;

public class battleship{
    public static int rows = 5;
    public static int columns = 5;
    public static int shots = 10;
    public static int boatLength = 3;
    public static String map = "";
    public static Boolean win = false;

    public static String makeMap(){
        Random rand = new Random();
        int boatStartColumn = rand.nextInt(4);
        int boatStartRow = rand.nextInt(4);
        int direction = rand.nextInt(3);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                map += ".";
            }
            map += ("\n");
        }

        if (direction == 0 && boatStartRow == 0){direction = 2;}
        else if (direction == 1 && boatStartColumn == 4) { direction = 3;}
        else if (direction == 2 && boatStartRow == 4){direction = 0;}
        else if (direction == 3 && boatStartColumn == 0){direction = 1;}

        int index = boatStartRow * 5 + boatStartColumn;
        map = map.substring(0, index) + 'x' + map.substring(index + 1);

        int indexDistance = 0;
        if (direction == 0) {indexDistance = -6;}
        else if (direction == 1) {indexDistance = 1;}
        else if (direction == 2) {indexDistance = 6;}
        else if (direction == 3) {indexDistance = -1;}
        
        for (int i = 0; i < boatLength - 1; i++){
        index += indexDistance;
        if (index < 0){index += 12;}
        if (map.charAt(index) == '\n') {//check start column or direction}
        map = map.substring(0, index) + 'x' + map.substring(index + 1);
        }

        System.out.println(boatStartColumn + " " + boatStartRow + " " + direction);
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
