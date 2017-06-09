package genapp2;

public class GenApp5 {
String aula;
    
    public String getaula(){
        return aula;
    }
    public void setKelas(String nm){
     this.aula= aula;   
    
    }
 
    private static <T> void GenApp5 (T free) {
        System.out.println(free);
    }    
    public static void main (String[] Args){
        GenApp5 gen = new GenApp5();
        
        gen.setKelas(" Jurusan teknik Informatika 14 A R");
        System.out.println(gen.getaula());
        GenApp5(" Jurusan teknik Informatika 14 B R");
        
    }
}