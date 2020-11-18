package Fruit;

/**
 * @author yuhan
 * @date 12.11.2020 - 10:14
 * @purpose
 */
public class Fruit {

    int id = 0;
    boolean Import = true; //1) Импортные ли фрукты? – бинарный
    int weight = 0; //2) Индивидуальный вес плодов - количественный
    int price =0; //3) ПЦена за килограмм – количественный
    int discount =0; //4)Скидка на фрукты– количественный
    int shelfLife = 0;//5) Срок годности – количественный
    Sweetness sweetness; // Сладость
    Hardness hardness; // твердость
    Food food; // Еда из фруктов

    public Fruit() {
    }

    public Fruit(int id, boolean anImport, int weight, int price, int discount, int shelfLife, Sweetness sweetness, Hardness hardness, Food food) {
        this.id = id;
        Import = anImport;
        this.weight = weight;
        this.price = price;
        this.discount = discount;
        this.shelfLife = shelfLife;
        this.sweetness = sweetness;
        this.hardness = hardness;
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //    public Fruit.Fruit(boolean anImport, int weight, int price, int discount, int shelfLife, Fruit.Sweetness sweetness, Fruit.Hardness hardness, Fruit.Food food) {
//        Import = anImport;
//        this.weight = weight;
//        this.price = price;
//        this.discount = discount;
//        this.shelfLife = shelfLife;
//        this.sweetness = sweetness;
//        this.hardness = hardness;
//        this.food = food;
//    }

    public boolean getImport() {
        return Import;
    }

    public void setImport(boolean Import) {
        Import = Import;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Sweetness getSweetness() {
        return sweetness;
    }

    public void setSweetness(Sweetness sweetness) {
        this.sweetness = sweetness;
    }

    public Hardness getHardness() {
        return hardness;
    }

    public void setHardness(Hardness hardness) {
        this.hardness = hardness;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Fruit.Fruit{" +
                "id=" + id +
                ", Import=" + Import +
                ", weight=" + weight +
                ", price=" + price +
                ", discount=" + discount +
                ", shelfLife=" + shelfLife +
                ", sweetness=" + sweetness +
                ", hardness=" + hardness +
                ", food=" + food +
                '}';
    }
}
