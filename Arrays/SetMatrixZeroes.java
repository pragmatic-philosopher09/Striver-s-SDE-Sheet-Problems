package Arrays;

import java.util.*;
class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
       
     int m = matrix.length; int n = matrix[0].length;
        Queue<Integer> q = new ArrayDeque<>();
     for(int i = 0; i<m;i++)
     {
         for(int j = 0; j<n;j++)
         {
             if(matrix[i][j] == 0)
             {
                 q.add(i);
                 q.add(j);
             }
         }
     }
        
        while(!q.isEmpty())
        {
            int row = q.poll();
            int col = q.poll();
            
            for(int j = 0; j<n;j++)
            {
                matrix[row][j] = 0;
            }
            
            for(int i = 0; i<m;i++)
            {
                matrix[i][col] = 0;
            }
        }
        
    }
}