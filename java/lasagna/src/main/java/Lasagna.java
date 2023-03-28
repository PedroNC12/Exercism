public class Lasagna {

	public static int expectedMinutesInOven(){
	return 40;
	}
    
	public static int remainingMinutesInOven(int min){
	return expectedMinutesInOven() - min;
	}

	public static int preparationTimeInMinutes(int layers){
	return layers * 2;
	}

    	public static int totalTimeInMinutes(int layers, int min){
    	return layers *2 + min;
    	}
}
