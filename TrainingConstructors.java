public class TrainingConstructors {
    private int id;
    private String name;

    TrainingConstructors(int id, String name){
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
        
        TrainingConstructors obj1 = new TrainingConstructors(1, "Kuba");
        TrainingConstructors obj2 = new TrainingConstructors(2, "Janek");
        
        System.out.println("id: " + obj1.getId() + " imie: " + obj1.getName());
        System.out.println("id: " + obj2.getId() + " imie: " + obj2.getName());
        
        obj1.setId(4);
        obj1.setName("Panik");
        
        System.out.println("id: " + obj1.getId() + " imie: " + obj1.getName());
        System.out.println("id: " + obj2.getId() + " imie: " + obj2.getName());
    }
}
