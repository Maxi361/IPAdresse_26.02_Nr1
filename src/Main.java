public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Prüfer prüfer = new Prüfer("150");
        if (prüfer.sagtJa() == true)
            System.out.println("Ja");

        if (prüfer.sagtJa() == false)
            System.out.println("nein");
        //else;
        //System.out.println("Nein");


    }
}