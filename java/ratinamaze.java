import java.util.ArrayList;

public class ratinamaze {

  public boolean isSafe(int i, int j, int row, int col, int arr[][], ArrayList<ArrayList<Boolean>> visited) {
    if ((i >= 0 && i < row) && (j >= 0 && j < col) && arr[i][j] == 1 && !visited.get(i).get(j)) {
      return true;
    }
    return false;
  }

  public void solveMaze(int maze[][], int row, int col, int i, int j, ArrayList<ArrayList<Boolean>> visited,
      ArrayList<String> path, String output) {
    if (i == row - 1 && j == col - 1) {
      path.add(output);
      return;
    }

    // Down
    if (isSafe(i + 1, j, row, col, maze, visited)) {
      visited.get(i + 1).set(j, true);
      solveMaze(maze, row, col, i + 1, j, visited, path, output + "D");
      visited.get(i + 1).set(j, false);
    }

    // Left
    if (isSafe(i, j - 1, row, col, maze, visited)) {
      visited.get(i).set(j - 1, true);
      solveMaze(maze, row, col, i, j - 1, visited, path, output + "L");
      visited.get(i).set(j - 1, false);
    }

    // Right
    if (isSafe(i, j + 1, row, col, maze, visited)) {
      visited.get(i).set(j + 1, true);
      solveMaze(maze, row, col, i, j + 1, visited, path, output + "R");
      visited.get(i).set(j + 1, false);
    }

    // Up
    if (isSafe(i - 1, j, row, col, maze, visited)) {
      visited.get(i - 1).set(j, true);
      solveMaze(maze, row, col, i - 1, j, visited, path, output + "U");
      visited.get(i - 1).set(j, false);
    }
  }

  public static void main(String[] args) {
    int maze[][] = {
      { 1, 0, 0, 0 },
      { 1, 1, 0, 1 },
      { 1, 1, 0, 0 },
      { 0, 1, 1, 1 },
    };

    if (maze[0][0] == 0) {
      System.out.println("Path does not exist");
      return;
    }

    ArrayList<ArrayList<Boolean>> visited = new ArrayList<ArrayList<Boolean>>();

    int rows = 4;
    int cols = 4;

    for (int i = 0; i < rows; i++) {
      ArrayList<Boolean> rowlist = new ArrayList<Boolean>();
      for (int j = 0; j < cols; j++) {
        rowlist.add(false);
      }
      visited.add(rowlist);
    }

    visited.get(0).set(0, true);

    ArrayList<String> path = new ArrayList<String>();
    String output = "";

    ratinamaze riam = new ratinamaze();
    riam.solveMaze(maze, rows, cols, 0, 0, visited, path, output);

    if (path.isEmpty()) {
      System.out.println("Path does not exist");
    } else {
      System.out.println(path);
    }
  }
}
