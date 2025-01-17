// Name: Nima Memarzadeh
// Date: 01/17/2025
// Assignment: Module 3 Programming Assignment


// This program generates a pattern of numbers and `@` symbols 
// ased on the number of rows provided.
// output:
//          1                      @
//        1 2 1                    @
//       1 2 4 2 1                 @
//      1 2 4 8 4 2 1              @
//     1 2 4 8 16 8 4 2 1          @
//   1 2 4 8 16 32 16 8 4 2        @
// 1 2 4 8 16 32 64 32 16 8 4 2 1  @


public class PatternGenerator {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern

        String[] patternArray = new String[rows];
        int widestRowWidth = calculateMaxRowWidth(rows);

        // Generate rows
        for (int row = 0; row < rows; row++) {
            String rowPattern = "";

            // Add leading spaces to center-align the pattern
            int leadingSpaces = (rows - row);
            for (int i = 0; i < leadingSpaces; i++) {
                rowPattern += "  ";
            }

            // Generate ascending numbers
            int value = 1;
            for (int i = 0; i <= row; i++) {
                rowPattern += value;
                if (i < row) {
                    rowPattern += " ";
                }
                value *= 2;
            }

            // Generate descending numbers
            value /= 2;
            for (int i = row - 1; i >= 0; i--) {
                value /= 2;
                rowPattern += " " + value;
            }

            // Add spaces for alignment of `@` symbol
            int currentRowLength = rowPattern.length();
            int extraPaddingSpaces = widestRowWidth - currentRowLength;

            for (int i = 0; i < extraPaddingSpaces; i++) {
                rowPattern += " ";
            }

            // Add the `@` symbol, skipping the extra spaces for the last row
            if (row != rows - 1) {
                rowPattern += "  ";
            }
            rowPattern += "  @";

            // Store the row pattern
            patternArray[row] = rowPattern;
        }

        // Print the pattern from the array
        for (String row : patternArray) {
            System.out.println(row);
            System.out.println();
        }
    }

    private static int calculateMaxRowWidth(int rows) {
        int maxWidth = 0;
        for (int row = 0; row < rows; row++) {
            int width = 0;
            int value = 1;

            // Calculate the width of ascending numbers
            for (int i = 0; i <= row; i++) {
                width += getNumberWidth(value);
                if (i < row) {
                    width++; // Space after number
                }
                value *= 2;
            }

            // Calculate the width of descending numbers
            value /= 2;
            for (int i = row - 1; i >= 0; i--) {
                value /= 2;
                width++; // Space before number
                width += getNumberWidth(value);
            }

            maxWidth = Math.max(maxWidth, width);
        }
        return maxWidth;
    }

    private static int getNumberWidth(int number) {
        if (number < 10) {
            return 1; // Single digit
        } else if (number < 100) {
            return 2; // Two digits
        } else {
            return 3; // Three digits
        }
    }
}
