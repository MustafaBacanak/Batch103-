package day22inheritancepolimorfizm;

public class VehicleRunner {

    public static void main(String[] args) {

        // Ex 1 : Car turunde,rengi beyaz olan, 54.000 km'de,250.000TL fiyati olan
        //         2020 model bir Honda Accord ariyorum.

        HondaAccord hacc =new HondaAccord(250000,2200);

        System.out.println(hacc.year);
        System.out.println(hacc.type);



    }
}
