rpublic class SevenSegment2 {

    public static void asterisk(String numbers) {
      
        String segment[][] = new String[][] {
            {"#", "#", "#", "#", "#"},
            {"#", " ", " ", " ", "#"},
            {"#", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#"},
            {"#", " ", " ", " ", "#"},
            {"#", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#"}
        };

       
        for (int row = 0; row < segment.length; row++) {
            // Loop through each column of the segment
            for (int column = 0; column < segment[row].length; column++) {
                // Determine if the corresponding segment should be turned off
                if (numbers.charAt(7) == '1') {
                    if (numbers.charAt(0) == '0') {
                        segment[0][1] = " ";
                        segment[1][2] = " ";
                        if (numbers.charAt(1) == '0') {
                            segment[1][0] = " ";
                            if (numbers.charAt(2) == '0') {
                                segment[3][3] = " ";
                                if (numbers.charAt(3) == '0') {
                                    segment[4][0] = " ";
                                    segment[4][1] = " ";
                                    segment[4][2] = " ";
                                    if (numbers.charAt(4) == '0') {
                                        segment[3][0] = " ";
                                        if (numbers.charAt(5) == '0') {
                                            segment[1][0] = " ";
                                            if (numbers.charAt(6) == '0') {
                                                segment[2][0] = " ";
                                                segment[2][1] = " ";
                                                segment[2][2] = " ";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                // Print the current segment character
                System.out.print(segment[row][column] + " ");
            }
            // Move to the next line after printing all columns of the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Call the asterisk method with a string of numbers representing segments
        asterisk("11111111");
    }
}
