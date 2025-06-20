public class Main {
    public static void main(String[] args) {
        Logger l1 = Logger.getLogger();
        Logger l2 = Logger.getLogger();

        System.out.println(l1==l2);
    }
}