/* (C) 2015, Gudrun Schiedermeier, gschied@haw-landshut.de
 * Oracle Corporation Java 1.8.0_05, Linux i386 3.16.3
 * mozart (Intel Core i7-4600U CPU/2701 MHz, 4 Cores, 11776 MB RAM)
 */
/**Demoprogramm für Bongos.
 * @author Gudrun Schiedermeier, gschied@haw-landshut.de
 * @version 2015-04-11
 */

public class BongoMain {
    /** Hauptprogramm.
     * @param ignored Kommandozeilenargumente. Werden ignoriert.
     */
    public static void main(final String... ignored) {
        final Bongo adam = new Bongo(Tribe.HULLA).brezelUp();
        System.out.println(adam.getBeauty());			// 2
        adam.fetz(adam);					// ohne Wirkung
        System.out.println(adam.getTribe());			// Hulla
        System.out.println(adam.getBeauty());			// 2
        System.out.println(Bongo.getChief() == adam);           // true
        System.out.println(adam.getKin());			// 1
    }

}
