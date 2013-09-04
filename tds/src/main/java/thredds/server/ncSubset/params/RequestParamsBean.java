package thredds.server.ncSubset.params;

import java.util.List;

import javax.validation.Valid;

import thredds.server.ncSubset.validation.TimeParamsConstraint;
import thredds.server.ncSubset.validation.VarParamConstraint;

@TimeParamsConstraint
public class RequestParamsBean extends ParamsBean {
	
	//@NotNull(message="var param may not be null")
	@VarParamConstraint
	private List<String> var;
	
	//@NotNull(message="accept param may not be null")
	//private String accept;
	
	@Valid
	private String time_start;

	@Valid
	private String time_end;
	
	@Valid
	private String time_duration;
	
	@Valid
	private String time_window;
	
	private String time;
	
	private String temporal;
	
	private Double vertCoord;
	
	//@NotNull(message="north param may not be null")	
	private Double north;
	
	//@NotNull(message="south param may not be null")	
	private Double south;
	
	//@NotNull(message="east param may not be null")	
	private Double east;
	
	//@NotNull(message="west param may not be null")	
	private Double west;	
	
	
	public List<String> getVar() {
		return var;
	}
	public void setVar(List<String> var) {
		this.var = var;
	}
	public String getTime_start() {
		return time_start;
	}
	public void setTime_start(String time_start) {
		this.time_start = time_start;
	}
	public String getTime_end() {
		return time_end;
	}
	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}
	public String getTime_duration() {
		return time_duration;
	}
	public void setTime_duration(String time_duration) {
		this.time_duration = time_duration;
	}
	
	public void setTime(String time){
		this.time = time;
	}
	
	public String getTime(){
		return this.time;
	}

	public void setTime_window(String time_window){
		this.time_window = time_window;
	}
	
	public String getTime_window(){
		return this.time_window;
	}	
	
	public void setTemporal(String temporal){
		this.temporal = temporal;
	}
	
	public String getTemporal(){
		return this.temporal;
	}	
	
	/*public void setAccept(String accept){
		this.accept = accept;
	}
	 
	public String getAccept(){
		return this.accept;
	}*/
	
	public Double getVertCoord() {
		return vertCoord;
	}
	public void setVertCoord(Double vertCoord) {
		this.vertCoord = vertCoord;
	}
		
	public Double getNorth() {
		return north;
	}

	public void setNorth(Double north) {
		this.north = north;
	}

	public Double getSouth() {
		return south;
	}

	public void setSouth(Double south) {
		this.south = south;
	}

	public Double getEast() {
		return east;
	}

	public void setEast(Double east) {
		this.east = east;
	}

	public Double getWest() {
		return west;
	}

	public void setWest(Double west) {
		this.west = west;
	}	

	/*public CalendarDateRange getCalendarDateRange() throws ParseException{
		
		DateRange dr; 
		if(time == null)
			dr = new DateRange( new DateType(time_start, null, null), new DateType(time_end, null, null), new TimeDuration(time_duration), null );
		else{
			DateType dtDate = new DateType(time, null, null);			
			dr = new DateRange( dtDate.getDate(), dtDate.getDate() );
		}	
		
		return CalendarDateRange.of(dr );
		
	}*/
}
