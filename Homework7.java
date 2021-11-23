/**
 * JAVA 1 Homework 7
 * 
 * @author Oksana Ilyakova
 * @version 23.11.2021
 */

class Homework7 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Tima", 150), new Cat("Busya", 100), new Cat("Sima", 50)
        };
        Plate plate = new Plate(300,40);
        System.out.println(plate);

    for (Cat cat : cats) {
        cat.eat(plate);
        System.out.println(cat);
    }

        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);

    for (Cat cat : cats) {
        cat.setFullness(false);
        cat.eat(plate);
        System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    protected String name;
    protected int appetite;
    protected boolean fullnes;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullnes = false;
    }

    void setFullness(boolean status) {
        fullnes = status;
    }

    void eat(Plate plate) {
        if(!fullnes) {
            fullnes = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "name: " + name + ", appetite: " + appetite + ", fullnes: " + fullnes;
    }
}

class Plate {
    protected int food;
    protected int volume;

    Plate(int food, int volume) {
        this.food = food;
        this.volume = volume;
    }

    boolean decreaseFood(int portion) {
        if(food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }





    void increaseFood() {
        this.food += 400;
        System.out.println("Add 400 grams of feed");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}



    int getSatietyTime() {
        return satietyTime;
    }



    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    Cat(String name, int appetite, int satietyTime) {

        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    void eat(Plate p) {
            p.decreaseFood(appetite);
            satiety += satietyTime;
    }
