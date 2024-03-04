package pertemuan2;
import livingthings.Animal1;
import livingthings.Oceanid;
import livingthings.bambang;
public class Main {
    public static void main(String[] args) {
        Oceanid oceanid = new Oceanid();
        System.out.println(oceanid.name);
        System.out.println(oceanid.umur);
        System.out.println(oceanid.color);

        Animal1 animal = new Animal1("Duck", 2, "White");
        System.out.println(animal.name);
        System.out.println(animal.umur);
        System.out.println(animal.color);


        bambang bambang = new bambang("bambang", 3, "Black", "Sunglasses");
        bambang.eatmethod();
        
    }
}
