
package S2_2019.Q3;

import java.util.*;

public class MazeSolver {
    private int[][] maze;
    private Set<Cell> visited;
    private Queue<Cell> queue;
    private Map<Cell, Cell> parentMap;

    public MazeSolver(int[][] maze) {
        this.maze = maze;
        this.visited = new HashSet<>();
        this.queue = new LinkedList<>();
        this.parentMap = new HashMap<>();
    }

    public boolean isPathExists(int startRow, int startCol) {
        queue.add(new Cell(startRow, startCol));
        visited.add(new Cell(startRow, startCol));

        int[][] moves = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} }; // Up, Down, Left, Right

        while (!queue.isEmpty()) {
            Cell currentCell = queue.poll();

            if (maze[currentCell.row][currentCell.col] == 'C') {
                displayPath(currentCell);
                return true; // Path found!
            }

            for (int[] move : moves) {
                int newRow = currentCell.row + move[0];
                int newCol = currentCell.col + move[1];

                if (isValidCell(newRow, newCol) && !visited.contains(new Cell(newRow, newCol))) {
                    queue.add(new Cell(newRow, newCol));
                    visited.add(new Cell(newRow, newCol));
                    parentMap.put(new Cell(newRow, newCol), currentCell);
                }
            }
        }

        return false; // No path found
    }

    private boolean isValidCell(int row, int col) {
        return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] != 0;
    }

    private void displayPath(Cell destination) {
        List<Cell> path = new ArrayList<>();
        Cell current = destination;
        while (current != null) {
            path.add(current);
            current = parentMap.get(current);
        }
        Collections.reverse(path);

        System.out.println("Moves to reach the destination:");
        for (Cell cell : path) {
            System.out.println("Move to row: " + cell.row + ", col: " + cell.col);
        }
    }

    private class Cell {
        int row;
        int col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Cell other = (Cell) obj;
            return row == other.row && col == other.col;
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 1, 1, 0},
                {1, 1, 1, 0, 1},
                {0, 1, 0, 1, 'C'},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0}
        };

        int startRow = 0;
        int startCol = 0;

        MazeSolver solver = new MazeSolver(maze);
        if (solver.isPathExists(startRow, startCol)) {
            System.out.println("Path found!");
        } else {
            System.out.println("No path found.");
        }
    }
}
