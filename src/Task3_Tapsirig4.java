public class Task3_Tapsirig4 {
    public static void main(String[] args){
        int a = 15;
        int b = 40;
        System.out.println("a= " +a + ", b= " + b);

        int temp = a; // a dəyişəninin dəyərini tempdə saxlayırıq
        a = b;        // b nin dəyərini a ya yazırıq
        b=temp;       // temp də saxladığımız əvvəlki a dəyərini b yə göstəririk
        System.out.println("a= " + a + ", b= " + b);



    }
}

