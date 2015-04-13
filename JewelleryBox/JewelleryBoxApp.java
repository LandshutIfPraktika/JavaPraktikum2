public class JewelleryBoxApp{
	public static void main(String ... args){
		JewelleryBox myBox = new JewelleryBox();
		myBox.addDiamonds(21);
		myBox.addPearls(12);
		myBox.print();

		JewelleryBox yourBox = new JewelleryBox(12,34);
		System.out.println(yourBox.equals(myBox));
	}
}