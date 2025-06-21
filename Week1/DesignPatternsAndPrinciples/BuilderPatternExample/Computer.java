public class Computer {
    private String CPU;
    private int RAM;
    private int Storage;
    private String GPU;
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GPU = builder.GPU;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int Storage) {
        this.Storage = Storage;
    }

    public void setGPU(String GPU){
        this.GPU = GPU;
    }

    public String getGPU(){
        return GPU;
    }

    

    public static class ComputerBuilder{
        private String CPU;
        private int RAM;
        private int Storage;
        private String GPU;

        public ComputerBuilder(String CPU, int RAM){
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public ComputerBuilder setCPU(String CPU){
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setRAM(int RAM){
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setStorage(int Storage){
            this.Storage = Storage;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        

        // Passing the current builder object to the private constructor of Computer
        public Computer build(){
            return new Computer(this);
        }
    }

}
