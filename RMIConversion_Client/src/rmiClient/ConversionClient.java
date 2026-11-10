package rmiClient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiService.IConversion;

public class ConversionClient {

    public static void main(String[] args) {

        try {

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            IConversion service = (IConversion) registry.lookup("ConversionService");

            double resultat = service.convertirMontant(500);

            System.out.println("Montant en euros : 500");
            System.out.println("Montant en dinars : " + resultat);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
