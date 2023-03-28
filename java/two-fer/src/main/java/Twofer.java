public class Twofer {
    public String twofer(String name) {
    	String frase = null;
    	
        if(name==null) {
        frase = "One for you, one for me.";
        }else {
        frase = "One for " +name +", one for me.";
        }
        
        return frase;
    }
}
