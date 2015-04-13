public class JewelleryBox{


	private int numberOfDiamonds;
	private int numberOfPearls;


	JewelleryBox(){
		this(0,0);
	}

	JewelleryBox(int diamonds, int pearls){
		numberOfDiamonds = diamonds;
		numberOfPearls = pearls;
	}

	public int getDiamonds(){
		return this.numberOfDiamonds;
	}

	public int getPearls(){
		return this.numberOfPearls;
	}

	public void addDiamonds(int n){
		this.numberOfDiamonds += n;
	}

	public void addPearls(int n){
		this.numberOfPearls += n;
	}

	public void print(){
		System.out.println("Box contains " + this.numberOfDiamonds + " Diamonds and " + this.numberOfPearls + " Pearls");
	}

	public  Boolean equals(JewelleryBox that){
		if (this.numberOfDiamonds == that.numberOfDiamonds && this.numberOfPearls == that.numberOfPearls)
			return true;
		else return false;
	}
}