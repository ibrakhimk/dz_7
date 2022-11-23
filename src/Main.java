public class Main {
    public static void main(String[] args) {
        Megic magic =new Megic();
        Warrior warrior= new Warrior();
        Medic medic=new Medic();
        Hero[] heroes = {medic,warrior,magic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}