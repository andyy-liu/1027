import java.util.ArrayList;

public class MazeSolver {

    public static boolean solveMaze(char[][] maze, int row, int col, ArrayList<String> path, MazeVisualizer visualizer) {

        // Your solution here
    }

    public static void main(String[] args) {
        Maze maze = new Maze("maze1.txt"); // to change the maze you're solving, change this filename (maze1.txt, maze2.txt, maze3.txt, maze4.txt, or maze5.txt)
        maze.printMaze();

        ArrayList<String> path = new ArrayList<>();

        // create a frame to display the maze
        MazeVisualizer visualizer = new MazeVisualizer(maze.getMaze(), path);
        visualizer.display();

        if (solveMaze(maze.getMaze(), maze.getStartRow(), maze.getStartCol(), path, visualizer)) {
            System.out.println("Maze solved:");
            for (int i = path.size() - 1; i >= 0; i--) {
                System.out.println(path.get(i));
            }
        } else {
            System.out.println("No solution found for the maze.");
        }
    }
}
