public class Person {

    String name, gender;
    int num;

    Person(){

        System.out.println("No Value");

    }

    public Person(String n, String g, int x){
        name=n;
        gender=g;
        num=x;
    }

    public void displayInformation(){
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("num:"+num);
    }

}
