package java_projects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexExpressionCheck {
public static void main(String[] arg) {
	Pattern p =Pattern.compile("in",Pattern.CASE_INSENSITIVE);
	Matcher m=p.matcher("Indranilin");
	while (m.find()) {
		System.out.println(m.start()+"    "+(m.end()-1));
		
	}
	Pattern px =Pattern.compile("10+1");
	Matcher mx=px.matcher("11100010000110001");
	while (mx.find()) {
		System.out.println(("11100010000110001").substring(mx.start()+1,mx.end()-1));
		
	}
}
}
