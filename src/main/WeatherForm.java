package main;

/**
 * Using this class as a basic form for having weather information - 
 * can potentially have a list of these or practice with them.
 * @author dylanhall
 *
 */
public class WeatherForm {
	
	private int _temp;
	private boolean _isCloudy;
	private boolean _isWindy;
	
	public WeatherForm(String currentTemp, String isCloudy, String isWindy) {
		_temp = Integer.parseInt(currentTemp);
		
		if(isCloudy.equals("y")||isCloudy.equals("Y")){
			_isCloudy = true;
		}else{
			_isCloudy = false;
		}
		
		if(isWindy.equals("y")||isWindy.equals("Y")){
			_isWindy = true;
		}else{
			_isWindy = false;
		}
		
	}
	
	/**
	 * Overriding the toString() original method to make it easier to
	 * debug 
	 */
	@Override
	public String toString(){
		return "Current Temp is: "+_temp;
	}
	

}
