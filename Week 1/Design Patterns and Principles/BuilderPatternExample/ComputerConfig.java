public class ComputerConfig {
    public static void main(String[] args) {
        Computer Computer1 = new Computer.ComputerBuilder().setCPU("Intel").setRAM(8).setStorage(512).build();
        Computer Computer2 = new Computer.ComputerBuilder().setCPU("AMD").setRAM(16).setStorage(512).build();

        System.out.println("Computer 1 Config:");
        System.out.println("CPU: " + Computer1.getCPU());
        System.out.println("RAM: " + Computer1.getRAM());
        System.out.println("Storage: " + Computer1.getStorage());

        System.out.println();

        System.out.println("Computer 2 Config:");
        System.out.println("CPU: " + Computer2.getCPU());
        System.out.println("RAM: " + Computer2.getRAM());
        System.out.println("Storage: " + Computer2.getStorage());


    }
}
