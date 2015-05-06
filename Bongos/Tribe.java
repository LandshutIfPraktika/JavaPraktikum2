/**
* This class represents a Bongo Tribe.
*
*
* There are three named tribes and one 
* tribe called WILD. It represents the 
* banished Bongos.
*
* @author Georg Held
*
*/
public enum Tribe {


	HULLA, TAMTAM, TAMTAMTAM, WILD;
	private int count = 0;

	/**
	* Increases or decreases
	* the member count.
	*
	*@param a the amount to in/decrease
	*/
	public void changeMember(int a){
		count += a;	
	}

	/**
	* Gets the actual count.
	*
	*@return Returns the momentary count as an int.
	*/
	public int getCount(){
		return this.count;
	}
	
}
