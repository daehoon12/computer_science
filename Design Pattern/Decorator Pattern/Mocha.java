public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage =beverage;
        System.out.println(this.beverage.getClass().getName());
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ". 모카";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
