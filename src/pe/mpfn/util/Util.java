package pe.mpfn.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Properties;

public class Util {
    public static int i=1;
    public static double MAXPROM=13;
    public static final double IGV=0.18;

    public static final int MEMORY=0;
    public static final int FILE=1;
    public static final int DB=2;

    public static final String APROBADO="PASO EL CURSO";
    public static  final  String DESAPROBADO="JALADO";

    public static int opc;

    public static Tipo tipo = Tipo.MEMORY;

    static{
        Properties myProps = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            myProps.load(fis);
            opc = Integer.parseInt(myProps.getProperty("opc"));
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());

        }
        }
        public static int generarId(){
        return i++;
    }
}
