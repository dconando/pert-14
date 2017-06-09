
    package genapp2;

public class GenApp4 <D> {
 private D type;
    
    public D getType() {
        return type;
        
    }
    
    public void setType (D type) {
        this.type = type;
    }
 
    private static <A> void call (A freeParType){
        System.out.println(freeParType);
    }
    
    private static <B> void OOP (){
        System.out.println();
    }
    
    public static void main (String [] args){
        call(23);
    }
}   