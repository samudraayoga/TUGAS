package livingthings;

public class prapcoyo extends Animal1 {
    String aksesoris;
    public prapcoyo(String name, int umur, String color, String aksesoris) {
        super(name, umur, color);
        this.aksesoris = aksesoris;
    }

    public void eatmethod(){
        System.out.println("Prapcoyo is eating");
      
    }

    
}
