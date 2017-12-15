package comparison.csvproject.com.univocity;

import com.univocity.parsers.annotations.Parsed;
//import lombok.Data;

//@Data
public class Person {

    @Parsed(field = "名前")
    private String name;

    @Parsed(field = "ふりがな")
    private String furigana;

    @Parsed(field = "アドレス")
    private String emailaddress;

    @Parsed(field = "性別")
    private String sex;

    @Parsed(field = "誕生日")
    private String birthday;

    public String getName() {
    	return name;
    }

    public String getSex() {
    	return sex;
    }
}
