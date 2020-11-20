public class Problem2 {
    public static void main(String[] args) {
        // Modify the Animal class by implementing the Comparable interface and Cloneable interface.

        Animal[] list = new Animal[5];
        list[0] = new Chicken();
        list[0].setWeight(4.5);
        list[1] = new Tiger();
        list[1].setWeight(46.6);
        list[2] = new Chicken();
        list[2].setWeight(1.5);
        list[3] = (Animal)(list[0].clone());
        list[3].setWeight(7.5);
        list[4] = (Animal)(list[1].clone());
        java.util.Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println("weight: " + list[i].getWeight());
        }
    }
}
interface Edible {
    /** Describe how to eat */
    public abstract String howToEat();
}
abstract class Animal implements Cloneable, Comparable<Animal> {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sound();

    @Override public Object clone() { // clone the object
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
    @Override public int compareTo(Animal w) { // compare the weights
        if (weight > w.getWeight())
            return 1;
        else if (weight < w.getWeight())
            return -1; 
        else
            return 0;
    }
}
class Chicken extends Animal implements Edible {
    @Override public String howToEat() {
        return "Chicken: Fry it";
    }
    @Override public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}
class Tiger extends Animal {
    @Override public String sound() {
        return "Tiger: RROOAARR";
    }
}
