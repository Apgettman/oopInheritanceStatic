package animals;

public class Main {
    public static void main(String[] args) {

        Herbivores giraffe = new Herbivores("Жираф", 11, "пустыне", 20, "травоядное");
        Herbivores gazelle = new Herbivores("Газель", 5, "горах", 25, "травоядное");
        Herbivores horse = new Herbivores("Лошадь", 9, "степи", 45, "травоядное");
        horse.herbivores();
        gazelle.herbivores();
        giraffe.herbivores();

        Predator hyena = new Predator("Гиена", 6, "степи", 55, "хищник");
        Predator tiger = new Predator("Тигр", 7, "лесу", 60, "хищник");
        Predator bear = new Predator("Медведь", 10, "лесу", 50, "хищник");
        hyena.predator();
        tiger.predator();
        bear.predator();

        Amphibians frog = new Amphibians("Лягушка", 1, "пресной воде");
        Amphibians grassSnake = new Amphibians("Уж", 1, "пресной воде");
        grassSnake.amphibians();
        frog.amphibians();

        Flightless peacock = new Flightless("Павлин", 2, "пустыне", "по суше");
        Flightless penguin = new Flightless("Пингвин", 4, "Артике", "по суше");
        Flightless dodo = new Flightless("Додо", 3, "пустыне", "по суше");
        dodo.flightless();
        peacock.flightless();
        penguin.flightless();

        Flying seagull = new Flying("Чайка", 1, "у моря", "по воздуху");
        Flying albatross = new Flying("Альбатрос", 2, "у моря", "по водуху");
        Flying falcon = new Flying("Сокол", 3, "в горах", "по воздуху");
        seagull.flying();
        albatross.flying();
        falcon.flying();
    }
}