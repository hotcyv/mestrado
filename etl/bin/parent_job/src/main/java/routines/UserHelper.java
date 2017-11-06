package routines;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

//import info.debatty.java.stringsimilarity.*;

/*
 * user specification: the function's comment should contain keys as follows: 1. write about the function's comment.but
 * it must be before the "{talendTypes}" key.
 * 
 * 2. {talendTypes} 's value must be talend Type, it is required . its value should be one of: String, char | Character,
 * long | Long, int | Integer, boolean | Boolean, byte | Byte, Date, double | Double, float | Float, Object, short |
 * Short
 * 
 * 3. {Category} define a category for the Function. it is required. its value is user-defined .
 * 
 * 4. {param} 's format is: {param} <type>[(<default value or closed list values>)] <name>[ : <comment>]
 * 
 * <type> 's value should be one of: string, int, list, double, object, boolean, long, char, date. <name>'s value is the
 * Function's parameter name. the {param} is optional. so if you the Function without the parameters. the {param} don't
 * added. you can have many parameters for the Function.
 * 
 * 5. {example} gives a example for the Function. it is optional.
 */
public class UserHelper {

	public static boolean inArray(Integer id_org, String idList) {
		List<String> items = Arrays.asList(idList.split(","));
		//List<Integer> intList2 = Arrays.asList(26438,26410);// SOMENTE IFSC
		//List<String> list = Arrays.asList("26438","26435","26410","26432","26427","26417","26402","26426");// ESIC
//		List<String> list =
//		 Arrays.asList("26401","26402","26403","26404","26405","26406","26407","26408","26409","26410",
//		 "26411","26412","26413","26414","26415","26416","26417","26418","26419","26420",
//		 "26421","26422","26423","26424","26426","26427","26428","26429","26430",
//		 "26430","26431","26432","26433","26434","26435","26436","26437","26438","26439");//somenteIFs
		//List<Integer> list = Arrays.asList(intList2);

		return items.contains(String.valueOf(id_org));
	}

	public static String getStringDate(Date dt){
		
		Format formatter = new SimpleDateFormat("MM-yyyy");
		return formatter.format(dt); 
	}
//	public static double stringsSimilarity(String str1, String str2) {
//		
//		NormalizedLevenshtein l = new NormalizedLevenshtein();
//
//		return l.distance(str1, str2);
//	}
}