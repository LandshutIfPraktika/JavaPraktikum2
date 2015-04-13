public class Bongo{


	private static int numHulla = 0;
	private static int numTamtam = 0;
	private static int numTamtamtam = 0;

	private static Bongo chief = new Bongo();

	private Tribe tribe;
	private int beauty = 1;

	public Bongo(){
		this.tribe = null;
		this.beauty = 0;
	}

	public Bongo(Tribe tribe){
		this.tribe = tribe;
		switch (tribe){
			case HULLA:
			numHulla++;
			break;

			case TAMTAM:
			numTamtam++;
			break;

			case TAMTAMTAM:
			numTamtamtam++;
			break;

			default:
			this.beauty = 0;
			break;
		}
	}

	protected void finalize(){
		switch (this.tribe){
			case HULLA:
			numHulla--;
			break;

			case TAMTAM:
			numTamtam--;
			break;

			case TAMTAMTAM:
			numTamtamtam--;
			break;

			default:
			break;
		}
	}

	public static Bongo getChief(){
		return chief;
	}

	public int getBeauty(){
		return this.beauty;
	}

	public Tribe getTribe(){
		return this.tribe;
	}

	public Bongo brezelUp(){
		this.beauty ++;
		if (this.beauty > chief.beauty && this.tribe != null){
			chief = this;
		}
		return this;
	}

	public Bongo fetz(Bongo that){
		if  (this.tribe == that.tribe){
			return this;
		} else {
			this.beauty = this.beauty / 2;
			that.beauty = that.beauty / 2;

			if (this.beauty == 0){
				this.tribe = null;
			}
			if (that.beauty == 0){
				that.tribe = null;
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

	public int getKin(){
		switch(this.tribe){
			case HULLA:
			return numHulla;

			case TAMTAM:
			return numTamtam;

			case TAMTAMTAM:
			return numTamtamtam;

			default:
			return 0;
		}
	}

}