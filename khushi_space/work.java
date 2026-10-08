interface Fruit{
    void banana();
} 

interface Vegitables{
    void onion();
}

class Kitchen implements Fruit, Vegitables{
    public void fruit(){
        System.out.println("you pick fruit");
    }
    public void vegitables(){
        System.out.println("you pick vegitable");
    }

}

class Main{
    public static void main(String[] args) {
        Kitchen c1 = new Kitchen();
        c1.banana();
    }
}