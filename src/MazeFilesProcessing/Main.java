package MazeFilesProcessing;

public class Main {

    public static void main(String[] args) {

        String mazeFile = "src/MazeFilesProcessing/maze_101_101.txt";
        MazeData data = new MazeData(mazeFile);
        data.print();
    }
}