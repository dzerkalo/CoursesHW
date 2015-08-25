package ACO7.week1.homework;

/**
 * Created by acer on 16.07.2015.
 */
public class Adress {

    //Address: Country, city, street, building

    String country;
    String city;
    String street;
    int building;

    public String showAdress(){
        String adressCompany = "Country: " + country + "City: " + city + "Street: " + street +
                "Building: " + building;
        return adressCompany;
    }


}
