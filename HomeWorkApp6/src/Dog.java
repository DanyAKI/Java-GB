
public class Dog extends Animals {

    public Dog(int maxRunLenght, int maxSwimLenght){
     super(maxRunLenght, maxRunLenght);
    }
    public Dog() {
        this(500, 10);
    }

    @Override
    public void doRun(int length) {
        if (getMaxRunlenght() >= length) {
            System.out.println("Собака может преодолеть: " + length);
        } else {
            System.out.println(String.format("Дистанция собаки: %s не выполнима. Максимаьная дистанция: %s", length, getMaxRunlenght()));
        }


    }

    @Override
    public void dpSwim (int length) {
        if (getMaxRunlenght() >= length) {
            System.out.println("Собака может пропылыть: " + length);
        } else {
            System.out.println(String.format("Дистанция собаки: %s не выполнима. Максимаьная дистанция: %s", length, getMaxRunlenght()));
        }

    }
    }

