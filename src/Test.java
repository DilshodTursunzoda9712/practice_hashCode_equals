public class Test {
    public static void main(String[] args) {
        Man man1 = new Man("Sergey Popov","green","black",187438);
        Man man2 = new Man("Igor Popov","green","black",167312);

        System.out.println("their DNA doesn't match: ");
        System.out.println(man1.equals(man2));

        System.out.println("their DNA: ");
        System.out.println("man1: " + man1.hashCode());
        System.out.println("man2: " +man2.hashCode());
    }
}