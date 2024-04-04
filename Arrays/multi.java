class multi {
    public static void main(String args[]) {
        int marks[][] = {
            {67, 76, 87, 89, 98},
            {78, 98, 65, 90, 20},
            {56, 9, 65, 45, 78} // Removed leading zero from 09
        };

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
