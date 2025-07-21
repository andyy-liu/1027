import java.util.ArrayList;

public class MazeSolver {

    public static boolean solveMaze(char[][] maze, int row, int col, ArrayList<String> path,
            MazeVisualizer visualizer) {

        // Base case 1: check if we're out of bounds
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) {
            return false;
        }

        // Base case 2: check if current position is a wall or already visited
        if (maze[row][col] == '#' || maze[row][col] == '+') {
            return false;
        }

        // Base case 3: check if we reached the exit
        if (maze[row][col] == 'E') {
            maze[row][col] = '+'; // Mark exit as part of path for visualization
            visualizer.repaint();
            try {
                Thread.sleep(50); // Add delay to see the visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }

        // Mark current position as visited with yellow tile (+)
        char original = maze[row][col];
        maze[row][col] = '+';

        visualizer.repaint();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Try all four directions: down, right, up, left
        if (solveMaze(maze, row + 1, col, path, visualizer)) {
            path.add("down");
            return true;
        }
        if (solveMaze(maze, row, col + 1, path, visualizer)) {
            path.add("right");
            return true;
        }
        if (solveMaze(maze, row - 1, col, path, visualizer)) {
            path.add("up");
            return true;
        }
        if (solveMaze(maze, row, col - 1, path, visualizer)) {
            path.add("left");
            return true;
        }

        // Backtrack: restore original character
        maze[row][col] = original;
        visualizer.repaint();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void main(String[] args) {
        Maze maze = new Maze("maze5.txt"); // to change the maze you're solving, change this filename (maze1.txt,
                                           // maze2.txt, maze3.txt, maze4.txt, or maze5.txt)
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
