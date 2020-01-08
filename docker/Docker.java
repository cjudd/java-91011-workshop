public class Docker {  
    public static void main(String[] args) throws Exception {
      Runtime runtime = Runtime.getRuntime();
      int  cpus = runtime.availableProcessors();
      long mmax = runtime.maxMemory() / 1024 / 1024;
      System.out.println("Cores : " + cpus);
      System.out.println("Memory: " + mmax);
    }
  }
  