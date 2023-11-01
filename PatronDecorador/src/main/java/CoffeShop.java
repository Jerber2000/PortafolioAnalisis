public class CoffeShop {
    public static void main(String[] args){
        HouseBlend houseBlend=new HouseBlend();
        System.out.println(houseBlend.getDescription()+":"+houseBlend.cost());

        Milk milkAddOn = new Milk(houseBlend);
        System.out.println(milkAddOn.getDescription()+":"+milkAddOn.cost());

        Sugar SugaAddOn = new Sugar(houseBlend);
        System.out.println(SugaAddOn.getDescription()+":"+SugaAddOn.cost());
    }

}
