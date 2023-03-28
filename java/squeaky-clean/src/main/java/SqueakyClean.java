class SqueakyClean {
    static String clean(String identifier) {
    	
    	ch = Character.toString(strg.charAt(i));
	if(ch.equals(" ")){
	ch = "_";
	}if(Character.isISOControl(strg.charAt(i))){
	ch = "CTRL";
	}if(ch.equals("-")){
	ch = Character.toString(strg.charAt(i+1));
	ch = ch.toUpperCase();
	i++;
	}
        
    }
}
