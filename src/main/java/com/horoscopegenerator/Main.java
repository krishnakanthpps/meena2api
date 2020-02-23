package com.horoscopegenerator;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import com.horoscopegenerator.npl.pdf.NPLGeneratorPerDay2019;

//Clear button onUI


public class Main {
    public static void main(String[] args) throws Exception {

//		StringBuilder sb= new StringBuilder("helloworldx");
//		sb.deleteCharAt(sb.length()-1);
//		System.out.println(sb);
//	
//		if(true)
//			return;

        String name = "Test";
        double longitude = 83 + 18 / 60.0D + 0 / 3600.0D;
        double latitude = 17 + 42 / 60.0D + 0 / 3600.0D;

        String timeOfBirth = 4 + "-" + 8 + "-" + 1958 + " " + 3 + ":" + 30 + ":" + 0;

        timeOfBirth = 9 + "-" + 10 + "-" + 1978 + " " + 22 + ":" + 30 + ":" + 0;

//	  for(int i=0;i<24;i++) {
//		  timeOfBirth = 13 + "-" + 3 + "-" + 1985 + " " + i + ":" + 30 + ":" + 0;

//	  12.126 , 78.154
//	  timeOfBirth = 7 + "-" + 9 + "-" + 2009 + " " + 13 + ":" + 27 + ":" + 0;
        longitude = 79 + 35 / 60.0D + 0 / 3600.0D;
        latitude = 18 + 0 / 60.0D + 0 / 3600.0D;

        longitude = 81 + 47 / 60.0;    // Chennai
        latitude = 16 + 59 / 60.0;

        //	  timeOfBirth =  9 + "-" + 10 + "-" + 1978 + " " + 19 + ":" + 00 + ":" + 0;
        //	  populateTimeZones();


        //Santha Devi.
        timeOfBirth = 23 + "-" + 10 + "-" + 1942 + " " + 14 + ":" + 45 + ":" + 0;
        longitude = 80 + 59 / 60.0;    // Chennai
        latitude = 16 + 26 / 60.0;


        //Vijayalakshmiji
        timeOfBirth = 1 + "-" + 7 + "-" + 1967 + " " + 1 + ":" + 14 + ":" + 0;
        longitude = 78 + 10 / 60.0; //78.48;
        latitude = 12 + 8 / 60.0;


        //Thippaswami
        timeOfBirth = 21 + "-" + 3 + "-" + 1970 + " " + 18 + ":" + 15 + ":" + 0;
        longitude = 80 + 37 / 60.0; //78.48;
        latitude = 16 + 31 / 60.0;

        //Gopalaswami
        //Actual 23:19
        timeOfBirth = 20 + "-" + 6 + "-" + 1936 + " " + 23 + ":" + 42 + ":" + 20;
        longitude = 78 + 50 / 60.0; //78.48;
        latitude = 9 + 23 / 60.0;

        //Satya - Raja sir
        timeOfBirth = 21 + "-" + 10 + "-" + 1989 + " " + 13 + ":" + 45 + ":" + 0;
        longitude = 78.48; //+ 29/60.0; //78.48;
        latitude = 17.37; //+ 23/60.0; //17.37;

        //Test - VijayaLakshimi
        name = "Test Vijayalakshmiji";
        timeOfBirth = 30 + "-" + 3 + "-" + 2015 + " " + 22 + ":" + 0 + ":" + 0;
        longitude = 78.48; //+ 29/60.0; //78.48;
        latitude = 17.37; //+ 23/60.0; //17.37;

        //Guruji
        ///Actual 8:25 - Diff = 23 min 20 sec
        timeOfBirth = 18 + "-" + 3 + "-" + 1913 + " " + 8 + ":" + 25 + ":" + 0;
        longitude = 79 + 55 / 60.0; //78.48;
        latitude = 13 + 9 / 60.0;


        //Guruji
        ///Actual 8:25 - Diff = 23 min 20 sec
        timeOfBirth = 30 + "-" + 12 + "-" + 1942 + " " + 8 + ":" + 25 + ":" + 0;
        timeOfBirth = 30 + "-" + 12 + "-" + 1942 + " " + 5 + ":" + 47 + ":" + 43;
        longitude = 78.48; //+ 29/60.0; //78.48;
        latitude = 17.37; //+ 23/60.0; //17.37;


        //Test - VijayaLakshimi

//		 for(int i=5;i<6; i++ ) {
        name = "Test War time";
//		 timeOfBirth = 29 + "-" + 3 + "-" + 2015 + " " + i + ":" + 0 + ":" + 0;
        longitude = 78.48; //+ 29/60.0; //78.48;
        latitude = 17.37; //+ 23/60.0; //17.37;

//		 System.out.println("Generating for " + timeOfBirth);

//	 	           
//  		  longitude = 78.167; //83.8952; //76.575;
//		  latitude = 12.133; //18.2992; //9.385;
//		  
//		   
//		  timeOfBirth = 16 + "-" + 2 + "-" + 1988 + " " + 14 + ":" + 40 + ":" + 00;
//		  timeOfBirth = 28 + "-" + 3 + "-" + 1996 + " " + 12 + ":" + 38 + ":" + 00;
//		  timeOfBirth = 7 + "-" + 11 + "-" + 1988 + " " + 19 + ":" + 55 + ":" + 00;

        name = "Shilpa Satyamurthy";
        timeOfBirth = 23 + "-" + 2 + "-" + 1986 + " " + 15 + ":" + 36 + ":" + 0;
        longitude = 78.48; //+ 29/60.0; //78.48;
        latitude = 17.37; //+ 23/60.0; //17.37;


        //Sarada Devi.
        timeOfBirth = 13 + "-" + 03 + "-" + 1985 + " " + 4 + ":" + 22 + ":" + 0;
        longitude = 81 + 40 / 60.0;    // Narasapuram
        latitude = 16 + 27 / 60.0;


        Map<String, byte[]> images = new HashMap<>();


        for (int i = 1; i < 32; i++) {
            //HYD
            longitude = 78.4666; //+ 29/60.0; //78.48;
            latitude = 17.3833; //+ 23/60.0; //17.37;

            //NSP
//            longitude = 81.6966; //+ 29/60.0; //78.48;
//            latitude = 16.4329; //+ 23/60.0; //17.37;


            NPLGeneratorPerDay2019 generator = new NPLGeneratorPerDay2019();

            NativeDetails nd = new NativeDetails();
            nd.setNativeName(name);

            nd.setDateOfBirth(i + "-" + 6 + "-" + 2019);
            nd.setTimeOfBirth(4 + ":" + 0 + ":" + 0);
            nd.setLatitude(latitude);
            nd.setLongitude(longitude);
            nd.setPlaceOfBirth("Hyderabad");
            nd.setTimeZoneId("Asia/Calcutta");
            nd.setOffset(-19800000);
            nd.setFilePath("c:\\temp\\NPL" + i + "-JUN-2019.pdf");
            nd.setImageData(images);

            System.out.println("Input: " + nd.toString());
            generator.generate(nd, true, true);


            timeOfBirth = i + "-" + 4 + "-" + 2019 + " " + 10 + ":" + 0 + ":" + 0;


            NPLGenerator generator1 = new NPLGenerator(
                    name,
                    longitude,
                    latitude,
                    timeOfBirth,
//				  TimeZone.getTimeZone("Europe/Paris"),
                    TimeZone.getTimeZone("Asia/Calcutta"),
                    "Hyderabad", true);
            generator1.setLocal(true);

            generator1.setImageData(images);
            generator1.setFilePath("c:\\temp\\NPLOLD" + i + "-APR-2019.pdf");
//		generator1.generate();
        }

    }

    private static double getDoubleValue(String value) {
        //Example 24#19
        String[] values = value.split("#");
        return Integer.parseInt(values[0]) + Integer.parseInt(values[1]) / 60.0D + 0 / 3600.0D;
    }

    private static void populateTimeZones() {
        String[] zoneIds = TimeZone.getAvailableIDs();
        Date today = new Date();

        TimeZone tz = TimeZone.getTimeZone("IST");
        String longName = tz.getDisplayName(tz.inDaylightTime(today), 1);
        System.out.println(longName + " " + tz);

//    for (int i = 0; i < zoneIds.length; i++) {
//      TimeZone tz = TimeZone.getTimeZone("IST");
//      String longName = tz.getDisplayName(tz.inDaylightTime(today), 1);
//      System.out.println(longName + " " + zoneIds[i]);
//      
//       
//    }

    }

}
