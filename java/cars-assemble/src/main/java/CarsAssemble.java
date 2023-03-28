public class CarsAssemble {

    public double productionRatePerHour(int speed) {
       return speed * 221;
    }

    public int workingItemsPerMinute(int speed) {
    	double rate = productionRatePerHour(speed);
    	double porcento = 0;
    
        if(speed>=1&&speed<=4){
        porcento = 100;
        }else if(speed>=5&&speed<=8){
        porcento = 90;
        }else if(speed==9){
        porcento = 80;
        }else if(speed==10){
        porcento = 77;
        }
        
        return (int) (rate * (porcento/100.0)) / 60;
    }
    
    public static void main(String[] args) {
    	CarsAssemble cars = new CarsAssemble();
    	
    	System.out.println(cars.productionRatePerHour(5));
    }
}
