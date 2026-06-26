public class Task3_Tapsirig7 {
    public static void main(String[] args){

        double temp = 36.8;
        int suret = 95;
        int yanacaq = 0;
        boolean aktiv = false;
        double balans = -50.0;
        String ad = "Anar";
        int yas = 22;

        boolean temperatur = temp > 36 && temp < 37.5;
        boolean suretVeyayanacaq = (suret > 0 && suret < 120) || yanacaq > 0;
        boolean hesab = !aktiv || balans < 0;
        boolean melumatDogrudur = ad.length() > 0 && yas > 18;
        System.out.println("Temperatur uyğundur: " + temperatur);
        System.out.println("Sürət və ya yanacaq: " + suretVeyayanacaq);
        System.out.println("Hesab problemi: " + hesab);
        System.out.println("Məlumat doğrudur: " + melumatDogrudur);

    }
}
