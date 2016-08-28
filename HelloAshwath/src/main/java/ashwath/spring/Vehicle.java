package ashwath.spring;

public class Vehicle {
	private String make;
	private String model;
	private int year;
	private String color;
	private String type;
	private String washed="false";
	private String serviced="false";

	public String getLongDescription() {
		// TODO Auto-generated method stub
		return getColor()+" "+getYear()+" "+getMake()+" "+getModel()+" "+getType();
	}



	public Object getShortDescription() {
		// TODO Auto-generated method stub
		return getMake()+" "+getModel();
	}

	

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWashed() {
		return washed;
	}

	public void setWashed(String washed) {
		this.washed = washed;
	}



	public String getServiced() {
		return serviced;
	}



	public void setServiced(String serviced) {
		this.serviced = serviced;
	}

	
}
