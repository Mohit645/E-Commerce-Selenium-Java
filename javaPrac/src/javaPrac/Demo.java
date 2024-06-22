package javaPrac;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 String json = "<br /> <b>Notice</b>:  Undefined property: stdClass::$language in <b>/var/www/maps/api/place/AddPlace.php</b> on line <b>48</b><br />\r\n" + 
 		"{\"status\":\"OK\",\"place_id\":\"6d575d45246429a35fa658f8034bef69\",\"scope\":\"APP\",\"reference\":\"f0494be02f367dd2e64bd1cb8472319cf0494be02f367dd2e64bd1cb8472319c\",\"id\":\"f0494be02f367dd2e64bd1cb8472319c\"}";
 
 System.out.println(json);
 System.out.println();
 String[] j = json.split("\\{");
 System.out.println(j[1]);
	}

}
