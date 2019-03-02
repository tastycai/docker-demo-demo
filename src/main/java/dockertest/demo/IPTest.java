package dockertest.demo;

public class IPTest {


    public void convertIp(){


    }

    public static void main(String[] args){

        String ip = "255.168.0.1";

        String[] array = ip.split("\\.");

        Integer value = 0;

        for (String dot : array){

            byte temp = (byte) Integer.parseInt(dot);

            value = value <<8 | 0xff & temp;
        }

        System.out.println(Integer.toBinaryString(value));
    }
}
