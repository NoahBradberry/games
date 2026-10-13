public class battleship{
    public static int rows = 5;
    public static int columns = 5;
    public static int shots = 10;
    public static String map = "";

    public static void main(String [] args){
        System.out.println("BATTLESHIP");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                map += ". ";
            }
            map += ("\n");
        }
        System.out.println(map);
    }
}
