public class KlasaA {
    private int id;
    private String name;

    KlasaA(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        KlasaA obj1 = new KlasaA(1, "Kuba");
        KlasaA obj2 = new KlasaA(2, "Janek");
        System.out.println("id: " + obj1.getId() + " imie: " + obj1.getName());
        System.out.println("id: " + obj2.getId() + " imie: " + obj2.getName());
        obj1.setId(4);
        obj1.setName("Panik");
        System.out.println("id: " + obj1.getId() + " imie: " + obj1.getName());
        System.out.println("id: " + obj2.getId() + " imie: " + obj2.getName());
    }
}
