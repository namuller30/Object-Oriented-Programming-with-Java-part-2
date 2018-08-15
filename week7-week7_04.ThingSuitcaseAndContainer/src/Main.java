
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int x=1;
        for (int j=0;j<100;j++){ 
            Suitcase suitcase = new Suitcase(100);
            
            Thing brick = new Thing("Brick", x);
            
            suitcase.addThing(brick);
            
            container.addSuitcase(suitcase);
            x++;
        }
        
    }
}
    


