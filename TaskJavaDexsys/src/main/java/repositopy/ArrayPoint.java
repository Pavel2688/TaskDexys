package repositopy;

import java.util.ArrayList;

public class ArrayPoint {
    ArrayList<Point> listPoints1 = new ArrayList<Point>(); //точки лежит на или выше линии y=x
    ArrayList<Point> listPoints2 = new ArrayList<Point>(); //точки лежат на или выше линии y=x^2
    ArrayList<Point> listPoints3 = new ArrayList<Point>(); //точка лежит на или выше линии y=x^3
    ArrayList<Point> listPoints4 = new ArrayList<Point>(); //точка не попадает ни в одну из групп

    public void add(ArrayList<Point> point){
        for(Point p: point){
            boolean f = true;
            if (p.getY() >= p.getX()){
                listPoints1.add(p);
                f=false;
            }
            if (p.getY()>=p.getX()*p.getX()){
                listPoints2.add(p);
                f=false;
            }
            if (p.getY()>=p.getX()*p.getX()*p.getX()){
                listPoints3.add(p);
                f=false;
            }
            if (f){
                listPoints4.add(p);
            }

        }
    }

    public void add(Point p){
            boolean f = true;

            if (p.getY() >= p.getX()){
                listPoints1.add(p);
                System.out.println("точка добавленна в первую группу");
                f=false;
            }
            if (p.getY()>=p.getX()*p.getX()){
                listPoints2.add(p);
                System.out.println("точка добавленна во вторую группу");
                f=false;
            }
            if (p.getY()>=p.getX()*p.getX()*p.getX()){
                listPoints3.add(p);
                System.out.println("точка добавленна в третью группу");
                f=false;
            }
            if (f){
                listPoints4.add(p);
                System.out.println("точка не попадает ни в однку из групп");
            }
    }

    public void print (){
        if(listPoints1.isEmpty()){
            System.out.println("группа пуста");
        }else
            for (Point p: listPoints1){
                System.out.print(p);
            }
        System.out.println();


        if(listPoints2.isEmpty()){
            System.out.println("группа пуста");
        }else
            for (Point p: listPoints2){
                System.out.print(p);
            }
        System.out.println();

        if(listPoints3.isEmpty()){
            System.out.println("группа пуста");
        }else
            for (Point p: listPoints3){
                System.out.print(p);
            }
        System.out.println();

        if(!listPoints4.isEmpty())
            System.out.println(listPoints4.size() + " точек не вхлдят ни в одну из групп");


    }

    public void print (int i){
       if (i == 1){
           if(listPoints1.isEmpty()){
               System.out.println("группа пуста");
           }else
               for (Point p: listPoints1){
                   System.out.print(p);
               }
           System.out.println();
       }

       if (i == 2){
           if(listPoints2.isEmpty()){
               System.out.println("группа пуста");
           }else
               for (Point p: listPoints2){
                   System.out.print(p);
               }
           System.out.println();

       }

        if (i == 3){
            if(listPoints3.isEmpty()){
                System.out.println("группа пуста");
            }else
                for (Point p: listPoints3){
                    System.out.print(p);
                }
            System.out.println();
        }
        if (i == 4){
            if(!listPoints4.isEmpty())
                System.out.println(listPoints4.size() + " точек не вхлдят ни в одну из групп");
        }
    }

    public void remove(int i ){
        if (i==1){
            listPoints1.clear();
        }
        if (i==2){
            listPoints2.clear();
        }
        if (i==3){
            listPoints3.clear();
        }
        if (i==4){
            listPoints4.clear();
        }
        System.out.println("группа очищенна");
    }

    public void clear (){
        listPoints1.clear();
        listPoints2.clear();
        listPoints3.clear();
        listPoints4.clear();
        System.out.println("память очищенна");
    }



}
