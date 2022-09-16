package project1;

public class Main {

    public static void main(String[] args) {
        switch (Integer.parseInt(args[0])){
            case 0 -> scitat(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
            case 1 -> odcitat(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
            case 2 -> nasobit(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
            case 3 -> delit(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
            default -> help();
        }
    }

    static void scitat(double a, double b){
        System.out.println(a+b);
    }
    static void odcitat(double a, double b){
        System.out.println(a-b);
    }
    static void nasobit(double a, double b){
        System.out.println(a*b);
    }
    static void delit(double a, double b){
        System.out.println(a/b);
    }
    static void help(){
        System.out.println("0 = scitat, 1 = odcitat, 2 = nasobit, 3 = delit");
    }
}
