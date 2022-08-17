import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Girin:");
        int numb = inp.nextInt();
        System.out.println("4 ün kuvvetleri:");

        for (int i = 1; i<=numb; i*=4){
            System.out.println(i);
        }
        System.out.println("5 in kuvvetleri");
        for (int j = 1; j<=numb; j *=5){
            System.out.println(j);
        }
    }
}
