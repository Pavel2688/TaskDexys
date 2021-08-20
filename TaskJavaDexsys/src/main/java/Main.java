import repositopy.ArrayPoint;
import repositopy.Point;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayPoint arrayPoint = new ArrayPoint();
        Scanner scanner = new Scanner(System.in);
        boolean f=true;

        while (f){
            help();
            System.out.println("Введите число от 0 до 5");
            int n = scanner.nextInt();
            if (n==1){
                System.out.println("Введите координаты точек");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                arrayPoint.add(new Point(x,y));
            }
            if(n==2){
                System.out.println("Введите номер группы");
                int i = scanner.nextInt();
                if(i<=0 || i>5)
                    System.out.println("такой группы нету");
                else
                    arrayPoint.print(i);
            }
            if (n==3){
                arrayPoint.print();
            }
            if (n==4){
                System.out.println("Введите группу которую хотите очистить");
                int i = scanner.nextInt();
                if(i<=0 || i>5)
                    System.out.println("такой группы нету");
                else
                    arrayPoint.remove(i);
            }

            if (n==5){
                arrayPoint.clear();
            }

            if (n==0)
                f=false;
            System.out.println("*****************************");
        }
    }

    private static void help(){
        System.out.println("Справка:");
        System.out.println("1 add    - добавить точки ");
        System.out.println("2 print  - напечатать одну выбранную группу");
        System.out.println("3 print  - вывести все группы");
        System.out.println("4 remove - удалить группу");
        System.out.println("5 clear  - очистить память");
        System.out.println("0        - завершить программу");
    }
}
