package Assignment1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
    	/* Complete here the code for the main method ...*/
    	Network objNetwork = new Network("network");/* Activate the network */
        Server objServer = new Server();      
        Client objClientSending = new Client("sending");
        Client objClientReceiving = new Client("receiving");
        objNetwork.start();
        objServer.start();
        objClientSending.start();
        objClientReceiving.start();
        try {
        	objNetwork.join(); 
            objServer.join(); 
            objClientSending.join();
            objClientReceiving.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
        
    
}
