package JavaLesson6Activities;

public class Laguitan_L6Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Guitar is my favorite musical instrument.";
		String searchWord = "mus";
		
		System.out.println("Index: " + searchWordWithPrefix(sentence, searchWord));
		
	}
	
	
	/**
	 * Function name: searchWordWithPrefix
	 * Parameters:
	 * 	1. String sentence - consists words separated by a single space
	 * 	2. String searchWord - prefix of a word to be searched
	 * 
	 * Inside the function:
	 * 	1. splits the sentence into a string array
	 *  2. traverses created array
	 *  3. looks for the word with the prefix searchWord
	 *  
	 * Returns:
	 *  1. if word exists, returns the index of the word + 1
	 *  2. if not, returns -1.
	 */
	public static int searchWordWithPrefix(String sentence, String searchWord) {
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].startsWith(searchWord)) {
				return (i + 1);
			}
		}
		return -1;
	}

}
