public class HomeWorkApp2 {
    public static void main(String[] args) {

        Boolean sum = Numbers(5, 5);
        System.out.println(sum);

        Numbers2(0);

        Boolean a = Number3(-1);
        System.out.println(a);

        Number4("lol", 3);
    }

    public static boolean Numbers(int a, int b) {
        int sum = (a + b);
        if (sum >= 10) {
        }
        if (sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void Numbers2(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean Number3(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void Number4(String word, int times) {
        ;
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }


    }
}