public class Espresso implements Beverage {
    String description;
    public Espresso(){
        description = "에스프레소";
        System.out.println(this.getClass().getName());
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
