class AB{  
    private static AB obj=new AB();//Early, instance will be created at load time  
    private AB(){}  
      
    public static AB getAB(){  
     return obj;  
    }  
     
    public void doSomething(){  
    System.out.println("hai....");
    }  
   }  