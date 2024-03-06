//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //array = used to store multiple values in a single variable

        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        cars[0] = "Mustang";
//        System.out.println(cars[3]);


        //Another way to describe Arrays

        String[] myCars = new String[4];
        myCars[0] = "Allion";
        myCars[1] = "Premio";
        myCars[2] = "Rush";
        myCars[3] = "Fielder";

//        System.out.println(myCars[3]);
        for(int i=0; i<myCars.length; i++){
            System.out.println(myCars[i]);

        }


    }
}