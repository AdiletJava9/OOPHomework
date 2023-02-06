public class Main {
    public static void main(String[] args) {
        Country country = new Country();
        country.setNameCountry("Kyrgyzstan");
        country.setCapital("Bishkek");
        country.setPopulation(7000000f);
        country.setCurrency("COM");


        Country country1 = new Country();
        country1.setNameCountry("Kazakhstan");
        country1.setCapital("Nursultan");
        country1.setPopulation(1500000f);
        country1.setCurrency("TENGE");


        Country country2 = new Country();
        country2.setNameCountry("Uzbekistan");
        country2.setCapital("Tashkent");
        country2.setPopulation(3500000f);
        country2.setCurrency("SUM");

        Country country3 = new Country();
        country3.setNameCountry("Turkmenistan");
        country3.setCapital("Ashxabat");
        country3.setPopulation(600000f);
        country3.setCurrency("MANAT");

        City city = new City();
        city.setNameCity("Madrid");
        city.setLocation("Europa,Ispain");
        city.setPolulatonSity(320000);


        City city1 = new City();
        city1.setNameCity("Moskow");
        city1.setLocation("Europa,Russia");
        city1.setPolulatonSity(110000);

        City city2 = new City();
        city2.setNameCity("Paris");
        city2.setLocation("Europa,France");
        city2.setPolulatonSity(220000);

        Address address = new Address();
        address.setNameAddress("Гражданская.ул.119");
        address.setExample("Восток 5");

        Address address1 = new Address();
        address1.setNameAddress("Ул Анкара 40");
        address1.setExample("Супер Марkет Шекер");

        Address address2 = new Address();
        address2.setNameAddress("Ул Ибраимова 10");
        address2.setExample("Цум Айчурок");

        Person person = new Person();
        person.setFullName("Adilet Islambek uulu");
        person.setAge(22);

        Person person1 = new Person();
        person1.setFullName("Samat Chigirov");
        person1.setAge(40);

        Person person2 = new Person();
        person2.setFullName("Akjoltoy kyzy Kanykey");
        person2.setAge(16);

        Person [] people = new Person[]{person,person1,person2};
        for (Person m : people) {
            System.out.println("Фамилия Имя:"+m.getFullName()+"\nВозвраст:"+m.getAge()+"\n");
        }
        Address [] addresses = new  Address[]{address,address1,address2};
        for (Address u : addresses) {
            System.out.println("Адрес:"+u.getNameAddress()+"\nПримерно:"+u.getExample()+"\n");
        }
        City[] cities = new City[]{city, city1, city2};
        for (City s : cities) {
            System.out.println("Город:" + s.getNameCity() + "\nМесто нахаждение:" + s.getLocation() + "\nНаселение города:" +
                    "" + s.getPolulatonSity() + "\n");
        }

        Country[] countries = new Country[]{country, country1, country2, country3};
        for (Country k : countries) {
            System.out.println("Республика:" + k.getNameCountry() + "\nСтолица:" + k.getCapital() + " \nНасиление:" + k.getPopulation() + " \nВалюта:" +
                    "" + k.getCurrency() + "\n");
        }

    }
}