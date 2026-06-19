public class Tapsirig14 {
    public static void main(String[] args) {
        int n = 84;

        boolean cut = (n % 2 ==0 );
        boolean musbet = (n > 0 );
        boolean uceBolunur = (n % 3 ==0 );
        boolean yeddiyeBolunur = ( n % 7 ==0);
        boolean ucVeyeddiye = (n % 3 ==0 ) && (n % 7 ==0);
        boolean araliq = ( n > 10 && n < 100);

        System.out.println("n = " + n);
        System.out.println("Cüt? " + cut);
        System.out.println("Müsbət? " + musbet);
        System.out.println("3-ə bölünür? " + uceBolunur);
        System.out.println("7-yə bölünür? " + yeddiyeBolunur);
        System.out.println("Həm 3-ə, həm də 7-yə bölünür? " + ucVeyeddiye);
        System.out.println("10-dan böyük, 100-dən kiçik? " + araliq);




    }
}
