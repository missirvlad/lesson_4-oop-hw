package homework;

public class Program {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        System.out.println("Ящик с яблоками 1 весит: " + appleBox1.getWeight());
        System.out.println("Ящик с яблоками 2 весит: " + appleBox2.getWeight());
        System.out.println("Ящики с яблоками равны по весу? " + appleBox1.compare(appleBox2));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Ящик с апельсинами весит: " + orangeBox.getWeight());
        System.out.println("Ящик с яблоками 1 и ящик с апельсинами равны по весу? " + appleBox1.compare(orangeBox));

        Box<Apple> appleBox3 = new Box<>();
        appleBox1.transferFruits(appleBox3);

        System.out.println("Ящик с яблоками 1 весит после перемещения: " + appleBox1.getWeight());
        System.out.println("Ящик с яблоками 3 весит после перемещения: " + appleBox3.getWeight());
    }
}