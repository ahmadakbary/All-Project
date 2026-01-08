package hawks.API;
import com.github.javafaker.Faker;

import net.minidev.json.JSONObject;
public class DataGenerator {
	
	public static String getEmail() {
		Faker faker=new Faker();
		String email = faker.name().firstName().toLowerCase()+faker.name().lastName()+"@sdet.com";
		return email;		
	}
	public static String getPassword() {
		Faker fakPasswords=new Faker();
		String password = fakPasswords.funnyName().name();
		return password;
	}
	public static String getTitle() {
		Faker faker=new Faker();
		String title=faker.name().title();
		return title;
	}
	public static String getFirstName() {
		Faker faker=new Faker();
		String firstName=faker.name().firstName();
		return firstName;	
	}
	public static String getLasttName() {
		Faker faker=new Faker();
		String LastName=faker.name().lastName();
		return LastName;		
	}
	public static String getGender() {
		Faker faker=new Faker();
		String gender=faker.name().bloodGroup();
		return gender;	
	}		
	public static String getMaritalStatus() {
		Faker faker=new Faker();
		String maritalStatus=faker.demographic().maritalStatus();
		return maritalStatus;
	}		
	public static String getemploymentStatus() {
		Faker faker=new Faker();
		String employmentStatus=faker.job().position();
		return employmentStatus;
	}
	public static String getdateObBirht() {
		Faker faker=new Faker();
		String dateOfBirth=faker.date().birthday().toString();
		return dateOfBirth;
	}
	public static String getlanguagePref() {
		Faker faker=new Faker();
		String languagePref=faker.random().toString();
		return languagePref;
	}
	public static String getaddressType() {
		Faker faker=new Faker();
		String addressType=faker.address().country();
		return addressType;
	}
	public static String getaddressLine1() {
		Faker faker=new Faker();
		String addressLine1=faker.address().fullAddress();
		return addressLine1;
	}	
	public static String getcity() {
		Faker faker=new Faker();
		String city=faker.address().cityName();
		return city;
	}	
	public static String getstate() {
		Faker faker=new Faker();
		String state=faker.address().state();
		return state;
	}
	public static String getpostalCode() {
		Faker faker=new Faker();
		String postalCode=faker.address().zipCode();
		return postalCode;
	}
	public static String getcountryCode() {
		Faker faker=new Faker();
		String countryCode=faker.address().countryCode();
		return countryCode;
	}
	public static String getphoneNumber() {
		Faker faker=new Faker();
		String phoneNumber=faker.phoneNumber().cellPhone();
		return phoneNumber;
	}
	public static String getphoneExtension() {
		Faker faker=new Faker();
		String phoneExtension=faker.phoneNumber().extension();
		return phoneExtension;
	}
	public static String getphoneTime() {
		Faker faker=new Faker();
		String phoneTime=faker.address().timeZone();
		return phoneTime;
	}
	public static String getphoneType() {
		Faker faker=new Faker();
		String phoneType=faker.phoneNumber().cellPhone();
		return phoneType;
		
		
		
	}	
	public static JSONObject getValues() {
		Faker faker=new Faker();	
	String email = faker.name().firstName().toLowerCase()+faker.name().lastName()+"@sdet.com";
	String firstName=faker.name().firstName();
	String lastName=faker.name().lastName();
	String title=faker.name().title();
	String gender = faker.demographic().sex();
	String maritalStatus = faker.demographic().maritalStatus();
	String employmentStatus = faker.job().position();
	String dateOfBirth = faker.date().birthday().toString();
	String languagePref = faker.random().toString();
	String addressType = faker.address().country();
	String addressLine1 = faker.address().fullAddress();
	String city = faker.address().cityName();
	String state = faker.address().state();
	String postalCode = faker.address().zipCode();
	String countryCode = faker.address().countryCode();
	String phoneNumber = faker.phoneNumber().cellPhone();
	String phoneExtension = faker.phoneNumber().extension();
	String phoneTime = faker.address().timeZone();
	String phoneType = faker.phoneNumber().cellPhone();
		
// this below info the first email is from jsob.json and 2nd values is from JSONObject Method line 40	
	JSONObject json=new JSONObject();
	json.put("email", email);
	json.put("title", title);
	json.put("firstName",firstName );
	json.put("lastName",lastName );
	json.put("gender", gender);
	json.put("maritalStatus",maritalStatus);
	json.put("employmentStatus",employmentStatus);
	json.put("dateOfBirth",dateOfBirth );
	json.put("languagePref",languagePref);
	json.put("addressType",addressType );
	json.put("addressLine1",addressLine1 );
	json.put("city",city );
	json.put("state",state);
	json.put("postalCode", postalCode);
	json.put("countryCode", countryCode);
	json.put("phoneNumber", phoneNumber);
	json.put("phoneExtension", phoneExtension);
	json.put("phoneTime",phoneTime );
	json.put("phoneType",phoneType);
	return json;
	
	
		
	}

}


















