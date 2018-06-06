package utility;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	 private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\JaspreetSingh\\workspace\\DVLA\\src\\main\\resources\\Data\\test.csv";
	 
	    public static List<VehicleDetail> readCsv() throws IOException {
	        try (
	            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
	            CSVReader csvReader = new CSVReader(reader);
	        		
	        ) {
	        	List<VehicleDetail> VehicleList = new ArrayList<VehicleDetail>();

        		
        		

	            // Reading Records One by One in a String array
	           
	        	String[] nextRecord;
	        	
	        	VehicleDetail vehicle = new VehicleDetail();
	            while ((nextRecord = csvReader.readNext()) != null) {
	            	
	            	vehicle.setReg_number(nextRecord[0]);

	            	vehicle.setColour(nextRecord[1]);
	            	vehicle.setMake(nextRecord[2]);
	            	VehicleList.add(vehicle);
	            	
	        
	               
	            }
	            
	            return VehicleList;
	        }
	    }
	}
	
	


