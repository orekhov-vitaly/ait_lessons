package homeworks.homework_23;

public class TV {
    String brand;
    String model;
    int diagonalSize;
    String matrixType;
    boolean smartTV;
    boolean isOn;
    int volume;
    int channel;

    public TV(String brand, String model, int diagonalSize, String matrixType, boolean smartTV) {
        this.brand = brand;
        this.model = model;
        this.diagonalSize = diagonalSize;
        this.matrixType = matrixType;
        this.smartTV = smartTV;
        this.isOn = false;
        this.volume = 0;
        this.channel = 1;
    }

    public void editBrand(String brand) {
        this.brand = brand;
    }

    public void editModel(String model) {
        this.model = model;
    }

    public void onOff() {
        this.isOn = (this.isOn) ? false : true;
    }

    public void setVolumeUp() {
        if (this.isOn) {
            this.volume = this.volume < 100 ? ++(this.volume) : this.volume;
        }
    }

    public void setVolumeDown() {
        if (this.isOn) {
            this.volume = this.volume > 0 ? --(this.volume) : this.volume;
        }
    }

    public void setChannelNext() {
        if (this.isOn) {
            this.channel = this.channel < 99 ? ++(this.channel) : 1;
        }
    }

    public void setChannelPrev() {
        if (this.isOn) {
            this.channel = this.channel > 1 ? --(this.channel) : 99;
        }
    }

    public void setChanne(int channelNum) {
        if (channelNum > 0 && channelNum < 100) {
            this.channel = channelNum;
        }
    }

    public void info() {
        System.out.printf(
            "Информация о телевизоре.\n" +
            "Бернд: %s; Модель: %s; Диагональ: %d; Тип матрицы: %s; SmartTV: %b\n" +
            "Включен: %b; Уровень громкости: %d; Номер канала: %d\n",
            this.brand,
            this.model,
            this.diagonalSize,
            this.matrixType,
            this.smartTV,
            this.isOn,
            this.volume,
            this.channel
        );
    }
}
