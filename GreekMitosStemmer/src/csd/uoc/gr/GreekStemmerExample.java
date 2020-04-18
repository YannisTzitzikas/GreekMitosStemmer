/**
 * 
 */
package csd.uoc.gr;

import mitos.stemmer.Stemmer; // Porter and Greek one

/**
 * @author Yannis Tzitzikas (yannistzitzik@gmail.com)
 *
 */
public class GreekStemmerExample {
	public static void main(String[] lala) {
		System.out.println("**Greek Stemmer (from mitos) **");
		String[] testCases = {
				"αυτοκίνητο", "αυτοκινήτων", 
				"καρπούζι", "καρπούζια", "καρπουζιών",
				"υπολογισμός", "υπολογίσιμος", "υπολογίζω",
				"πράττω", "πρακτικός", "πράξη", "πράγμα",
				"αναδιάταξη", "αναδιατάσσω", "αναδιέταξα", 
				"κριτήριο", "κριτήρια",
				"προβολέας", "προβολείς",
				"αμινοξύ", "αμινοξέα",
				"πάω", "πηγαίνω", "πηγαίνεις", "πήγαμε",
				"Αθήνα", "Αθηναίος", "Αθηναία", "Αθηναϊκό",
				"Ηράκλειο", "Ηρακλείου", 
				"Γιάννης", "Γιάννη",
				"Μαρία", "Μαριών",
				"Μύρων", "Μύρωνας", "Μύρωνα"
		};
		Stemmer.Initialize(); // not needed every time (only once)
		for (String w: testCases)  {
			System.out.printf("%12s --> %s\n", w, Stemmer.Stem(w));
		}
	}
}
	
		