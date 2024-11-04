class Player{
    String name;

    Player(String n){
        name = n;
    }

    void show(){
        System.out.println("Name :" + name);
    }
}
class Cricket_Player extends Player{
    String role;

    Cricket_Player(String nm, String r){
        super(nm);
        role = r;
    }
    void display(){
        System.out.println("\n Cricket Player");
        show();
        System.out.println("Role: " +role);
    }
}
class Football_Player extends Player{
    String role;
    Football_Player(String nm, String r){
        super(nm);
        role = r;
    }

    void display(){
        System.out.println("\n Football Plater");
        show();
        System.out.println("Role: " +role);
    }
}

class Hockey_player extends Player{
    String role;
    Hockey_player(String nm, String r){
        super(nm);
        role = r;
    }

    void display(){
        System.out.println("\n Hockey Plater");
        show();
        System.out.println("Role: " +role);
    }
}

class PlayerDemo{
    public static void main(String[] args){
        Cricket_Player obj1 = new Cricket_Player("AAA","Batsman");
        Football_Player obj2 = new Football_Player("BBB","Goalkeeper");
        Hockey_player obj3 = new Hockey_player("CCC","Captain");
        obj1.display();
        obj2.display();
        obj3.display();
    }
}