
public class SoapBubble {
	private double x;
	private double y;
	private double z;
	private double radius;
	private Boolean popped = false;

	SoapBubble(){
		this(0,0,0,1);
	}

	SoapBubble(double x,double y,double z,double radius){
		this.x = x;
		this.y = y;
		this.z = z;
		this.radius = radius;
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public double getZ(){
		return this.z;
	}

	public double getRadius(){
		return this.radius;
	}

	public double[] getPos(){
		double[] pos = {this.x,this.y,this.z};
		return pos;
	}

	public Boolean getPopped(){
		return this.popped;
	}

	public void shift(double x, double y, double z){
		if (this.popped){
			return;
		}

		this.x += x;
		this.y += y;
		this.z += z;
	}

	public double getVolume(){
		if (this.popped){
			return 0;
		} else {
			return 4.0/3.0 * Math.PI *this.radius * this.radius * this.radius;
		}
	}

	public double getDistance(SoapBubble that){
		if (this.popped || that.popped){
			return Double.NaN;
		} else {
			return Math.sqrt(Math.pow(that.x-this.x, 2)+Math.pow(that.y - this.y, 2)+Math.pow(that.z -this.z, 2));
		}
	}

	public Boolean overlaps(SoapBubble that){
		if (this.popped || that.popped){
			return false;
		} else {
			return this.getDistance(that) < this.radius + that.radius;
		}
	}

	public void fuse(SoapBubble that){
		if (this.popped){
			System.out.println("this Bubble is popped!");
			return;
		}
		if (that.popped){
			System.out.println("that Bubble is popped!");
			return;
		}
		if (!this.overlaps(that)){
			System.out.println("the Bubbles do not overlap!");
			return;
		}
		final double tempVolume = this.getVolume() + that.getVolume();
		this.radius = Math.cbrt(tempVolume / 4.0 * 3.0 / Math.PI);
		that.popp();
	}

	public void print(){
		if(this.popped){
			System.out.println("popped!");
		} else {
			System.out.println("Position: " + this.x +", "+this.y + ", " + this.z);
			System.out.println("Radius: "+ this.radius);
		}
	}

	private void popp(){
		this.popped = true;
		this.x = Double.NaN;
		this.y = Double.NaN;
		this.z = Double.NaN;
		this.radius = Double.NaN;
	}
}