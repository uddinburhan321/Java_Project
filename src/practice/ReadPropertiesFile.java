package practice;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {

        String fileLoc = null;
        String Key = null;

        Scanner k = new Scanner(System.in);

        //getDataFromPropertiesFile(fileLoc, Key);


        System.out.println("What's your location?");
        fileLoc = k.nextLine();

        System.out.println("What's your key?");
        Key = k.nextLine();


        //String value = getDataFromPropertiesFile("src/practice/config.properties", "dbUser");
        //System.out.println(value);




    }

/*    public static String getDataFromPropertiesFile(String fileLocation, String key) throws IOException {


        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(fileLocation);
        properties.load(inputStream);
        String Key = properties.getProperty(key);
        return;*/

        // if a class has abstract before class name we can't create obj the traditional way

        /*try {
            InputStream inputStream = new FileInputStream("src/fourthpackage/confg.properties");
        } catch (FileNotFoundException e) {
            System.out.println("please fix the file path . there wa a FileNotFoundException exception");
            e.printStackTrace();
        }*/

/*        InputStream inputStream = new FileInputStream("src/practice/config.properties");

        properties.load(inputStream);

        String dbNameFromFile = properties.getProperty("dbName");
        String dbUserFromFile = properties.getProperty("dbUser");
        String dbPasswordFromFile = properties.getProperty("dbPassword");
        System.out.println(dbNameFromFile);
        System.out.println(dbUserFromFile);
        System.out.println(dbPasswordFromFile);*/

    //}
}
