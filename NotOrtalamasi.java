import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {

        int mat,fiz,kim,turk,tarih,muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notu girin= ");
        mat = inp.nextInt();
        System.out.print("Fizik notu girin= ");
        fiz = inp.nextInt();
        System.out.print("Kimya notu girin= ");
        kim = inp.nextInt();
        System.out.print("Türkçe notu girin= ");
        turk = inp.nextInt();
        System.out.print("Tarih notu girin= ");
        tarih = inp.nextInt();
        System.out.print("Müzik notu girin= ");
        muzik = inp.nextInt();
        int top = (mat + fiz + kim + turk + tarih + muzik);
        double ort = top / 6.0;
        int a = 60;
        boolean kosul1 = ort > a;
        System.out.println("Ortalamanız : " + ort);
        String str = kosul1 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
