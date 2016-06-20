
public class Convertisseur {



	public static void main( String args[] ){

		String strMaVariable = "22";
		


		System.out.println(conversionEnInt(strMaVariable)+2);

		System.out.println(conversionEnstring(conversionEnInt(strMaVariable))+2);
		

	}

/**
 * @param chaine de caractère
 * @return Integer
 */
	private static int conversionEnInt(String chaine){
		 int converteur = Integer.parseInt(chaine);
		 return converteur;
	}



/**
 * @param Integer
 * @return String
 */
	private static String conversionEnstring(int number){
		 String converteur = Integer.toString(number);
		 return converteur;
	}
}

