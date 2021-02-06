package fr.qilat.businesstour;

import fr.qilat.businesstour.netty.server.DiscardServer;

public class Main {
    
    private static final int PORT = 24462;
    
    public static void main(String[] args) throws Exception {
        for (String arg : args)
            System.out.println(arg);
    
        new DiscardServer(PORT).run();
        
        
    }
}
