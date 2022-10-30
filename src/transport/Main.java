package transport;

import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2022,
                "Германия", "АКПП", "Кабриолет",
                "А500МО97", 2, "Летняя", 5, 15000,
                "123456789", "АВ/022/79903");
        bmw.cars();
        bmw.refill();
        Car kia = new Car(" Kia", " Sportage", 2.4, "Красный", 2018,
                "Южная Корея","АКПП" , "хэтчбек",
                "О988РС99", 5, " Зимняя" , 5,15000,
                "1234567890", "АВ/022/19903");
        kia.cars();
        kia.refill();
        Car hyundai = new Car("Hyundai", "Avante", 1.6 , "Оранжевый",
                2016, "Южная Корея", "Механическая" , "седан",
                "В767ВВ197" , 5, "Летняя", 5,15000,
                "1234567890", "АВ/022/14536");
        hyundai.cars();
        hyundai.refill();
        Car lada = new Car("Lada", "Granta", 1.7, "Желтый", 2015,
                "Россия", "Механическая", "Седан", "A551CК78",
                5,"Летняя",5,15000,"1234567890", "АЛ/021/15836");
        lada.cars();
        lada.refill();
        Car audi = new Car("Audi", " A8 50L TDI quattro", 3.0, "Черный",
                2022, "Германия", "АКПП", "седан",
                "А008АА77", 5,"Зимняя", 5,15000,"1234567890",
                "АА/020/90836" );
        audi.cars();
        audi.refill();

        Train lactochka = new Train("Ласточка", "B-901", 2011, "Россия",
                3500, "Белорусского вокзала", " Минск-Пассажирский",
                11, 310);
        lactochka.Train();
        lactochka.refill();
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                1700, "Ленинградского вокзала", "Ленинград-Пассажирский",
                8, 270);
        leningrad.Train();
        leningrad.refill();

        Bus mercedes = new Bus("Mercedes", "IntouroK",2020);
        mercedes.bus();
        mercedes.refill();
        Bus scania = new Bus("Scania", "Irizar", 2021);
        scania.bus();
        scania.refill();
        Bus volvo = new Bus("Volvo", "9900", 2022);
        volvo.bus();
        volvo.refill();
    }
}