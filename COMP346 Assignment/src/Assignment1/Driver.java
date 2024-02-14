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
     * @throws InterruptedException 
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
        //join if we need stuff to run after threads finish
        
        objNetwork.start();
        objServer.start();
        objClientSending.start();
        objClientReceiving.start();
        
    }
        
    
}
