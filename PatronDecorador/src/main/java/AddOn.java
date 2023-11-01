public abstract class AddOn extends Beverage{
    protected Beverage beverage;

    public AddOn(String desctiption, Beverage bev) {
        super(desctiption);
        this.beverage=bev;
    }
    public abstract String getDescription();
}
