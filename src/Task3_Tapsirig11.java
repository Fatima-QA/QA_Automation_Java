public class Task3_Tapsirig11 {
    public static void main(String[] args){
        String parol = "Abb@2024";

        boolean uzunUygun = parol.length() > 8;

        boolean xarakterVar = parol.contains("@");

        boolean abbIlebaslayir = parol.toUpperCase().startsWith("ABB");

        boolean reqemVar = parol.contains("2024");

        boolean gucluParol = uzunUygun && xarakterVar && abbIlebaslayir && reqemVar;

        System.out.println("Uzunluq uyğun: " + uzunUygun);
        System.out.println("@ simvolu var: " + xarakterVar);
        System.out.println("ABB ilə başlayır: " + abbIlebaslayir);
        System.out.println("2024 var: " + reqemVar);
        System.out.println("Güclü parol: " + gucluParol);




    }
}
