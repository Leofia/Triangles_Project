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


## Notes
Matrix size limit: Large sizes may impact performance. A maximum size of 100 is recommended.
Input coordinates: Must be within the matrix bounds. Otherwise, the drawing will fail.
## Requirements
Java 8 or later
A text editor or an IDE
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
Pseudocode Algorithm for Line Drawing 
drawline(matrix, x0, y0, x1, y1)
    dx = x2 - x1
    dy = y2 - y1
    for x from x1 to x2 {
        y = y1 + dy * (x - x1) / dx
        mark(matrix, x,y)
    }

For example drawLine(mat,1,2,5,6) method generates the following matrix where F denotes a “false” entry and T denotes a “true” entry (the entire 51x51 matrix is not shown here).
F F F F F F F F F F F F F …
F F T F F F F F F F F 
F F F T F F F F F F F 
F F F F T F F F F F F 
F F F F F T F F F F F 
F F F F F F T F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F 
F 
               …

The above naïve algorithm works well if there is one marked point at each vertical line as it is the case in the previous example. Note that the code marks exactly one point at each iteration which in turn corresponds to a vertical line. 
However, sometimes more than one point should be marked on a vertical line. The most prominent example is the example of a vertical line, for example between the points (1,1) (1,5). It is clear that this code is not usable in this exemple.

F F F F F F F F F F F F F …
F T F F F F F F F F F 
F T F F F F F F F F F 
F T F F F F F F F F F 
F T F F F F F F F F F 
F T F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F 
F 
A similar situation arises when the line is not vertical but still steep, for example between the points (1,1) (2,5).

F F F F F F F F F F F F F …
F T F F F F F F F F F 
F T F F F F F F F F F 
F T F F F F F F F F F 
F F T F F F F F F F F 
F F T F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F F F F F F F F F F F 
F 
F 
In such cases there is a simple solution: just exchange the roles for the x and y coordinates.
The general rule is that if the slope of the line is between -1 and 1 we can use the normal algorithm. Otherwise the line is steep in which case we can still use the same algorithm after exchanging the roles of the x and y coordinates. Namely, we will mark one point for each horizontal line. Recall that the slope of a line between two points (x1,y1) and (x2,y2) is (y_2-y_1)/(x_2-x_1 ). Note that this corresponds to the ratio dy/dx in terms of the variables in the pseudo-code. 
Note also that the denominator might be zero in which case you cannot use the division operator.

  
Sample Input and Output
1 1
1 50
50 25
 **************************************************
 *                                                *
  *                                               *
  *                                              * 
   *                                             * 
   *                                            *  
    *                                           *  
    *                                          *   
     *                                         *   
     *                                        *    
      *                                       *    
      *                                      *     
       *                                     *     
       *                                    *      
        *                                   *      
        *                                  *       
         *                                 *       
         *                                *        
          *                               *        
          *                              *         
           *                             *         
           *                            *          
            *                           *          
            *                          *           
             *                         *           
             *                        *            
              *                       *            
              *                      *             
               *                     *             
               *                    *              
                *                   *              
                *                  *               
                 *                 *               
                 *                *                
                  *               *                
                  *              *                 
                   *             *                 
                   *            *                  
                    *           *                  
                    *          *                   
                     *         *                   
                     *        *                    
                      *       *                    
                      *      *                     
                       *     *                     
                       *    *                      
                        *   *                      
                        *  *                       
                         * *                       
                          *                        
1 1
1 50
50 50
 **************************************************
  *                                               *
   *                                              *
    *                                             *
     *                                            *
      *                                           *
       *                                          *
        *                                         *
         *                                        *
          *                                       *
           *                                      *
            *                                     *
             *                                    *
              *                                   *
               *                                  *
                *                                 *
                 *                                *
                  *                               *
                   *                              *
                    *                             *
                     *                            *
                      *                           *
                       *                          *
                        *                         *
                         *                        *
                          *                       *
                           *                      *
                            *                     *
                             *                    *
                              *                   *
                               *                  *
                                *                 *
                                 *                *
                                  *               *
                                   *              *
                                    *             *
                                     *            *
                                      *           *
                                       *          *
                                        *         *
                                         *        *
                                          *       *
                                           *      *
                                            *     *
                                             *    *
                                              *   *
                                               *  *
                                                * *
                                                 **
                                                  *


5 5
30 30
10 40
                                                   
                                                   
                                                   
                                                   
     ****                                          
      *  *******                                   
       *        *******                            
        *              *******                     
         *                    *******              
          *                          ****          
           *                            *          
            *                           *          
             *                         *           
              *                        *           
               *                      *            
                *                     *            
                 *                   *             
                  *                  *             
                   *                *              
                    *               *              
                     *             *               
                      *            *               
                       *          *                
                        *         *                
                         *       *                 
                          *      *                 
                           *    *                  
                            *   *                  
                             * *                   
                              *                    
                                                   
                                                   
                                                   
                                                   


