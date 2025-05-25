package homeworks.homework_27;

public class Dog {
    private String name;
    private int initialJumpHeight;
    private int currentJumpHeight;

    public Dog(String name, int initialJumpHeight) {
        this.name = name;
        this.initialJumpHeight = initialJumpHeight;
        this.currentJumpHeight = initialJumpHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInitialJumpHeight() {
        return initialJumpHeight;
    }

    public int getCurrentJumpHeight() {
        return currentJumpHeight;
    }

    public boolean train() {
        if (currentJumpHeight < initialJumpHeight * 2) {
            currentJumpHeight += 10;
            if (currentJumpHeight > initialJumpHeight * 2) {
                currentJumpHeight = initialJumpHeight * 2;
            }
            return true;
        }
        return false;
    }

    public int jumpBarrier(int heightBarrier) {
        if (heightBarrier <= currentJumpHeight) {
            return 1;
        } else if (heightBarrier <= initialJumpHeight * 2) {
            return 0;
        }
        return -1;
    }

    public void info() {
        System.out.printf("Собака по кличке %s:\n- первоначальная высота прыжка: %d (см)\n- текущая высота прыка: %d " +
                        "(см)\n",
                name, initialJumpHeight, currentJumpHeight);
    }
}
