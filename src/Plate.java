import java.util.Scanner;

public class Plate {
    private int food;
    private boolean staiety;

    public Plate(int food){
        this.food = food;
    }
    //public void decreaseFood(String name, int n){
    public void decreaseFood(String name, int n){
        Scanner sc = new Scanner (System.in);

        if (food>=n) {
            food -= n;
            isStaiety();
            System.out.println("Кошка "+name+" поела: "+isStaiety());
        } else {
            isStaiety();
            System.out.println("В тарелке недостаточно еды. Кошка "+name+" голодает.Нужно еды: "+n +" Осталось "+food);
            System.out.println("Хотите добавить еды в тарелку? Y или N");
            String y = sc.next();
            String y1="Y";
            if (y1.equals(y)){
                addPlate(n);
                decreaseFood(name,n);}
            else {
                System.out.println(name+ " очень сильно на Вас обиделся. Прячьте тапки");

                }

        }
    }

    public void addPlate(int n){
        int dobavit;
        if (food<n) {
            dobavit =n-food;
            food+=dobavit;
            System.out.println("В тарелку добавили еду "+dobavit);
        }
    }


    private boolean isStaiety() {
        staiety=true;
        return staiety;
    }

    public void info (){
        System.out.println("Еды осталось: "+food);
    }
}
