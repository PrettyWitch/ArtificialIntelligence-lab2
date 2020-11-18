package Fruit;

import Fruit.Fruit;

public class Distance {
    public static void main(String[] args) {

        Fruit Pea = new Fruit(11111,false, 500, 68, 20,365 , Sweetness.GenerallySweet, Hardness.ALittleHard, Food.Dish);
        Fruit SoyBean = new Fruit(11121,true, 200, 100, 0, 365, Sweetness.GenerallySweet, Hardness.Hard, Food.Juice);
        Fruit BroadBean = new Fruit(11123,true,500,280, 0, 365, Sweetness.GenerallySweet, Hardness.ALittleHard, Food.Dish);

        Fruit SunflowerSeed = new Fruit(11211,false,80,35,0, 180, Sweetness.GenerallySweet, Hardness.Hard, Food.Dish);
        Fruit Corn = new Fruit(11222,false,500,120,0,50, Sweetness.VerySweet, Hardness.ALittleHard, Food.Salad);
        Fruit Chestnut = new Fruit(11251,true,500,543,0,21, Sweetness.GenerallySweet, Hardness.ALittleHard, Food.Dish);
        Fruit Lichi = new Fruit(11252,true, 565, 398, 0, 5, Sweetness.VerySweet, Hardness.Soft, Food.Candy);
        Fruit CashewNut = new Fruit(11253,false, 250, 529, 0, 182, Sweetness.GenerallySweet, Hardness.ALittleHard, Food.Jam);

        Fruit Mango = new Fruit(1211,true, 450, 420, 16, 10, Sweetness.VerySweet, Hardness.Soft, Food.Juice);
        Fruit Coconut = new Fruit(1212,true, 500, 389, 0, 30, Sweetness.GenerallySweet, Hardness.Hard, Food.Candy);
        Fruit Peach = new Fruit(1213,false, 200, 80, 0, 4, Sweetness.VerySweet, Hardness.Soft, Food.Jam);
        Fruit Cherry = new Fruit(1214,true,300,141,0,5, Sweetness.GenerallySweet, Hardness.Soft, Food.Pie);
        Fruit Apple = new Fruit(1221,false, 1000, 100, 44,30 , Sweetness.VerySweet, Hardness.Hard, Food.Salad);
        Fruit Pear = new Fruit(1222,true, 800, 184, 8, 45, Sweetness.VerySweet, Hardness.ALittleHard, Food.Yogurt);
        Fruit Grape = new Fruit(1231,true, 500, 125, 17, 14, Sweetness.VerySweet, Hardness.Soft, Food.Yogurt);
        Fruit Tomato = new Fruit(1232,false,250,200, 20, 21, Sweetness.SweetAndSour, Hardness.Soft, Food.Juice);
        Fruit Banana = new Fruit(1233,true, 1700, 100, 0, 14, Sweetness.VerySweet, Hardness.Soft, Food.Salad);
        Fruit Pomegranate = new Fruit(1234,true, 1300, 234, 40, 45, Sweetness.GenerallySweet, Hardness.ALittleHard, Food.Jam);
        //Мандарины
        Fruit Mandarin = new Fruit(1241,true, 1800, 180, 29, 30, Sweetness.SweetAndSour, Hardness.Soft, Food.Candy);
        Fruit Orange = new Fruit(1242,true, 2000, 400, 31, 45, Sweetness.GenerallySweet, Hardness.Soft, Food.Pie);
        //Грейпфрут красный
        Fruit Grapefruit = new Fruit(1243,true, 1500, 225, 0, 45, Sweetness.SweetAndSour, Hardness.Soft, Food.Juice);
        Fruit Lemon = new Fruit(1244,true, 220, 80, 20, 20, Sweetness.Acid, Hardness.Soft, Food.Jam);
        Fruit Strawberry = new Fruit(3111,true, 250, 220, 0, 14, Sweetness.GenerallySweet, Hardness.Soft, Food.Yogurt);
        //Малина
        Fruit Raspberry = new Fruit(3121,true,125,350,10, 20, Sweetness.GenerallySweet, Hardness.Soft, Food.Jam);
        //Джекфрут
        Fruit Jackfruit = new Fruit(321,true, 200, 500, 0,3, Sweetness.GenerallySweet, Hardness.ALittleHard, Food.Candy);
        Fruit Mulberry = new Fruit(322,true, 100, 200, 0, 2, Sweetness.VerySweet, Hardness.Soft, Food.Yogurt);
        Fruit PineApple = new Fruit(323,true,2000,420,0,21, Sweetness.GenerallySweet, Hardness.ALittleHard, Food.Juice);
        //инжир
        Fruit FicusCarica = new Fruit(324,true, 150, 200, 0, 14, Sweetness.VerySweet, Hardness.ALittleHard, Food.Yogurt);

        System.out.println(Banana.toString());
        System.out.println(Orange.toString());
        int[] a = method.tra(Banana,Orange);
        int[] b = method.tra2(Orange);

        method.Euclidean(a,b);              //1) евклидово расстояние
        method.Manhattan(a,b);              //2) Манхэттенских расстояние
        method.Minkowski(a,b);              //3) Минковский Расстояние
        method.Cosine(a,b);                 //4) косинусное расстояние
        method.disNode(a[0],b[0]);          //5)близость по дереву (иерархии)
        method.getPearsonCorrelation(a,b);  //6)корреляция (линейная зависимость признаков (СЛАУ))
    }
}
