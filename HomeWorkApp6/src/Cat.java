public class Cat extends Animals{

    public Cat(int maxRunLenght){
        super(maxRunLenght,-1);
    }

    public Cat(){
        this(200);

    }

    @Override
    public void doRun (int length) {
        if (getMaxRunlenght() >= length){
            System.out.println("Кот может преодолеть: " + length);
        } else {
            System.out.println(String.format("Дистанция кота: %s не выполнима. Максимаьная дистанция: %s", length, getMaxRunlenght()));
        }


    }

    @Override
    public void dpSwim (int length) {
        System.out.println("Коты не любят плавать :(");

    }
}
