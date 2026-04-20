# Sudoku Puzzle Generator

## Student Name
Joseph Cancel

## Program Overview
This program prints a solved 9 by 9 Sudoku board in the Java console. The board follows Sudoku rules, meaning each row, column, and 3 by 3 box contains the numbers 1 through 9 exactly once. The program generates the board using a pattern instead of hard-coding the answers.

## How to Run the Program
1. Open the project in Java Sandbox or any Java IDE.
2. Compile the `SudokuGenerator.java` file.
3. Run the program.
4. A solved Sudoku board will be printed in the console.

## How the Sudoku Board is Generated
The program starts with the numbers 1 through 9 in the first row. Each new row is created by shifting the numbers in a pattern. This allows the board to remain valid while filling all rows, columns, and 3 by 3 boxes correctly.

## Data Structures Used

### 2D Array
A 2D array called `board` is used to store the Sudoku puzzle. It has 9 rows and 9 columns.

### ArrayList
An `ArrayList<Integer>` is used to store the starting row values from 1 through 9.

## Methods

### `main()`
Starts the program, creates the board, and calls the other methods.

### `fillBoard(int[][] board)`
Fills the board using the shifting pattern.

### `printBoard(int[][] board)`
Prints the Sudoku board neatly to the console.

### `printDivider()`
Prints divider lines between sections of the board.

### `isValidBoard(int[][] board)`
Checks that rows and columns do not contain duplicate values.

## Testing Plan
- Made sure each row had the numbers 1 through 9 once.
- Made sure each column had the numbers 1 through 9 once.
- Checked that the board printed clearly with divider lines.

## Challenges and Solutions
One challenge was creating a Sudoku board without typing in every answer manually. I solved this by using a shifting pattern to generate each row. Another challenge was making the board easy to read, so I added divider lines between sections.

## Files Included
- `SudokuGenerator.java`
- `README.md`
- Design Document
