
package pkg2;

public class Main <T> {

private T type;
public T getType(){
return type;
}

public void setType(T type){
this.type = type;
}

private static <N, S> void apaajaboleh(N freeparType, S free){
System.out.println(freeparType);
System.out.println(free);
}


private static <N> void ketiga ()
{
System.out.println();
}

    
    public static void main(String[] args) {
         apaajaboleh(1, "keduanya");
    
    }
}