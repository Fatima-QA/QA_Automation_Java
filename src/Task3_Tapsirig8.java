public class Task3_Tapsirig8 {
    public static void main(String [] args){
        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

// Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalı

        boolean yasUygun  = yas >= 21 && yas <= 65;   // nəticə: Səhv: yas > 21 yazılsa, 21 yaşlı şəxs uyğun sayılmayacaq.
        // Düzgün: 21 yaş da daxil olduğu üçün >= istifadə edilir.
        boolean gelirUygun = gelir > 800;              // nəticə: true  — səhvlik yoxdur
        boolean uygun = yasUygun && gelirUygun && tarix; // || və ya istifadə edilməməlidir, && istifadə edilməli bütün şərtlər eyni anda ödənməlidir.

        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Kredit:      " + uygun);



    }
}
