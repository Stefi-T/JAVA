package stefi;

public class cpu {
    int price;
    class processor {
        int no_cores;
        String manufacturer;
         processor(int no_cores,String manufacturer)
        {
            this.no_cores = no_cores;
            this.manufacturer = manufacturer;
            System.out.println("number of cores : " +  this.no_cores); 
            System.out.println("manufacturer : " +  this.manufacturer);
        }

    }

    static class ram {
        String memory,manufacturer;
        public ram(String memory,String manufacturer)
        {
            this.memory = memory;
            this.manufacturer = manufacturer;
            System.out.println("memory type : " +  this.memory); 
            System.out.println("manufacturer : " +  this.manufacturer);
        }
    }

        public static void main(String args[]) {
            cpu obj = new cpu();
            
            cpu.processor obj2 = obj.new processor(4,"intel");
            cpu.ram obj1 = new cpu.ram("ddr4","crucial");
        }
}