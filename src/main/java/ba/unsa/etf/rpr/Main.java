package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesi neki broj");
        Integer ulaz = Integer.parseInt(args[0]);
        System.out.println("Faktorijel je: ");
        Faktorijel f = new Faktorijel();
        System.out.println(f.vratifakt(ulaz));
        System.out.println("Sinus broja " + ulaz + " je: " );
        Sinus s = new Sinus();
        System.out.println(s.getSinus(ulaz));

    }
}