package basic_class;

public class Demo {
    public static void main(String[] args) {
        Car hyundai = new Car();
        hyundai.color = "white";
        hyundai.size = 100;
        hyundai.wheels = 4;
        Car i10 = new Car("green",500,5);
        System.out.println(hyundai.color);
        System.out.println(hyundai.size);
        System.out.println(hyundai.wheels);
        System.out.println(i10.color);
        System.out.println(i10.size);
        System.out.println(i10.wheels);
    }
}
