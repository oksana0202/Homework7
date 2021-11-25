/**
 * JAVA 1 Homework 7
 * 
 * @author Oksana Ilyakova
 * @version 25.11.2021
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
        return "name= "( + name + ", appetite= " + appetite + ", fullnes= " + fullnes)";
    }
}

class Plate {
    protected int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if(food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food += food) {
        }
    }

    @Override
    public String toString() {
        return "plate: " + food;
    }
}
