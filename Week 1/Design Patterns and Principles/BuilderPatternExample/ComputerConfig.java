public class ComputerConfig {
    public static void main(String[] args) {
        Computer Computer1 = new Computer.ComputerBuilder("Intel",8).setStorage(512).build();
        Computer GamingPC = new Computer.ComputerBuilder("AMD",16).setGPU("RTX 3050").build();

        System.out.println("Computer 1 Config:");
        System.out.println("CPU: " + Computer1.getCPU());
        System.out.println("RAM: " + Computer1.getRAM());
        System.out.println("Storage: " + Computer1.getStorage());

        System.out.println();

        System.out.println("Computer 2 Config:");
        System.out.println("CPU: " + GamingPC.getCPU());
        System.out.println("RAM: " + GamingPC.getRAM());
        System.out.println("Storage: " + GamingPC.getStorage());


    }
}
