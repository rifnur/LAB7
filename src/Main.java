public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat ("Барсик",5,false);
        Cat cat2 = new Cat ("Черныш",45,false);
        Cat cat3 = new Cat ("Барбосса",45,false);
        Cat cat4 = new Cat ("Жирдяй",25,false);
        Cat cat5 = new Cat ("Гарфилд",50,false);
         Plate plate1 = new Plate(100);
        Plate plate2 = new Plate(10);
        plate1.info();
        cat1.eat(plate1);
        plate1.info();
        cat2.eat(plate1);
        plate1.info();
        cat3.eat(plate1);
        plate1.info();
        cat4.eat(plate1);
        plate1.info();
        cat5.eat(plate1);
        plate1.info();

      /* Plate plate1 = new Plate(100);
       Cat[] arrayCat = new Cat[3];
        arrayCat[0] = new Cat("Барсик",5,false);
        arrayCat[1] = new Cat("Черныш",45,false);
        arrayCat[2] = new Cat("Барбосса",45,false);
        arrayCat[3] = new Cat("Жирдяй",25,false);
        arrayCat[4] = new Cat("Гарфилд",50,false);
         System.out.println(arrayCat.length);
for (int i = 0;i<arrayCat.length;i++){
    for (int j = 0;j<3;j++){
       // Cat cat1 = new Cat ("Барсик",5,false);

        Cat arrayCat[i] = new Cat (arrayCat[i].name.,arrayCat[i],arrayCat[i]);
        arrayCat[i].eat(plate1);
        plate1.info();
    }
}*/


     /*   plate1.info();
        cat1.eat(plate1);
        plate1.info();
*/

    }
}
