public class SoapBubbleApp{
	public static void main(String... args){
		SoapBubble myBubble = new SoapBubble (2,3,3,5);
		myBubble.print();
		System.out.println("Volume: " + myBubble.getVolume());
		myBubble.shift(-1,3,2);
		myBubble.print();
		System.out.println("Volume: " + myBubble.getVolume());
		SoapBubble yourBubble = new SoapBubble(32,0,0,4);
		myBubble.fuse(yourBubble);
		yourBubble.shift(-30,0,0);
		myBubble.fuse(yourBubble);
		myBubble.print();
		System.out.println("Volume: " + myBubble.getVolume());
		yourBubble.print();
	}
}