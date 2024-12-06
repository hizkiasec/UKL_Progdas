public class mudah {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i + ". saya anak wikusama");
            } else if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else if (i == 1) {
                System.out.println(i + ". saya senang");
            }
        }
    }
}