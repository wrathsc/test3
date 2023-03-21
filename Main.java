import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    System.out.println("wybierz działanie:");
    System.out.println("1- suma:");
    System.out.println("2-różnica:");
    System.out.println("3-iloczyn:");
    System.out.println("4-iloraz:");
    int wyb = scan.nextInt();
    System.out.println("podaj liczbe a:");
    double a = scan.nextDouble();
    System.out.println("podaj liczbe b:");
    double b = scan.nextDouble();
    switch(wyb){
      case 1:
        double sum = a + b;
        System.out.println("suma wprowadzonych liczb to " + sum);
        break;
      case 2:
         double roz= a - b;
        System.out.println("różnica wprowadzonych liczb to " + roz);
        break;
      case 3:
         double ilocz= a * b;
        System.out.println("iloczyn wprowadzonych liczb to " + ilocz);
        break;
      case 4:
        if(b==0){
          System.out.println("niemożna dzielić przez 0");
        }
        else{
         double ilor= a / b;
        System.out.println("iloraz wprowadzonych liczb to " + ilor);
        }
        break;
      default:
        System.out.println("niepoprawne dane");
    }
    
  }
}