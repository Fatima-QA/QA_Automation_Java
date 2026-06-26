public class Task3_Bonus {
    public static void main(String[] args) {

        // Sabitlər
        final int MIN_YAS = 18;
        final int MIN_PAROL_UZUNLUQ = 8;
        final double MIN_GELIR = 500.0;

        // İstifadəçi məlumatları
        String ad = "Fatimə";
        int yas = 22;
        double gelir = 1500.0;
        String parol = "Abb@2024";
        String email = "fatime@gmail.com";

        // Adı formatlayırıq
        String formatliAd = ad.substring(0, 1).toUpperCase()
                + ad.substring(1).toLowerCase();

        // Yoxlamalar
        boolean adDogrudur = ad.length() > 0;
        boolean yasUygundur = yas >= MIN_YAS;
        boolean gelirUygundur = gelir > MIN_GELIR;
        boolean parolUygundur = parol.length() >= MIN_PAROL_UZUNLUQ;
        boolean emailUygundur = email.contains("@");

        // Yekun qeydiyyat nəticəsi
        boolean qeydiyyatUgurludur = adDogrudur && yasUygundur && gelirUygundur && parolUygundur && emailUygundur;

        // Nəticələr
        System.out.println("=== Bank Mobil Tətbiqi ===");
        System.out.println("İstifadəçi: " + formatliAd);
        System.out.println();

        System.out.println("Ad boş deyil: " + adDogrudur);
        System.out.println("Yaş uyğundur: " + yasUygundur);
        System.out.println("Gəlir uyğundur: " + gelirUygundur);
        System.out.println("Parol uyğundur: " + parolUygundur);
        System.out.println("Email uyğundur: " + emailUygundur);

        System.out.println();
        System.out.println("Qeydiyyat uğurludur: " + qeydiyyatUgurludur);

    }
}
