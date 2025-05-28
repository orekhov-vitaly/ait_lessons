package homeworks.homework_29.components;

public class Computer {
    private String model;

    private Processor processor;
    private Memory memory;

    private Storage storage;

    public Computer(String compModel, Storage storage, int memorySize) {
        this.model = model;
        this.storage = storage;

        this.processor = new Processor("Intel", "i5");
        this.memory = new Memory("Samsung", "T9", memorySize);
    }

    public String toString() {
        return String.format("Computer: model: %s | processor: %s | memory: %s | storage:  %s", model,
                processor.toString(), memory.toString(), storage.toString());
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
