/**
* This class implements the necessary logic for the BongoMain
* programm.
*
* @author Georg Held
*
*/
public class Bongo{



	private static Bongo chief = new Bongo();

	private Tribe tribe;
	private int beauty = 1;

	/**
	* Implements a tribeless Bongo with 
	* zero beauty.
	*/
	public Bongo(){
		this.tribe = null;
		this.beauty = 0;
	}

	/**
	* Implements a new Bongo with beauty 1.
	*/
	public Bongo(Tribe tribe){
		this.tribe = tribe;
		
		this.tribe.changeMember(1);
		
	}

	/**
	* Get the momentary chief of the Bongos.
	*
	*@return reference tho the chief.
	*/
	public static Bongo getChief(){
		return chief;
	}

	/**
	* Get the beauty of a Bongo.
	*
	*@return the beauty as an int.
	*/
	public int getBeauty(){
		return this.beauty;
	}

	/**
	* Get the Tribe of a Bongo.
	* 
	*@return reference to the Tribe.
	*@see Tribe
	*/
	public Tribe getTribe(){
		return this.tribe;
	}

	/**
	* Increments the beauty of the Bongo.
	*
	*<p>
	* If the beauty of the Bongo gets higher than the beauty
	* of the chief, it becomes the new chief.
	*
	*@return reference to this
	*/
	public Bongo brezelUp(){
		this.beauty ++;
		if (this.beauty > chief.beauty && this.tribe != null){
			chief = this;
		}
		return this;
	}

	/**
	* Simulates the fighting of two Bongos.
	*<p>
	* After the fight both Bongos have their beauty reduced by half.
	* If the beauty of one Bongo reachesd zero it gets banished.
	*<p>
	* If one of the involved Bongos is the chief, it loses the position.
	*
	* @param that the opposing Bongo
	* @return reference to this
	*/
	public Bongo fetz(Bongo that){
		if  (this.tribe == that.tribe){
			return this;
		} else {
			this.beauty = this.beauty / 2;
			that.beauty = that.beauty / 2;

			if (this.beauty == 0){
				this.tribe = tribe.WILD;
			}
			if (that.beauty == 0){
				that.tribe = tribe.WILD;
			}
			if (this == chief){
				chief = new Bongo();
			}
			if (that == chief){
				chief = new Bongo();
			}

			return this;
		}
	}

	/**
	* Gets the number of tribe kin.
	* 
	* @return number of tribe kin as an int
	*/
	public int getKin(){
		if (this.tribe != Tribe.WILD){
			return this.tribe.getCount();
		} else return 0;
	}

}
