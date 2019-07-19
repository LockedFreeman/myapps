public class Random {

    void createLeftBottomTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }


    void createLeftTopTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }


    void createRightTopTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width - i; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        System.out.println();

    }

    void createRightBottomTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
    }


    void createBottomTriangle(int width) {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


    }

    void createDiamond(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = width; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = width; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for (int i = width; i >= 0; i--) {
            for (int j = width; j > i; j--) {
                System.out.print("");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = width; j > i; j--) {
                System.out.print("");
            }
            System.out.println("");

        }
    }
}