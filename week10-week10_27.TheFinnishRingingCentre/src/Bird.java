
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    @Override
    public boolean equals(Object other){
        if (other == null){
            return false;
        }
        
        if (!Bird.class.isAssignableFrom(other.getClass())){
            return false;
        }
        final Bird otherBird = (Bird) other;
        if (!(this.latinName.equals(otherBird.latinName))){
            return false;
        }
        else if(!(this.ringingYear==otherBird.ringingYear)){
            return false;
        }
        else{
            return true;
        }
        
    }
    
    @Override
    public int hashCode(){
        int result=17;
        result=31*result+this.latinName.hashCode();
        return result;
    }
}


