public class Task3_Tapsirig10 {
    public static void main(String [] args){

        int    meblег = 5000;
        int    faiz   = 15;
        // double faizMeblegi = meblег * faiz / 100;
        //// Yanlış int * int / int hesablandığı üçün bütün nəticələr int olur və onluq hissəsi itir.

        //Doğrusu
        double faizMeblegi = meblег * faiz / 100.0;
        System.out.println("Faiz məbləği: " + faizMeblegi);

// Gözlənilən: 750.0   Əsl çıxış: 750



    }
}
