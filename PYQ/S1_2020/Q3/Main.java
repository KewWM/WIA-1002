package S1_2020.Q3;

public class Main {

    public static void main(String[] args) {
        LL myLL = new LL();

        myLL.createNode("Lord of The Rings", 500);
        myLL.createNode("Tale of the Body Thief", 1);
        myLL.createNode("Memnoch the Devil", 100);
        myLL.createNode("Heart of a Samurai", 10);
        myLL.display();
        myLL.addAfter("Memnoch the Devil", "White Crane", 10);
        myLL.addAfter("White Crane", "Memoirs of a Geisha", 90);
        myLL.removeNode("Harry Potter");
        myLL.removeNode("Heart of a Samurai");
        myLL.display();
    }
}
