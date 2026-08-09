package enumExample;

enum Laptop{
    HP(60000), Dell(50000), Lenova, Sumsung;

    private int price ;


    private Laptop(int price) {
        this.price = price;
    }

    // default value assigning for above object 
    Laptop(){
        price=30000;
    }

    public void setPrice(int price){
        this.price=price;
    }
    public int getprice(){
        return price;
    }
}

public class EnumWithClass {
    public static void main(String[] args) {
        Laptop lap=Laptop.HP;
        System.out.println(lap+" "+lap.getprice());

        Laptop lap2=Laptop.Lenova;
        System.out.println(lap2+" "+lap2.getprice());


    }

}
