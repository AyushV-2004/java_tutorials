class arrayex {
    public static void main(String ar[]) {
        int one[] = { 1, 2, 3, 4, 5 };
        int two[][] = {

                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };

        System.out.print("One Dimentional Array...!!!");
        for (int i = 0; i < 5; i++) {
            System.out.print(one[i]);
        }

        System.out.print("Two Dimentional Array...!!!");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(two[i][j]);
            }
        }
    }
}