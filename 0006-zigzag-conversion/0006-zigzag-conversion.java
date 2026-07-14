class Solution {
    public String convert(String s, int numRows) {

if (numRows == 1) return s;
int n = s.length();
    char[][] arr = new char[numRows][n];

    int row = 0;
        int col = 0;
        int i = 0;

        while (i < n) {

            // Down
          for (row = 0; row < numRows && i < n; row++) {
              arr[row][col] = s.charAt(i++);
            }

            row = numRows - 2;
            col++;

          // Diagonal Up
    while (row > 0 && i < n) {
                arr[row][col] = s.charAt(i++);
                row--;
                col++;
            }
        }

     StringBuilder ans = new StringBuilder();

    for (int r = 0; r < numRows; r++) {
        for (int c = 0; c < n; c++) {
           if (arr[r][c] != '\0')
                ans.append(arr[r][c]);
            }
        }

     return ans.toString();
    }
}