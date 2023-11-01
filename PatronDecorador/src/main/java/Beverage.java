public abstract class Beverage {

    private String description;

    public Beverage(String desctiption){
        super();
        this.description= desctiption;
    }
    public String getDescription(){
        return  description;

    }
    public abstract  double cost();
}
