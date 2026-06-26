public class Task3_Tapsirig9 {
    public static void main(String[] args){

        String kod = "  abb-2024  ";

        System.out.println(kod.trim().length());                    // ? — cavab: 12 səhv, boşluqlar da uzunluğa daxil edilib.
        System.out.println(kod.toUpperCase().contains("ABB"));              // ? — cavab: false, contains() böyük-kiçik hərfə həssasdır (case-sensitive). "abb" və "ABB" eyni deyil.
        System.out.println(kod.trim().equals("abb-2024"));         // ? — cavab: false  // == String dəyərini müqayisə etmir. Düzgün üsul: kod.trim().equals("abb-2024")
        System.out.println(kod.toUpperCase().contains("ABB")); // ? — gözlənilən: true cavab: true,  toUpperCase() nəticəsində "  ABB-2024  " alınır və "ABB" mövcuddur


    }


    }

