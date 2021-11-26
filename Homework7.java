/**
 * JAVA 1 Homework 7
 * 
 * @author Oksana Ilyakova
 * @version 26.11.2021
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
        plate.add(50);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setSated(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    protected String name;
    protected int appetite;
    protected boolean sated;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        sated = false;
    }

    void setSated(boolean status) {
        sated = status;
    }

    void eat(Plate plate) {
        if(!sated) {
            sated = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "{name= " + name + ", appetite= " + appetite + ", sated= " + sated + "}";
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
}
