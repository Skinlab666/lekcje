package firstprogram;

//konwencja nazewnictwa: z dużej litery i camel case
//plik w którym piszemy kod źródłowy (kod programu)
public class FirstProgram {
    //początek programu - metoda main
    public static void main(String[] args) {
        //wiadomość którą chcecie wypisać na ekran
        //każda instrukcja musi być zakończona średnikiem
        System.out.println("Witaj świecie!!!");

        System.out.println("Hail Metal!!!");

        int DuzeButy = 1;
        int MaleButy = 1;

        System.out.println(DuzeButy + MaleButy);
        int someNumber = 8;
        int otherNumber = 2;
        int suma = someNumber + otherNumber;
        int cosTam = someNumber - otherNumber;
        System.out.println(cosTam + cosTam);


        System.out.println("suma " + suma);
        System.out.println("suma " + (someNumber + otherNumber));
        /*
         co się wydarzyło w momecie odpalenia programu
           -kod z klasy FirstProgram.java został przetłumaczony na FirstProgram.class - kod bajtowy
        * */
    }
}
