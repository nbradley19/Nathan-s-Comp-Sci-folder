/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>Uses indexOf to find strings</li>
 * <li>Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
import java.io.*;
import java.net.URL;
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.trim().equalsIgnoreCase("")) {
			response = "SAY SOMETHING";
		} else if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0 || statement.indexOf("fish") >= 0
				|| statement.indexOf("gerbil") >= 0) {
			response = "Tell me more about your pets.";
		} else if (statement.indexOf("Mr. Clair") >= 0) {
			response = "He sounds like a pretty schwifty teacher.";
		} else if (statement.indexOf("you") >= 0 && (statement.indexOf("dumb") >= 0 || statement.indexOf("stupid") >= 0
				|| statement.indexOf("gross") >= 0)) {
			response = "Not as much as you.";
		}else if (hasProfanity(statement) == true) {
			response = "DON'T SWEAR ON MY GOOD CHRISTIAN MAGPIE LAB!";
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "SKRRRRT";
		} else if (whichResponse == 5) {
			response = "Mmmmmm good";
		}

		return response;
		
	}
	public boolean hasProfanity(String input) {
		int largestWordLength = 0;
		boolean output = false;
		String[] ignore_in_combination_with_words = new String[]{};
		try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("https://docs.google.com/spreadsheets/d/1hIEi2YG3ydav1E06Bzf2mQbGZ12kh2fe4ISgLg_UBuM/export?format=csv").openConnection().getInputStream()));
            String line = "";
            int counter = 0;
            while((line = reader.readLine()) != null) {
                counter++;
                String[] content = null;
                try {
                    content = line.split(",");
                    if(content.length == 0) {
                        continue;
                    }
                    String word = content[0];
                    ignore_in_combination_with_words = new String[]{};
                    if(content.length > 1) {
                        ignore_in_combination_with_words = content[1].split("_");
                    }

                    if(word.length() > largestWordLength) {
                        largestWordLength = word.length();
                    }

                } catch(Exception e) {
                    e.printStackTrace();
                }

            }
            for (int i = 0; i < ignore_in_combination_with_words.length; i++) {
            	if(ignore_in_combination_with_words[i] == input) {
            		output = true;
            		break;
            	}
            	else output = false;
            }
            System.out.println("Loaded " + counter + " words to filter out");
        } catch (IOException e) {
            e.printStackTrace();
        }
		return output;

    }
}
