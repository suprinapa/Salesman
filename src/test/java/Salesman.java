import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class Salesman {
    JSONParser jsonParser = new JSONParser();
    FileReader fileReader = new FileReader(".\\jsonfiles\\salesman.json");
    Object obj = jsonParser.parse(fileReader);
    JSONObject salesManObj = (JSONObject) obj;
    JSONArray array = (JSONArray) salesManObj.get("SalesMan");

    public Salesman() throws IOException, ParseException {
    }

    public void showData() {
        for (int i = 0; i < array.size(); i++) {
            JSONObject salesman = (JSONObject) array.get(i);
            String name = (String) salesman.get("Name");
            String city = (String) salesman.get("City");
            String age = (String) salesman.get("Age");

            System.out.println("salesman of " + i + " is " + salesman);
            System.out.println("name = " + name);
            System.out.println("city = " + city);
            System.out.println("age = " + age);
        }
    }

    // From the list of salesman created above in question 1. Find all the salesman that lives in london.
    // From the list of salesman created above in question 1. Find all the salesman that lives in NewYork.
    // From the list of salesman created above in question 1. Find all the salesman that lives in Toronto.
          public void specifiCity() {
           for (int j = 0; j < array.size(); j++) {
               JSONObject specificCity = (JSONObject) array.get(j);
               if (specificCity.containsValue("London")) {
                   System.out.println("people living in london = " + specificCity);
               }
               else if (specificCity.containsValue("NewYork")) {
                   System.out.println("people living in NewYork = " + specificCity);
               }
               else if (specificCity.containsValue("Toronto")){
                   System.out.println("people living in Toronto = " + specificCity);
               }
              }
    }
    //From the list of salesman created above in question 1. Find all the salesman that lives in London and is less than 40 years of age.
    public void ageCity(){
        for (int k = 0; k < array.size(); k++) {
            JSONObject ageCity=(JSONObject)array.get(k);
            if(ageCity.containsValue("London") && ageCity.containsValue("40")){
                System.out.println("these members " +k +" lives in London and age is 40 = " + ageCity);
            }
        }

    }
        public static void main(String args[]) throws IOException, ParseException {
            Salesman obj = new Salesman();
            obj.showData();
            obj.specifiCity();
            obj.ageCity();
        }
}










