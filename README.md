# Triangles Project

This project creates a matrix where users can draw a triangle based on the coordinates provided.

## Features
- Dynamically set the matrix size.
- Accept user input for three triangle vertices.
- Draw lines and form a triangle on the matrix.
- Clear the matrix and redraw as needed.

## Usage

### Step 1: Matrix Size Input
- When the program starts, you will be prompted to enter the size of the matrix (e.g., `10`, `20`, `50`).
- **Recommended matrix size:** Between `10-100`.

### Step 2: Coordinate Input
- Enter the coordinates for the three vertices of the triangle:
  - Format: `(x1, y1), (x2, y2), (x3, y3)`

### Step 3: Drawing the Triangle
- The program will draw the triangle on the matrix based on the input.
- After drawing, the matrix will be displayed in the console.

### Step 4: Repeat Input
- You can enter new coordinates to redraw the matrix with a new triangle.

## Example Run
```plaintext

Enter matrix size:
20
Enter number 1:
5
Enter number 2:
5
Enter number 3:
15
Enter number 4:
5
Enter number 5:
10
Enter number 6:
15
```
## Notes
Matrix size limit: Large sizes may impact performance. A maximum size of 100 is recommended.
Input coordinates: Must be within the matrix bounds. Otherwise, the drawing will fail.
## Requirements
Java 8 or later
A text editor or an IDE
