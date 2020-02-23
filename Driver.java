import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first date: ");
        String date1 = scn.next();
        System.out.print("Enter second date: ");
        String date2 = scn.next();
            	
        List<String> listOfMonths = getListofMonths(date1,date2);
    	System.out.println(listOfMonths);
    	for(int num=1; num<=6; num++) {
    		String grphValue = getGraphValue(num,listOfMonths);
    		System.out.println(grphValue);
    	}
    	
    	scn.close();
    }
        
    private static List<String> getListofMonths(String date1, String date2) {    
        
        List<String> list = new ArrayList<String>();
    	DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
    	DateFormat targetFormat = new SimpleDateFormat("MMM-yy");
    	try {
    	String beginDate = targetFormat.format(originalFormat.parse(date1));
    	String endDate = targetFormat.format(originalFormat.parse(date2));
    	
    	Calendar beginCalendar = Calendar.getInstance();
        Calendar finishCalendar = Calendar.getInstance();

        
        beginCalendar.setTime(targetFormat.parse(beginDate));
        finishCalendar.setTime(targetFormat.parse(endDate));
            
        while (beginCalendar.before(finishCalendar)) {
                // add one month to date per loop
                String date =     targetFormat.format(beginCalendar.getTime()).toUpperCase();
                list.add(date);
                beginCalendar.add(Calendar.MONTH, 1);
        }
        		list.add(endDate.toUpperCase());
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
		return list;
    	
    }
        
    private static String getGraphValue(int num, List<String> listOfMonths) {
		StringBuffer grphValue = new StringBuffer();
		if(num==4) {
			grphValue.append(".Net=24,Java=96");
			return grphValue.toString();
		}
		
		else if(num == 5) {
			grphValue.append("Linked=25,Not Linked=75");
			return grphValue.toString();
		}
		
		else {
		for(String month: listOfMonths) {
			String dbGraph = getGraphValueFromDB(num,month);
			grphValue.append(month).append("=").append(dbGraph).append(",");
		}
		int grphLen = grphValue.length();
		grphValue.delete(grphLen - 1, grphLen);
		return grphValue.toString();
		}
	}

	private static String getGraphValueFromDB(int num, String month) {
		if(num==1) {
		
			switch(month) {
				case "JAN-17": return "0";
				case "FEB-17": return "11";
				case "MAR-17": return "23";
				case "APR-17": return "32";
				case "MAY-17": return "21";
				case "JUN-17": return "21";
				case "JUL-17": return "15";
				case "AUG-17": return "18";
				case "SEP-17": return "1";
				case "OCT-17": return "10";
				case "NOV-17": return "46";
				case "DEC-17": return "17";
				
				case "JAN-18": return "32";
				case "FEB-18": return "47";
				case "MAR-18": return "50";
				case "APR-18": return "78";
				case "MAY-18": return "98";
				case "JUN-18": return "24";
				case "JUL-18": return "36";
				case "AUG-18": return "79";
				case "SEP-18": return "100";
				case "OCT-18": return "25";
				case "NOV-18": return "17";
				case "DEC-18": return "109";
				
				case "JAN-19": return "50";
				case "FEB-19": return "80";
				case "MAR-19": return "112";
				case "APR-19": return "135";
				case "MAY-19": return "71";
				case "JUN-19": return "81";
				case "JUL-19": return "91";
				case "AUG-19": return "100";
				case "SEP-19": return "123";
				case "OCT-19": return "57";
				case "NOV-19": return "79";
				case "DEC-19": return "68";
				
				case "JAN-20": return "04";
				case "FEB-20": return "27";
				case "MAR-20": return "0";
				
				default: return "0";
			}
		}
		
		else if(num==2) {
			
			switch(month) {
				case "JAN-17": return "0";
				case "FEB-17": return "21";
				case "MAR-17": return "32";
				case "APR-17": return "23";
				case "MAY-717": return "12";
				case "JUN-17": return "21";
				case "JUL-17": return "51";
				case "AUG-17": return "81";
				case "SEP-17": return "10";
				case "OCT-17": return "01";
				case "NOV-17": return "64";
				case "DEC-17": return "71";
				
				case "JAN-18": return "23";
				case "FEB-18": return "74";
				case "MAR-18": return "5";
				case "APR-18": return "87";
				case "MAY-18": return "89";
				case "JUN-18": return "42";
				case "JUL-18": return "63";
				case "AUG-18": return "97";
				case "SEP-18": return "100";
				case "OCT-18": return "52";
				case "NOV-18": return "71";
				case "DEC-18": return "109";
				
				case "JAN-19": return "50";
				case "FEB-19": return "18";
				case "MAR-19": return "112";
				case "APR-19": return "153";
				case "MAY-19": return "17";
				case "JUN-19": return "18";
				case "JUL-19": return "91";
				case "AUG-19": return "100";
				case "SEP-19": return "135";
				case "OCT-19": return "75";
				case "NOV-19": return "79";
				case "DEC-19": return "66";
				
				case "JAN-20": return "42";
				case "FEB-20": return "23";
				case "MAR-20": return "0";
				
				default: return "0";
				}
			}
		
		else if(num==3) {
			
			switch(month) {
				case "JAN-17": return "0"+"="+"0";
				case "FEB-17": return "21"+"="+"10";
				case "MAR-17": return "32"+"="+"02";
				case "APR-17": return "23"+"="+"24";
				case "MAY-17": return "12"+"="+"25";
				case "JUN-17": return "21"+"="+"27";
				case "JUL-17": return "51"+"="+"54";
				case "AUG-17": return "81"+"="+"41";
				case "SEP-17": return "10"+"="+"51";
				case "OCT-17": return "01"+"="+"57";
				case "NOV-17": return "64"+"="+"48";
				case "DEC-17": return "71"+"="+"59";
				
				case "JAN-18": return "23"+"="+"01";
				case "FEB-18": return "74"+"="+"20";
				case "MAR-18": return "5"+"="+"30";
				case "APR-18": return "87"+"="+"20";
				case "MAY-18": return "89"+"="+"13";
				case "JUN-18": return "42"+"="+"59";
				case "JUL-18": return "63"+"="+"80";
				case "AUG-18": return "97"+"="+"90";
				case "SEP-18": return "100"+"="+"100";
				case "OCT-18": return "52"+"="+"10";
				case "NOV-18": return "71"+"="+"48";
				case "DEC-18": return "109"+"="+"75";
				
				case "JAN-19": return "50"+"="+"05";
				case "FEB-19": return "18"+"="+"57";
				case "MAR-19": return "112"+"="+"42";
				case "APR-19": return "153"+"="+"32";
				case "MAY-19": return "17"+"="+"77";
				case "JUN-19": return "18"+"="+"55";
				case "JUL-19": return "91"+"="+"33";
				case "AUG-19": return "100"+"="+"22";
				case "SEP-19": return "135"+"="+"14";
				case "OCT-19": return "75"+"="+"51";
				case "NOV-19": return "79"+"="+"88";
				case "DEC-19": return "66"+"="+"11";
				
				case "JAN-20": return "42"+"="+"02";
				case "FEB-20": return "23"+"="+"33";
				case "MAR-20": return "0"+"="+"0";
				
				default: return "0"+"="+"0";
				}
			}
		
		else if(num==6) {
			
			switch(month) {
				case "JAN-17": return "0"+"="+"0";
				case "FEB-17": return "21"+"="+"10";
				case "MAR-17": return "32"+"="+"02";
				case "APR-17": return "23"+"="+"24";
				case "MAY-17": return "12"+"="+"25";
				case "JUN-17": return "21"+"="+"27";
				case "JUL-17": return "51"+"="+"54";
				case "AUG-17": return "81"+"="+"41";
				case "SEP-17": return "10"+"="+"51";
				case "OCT-17": return "01"+"="+"57";
				case "NOV-17": return "64"+"="+"48";
				case "DEC-17": return "71"+"="+"59";
				
				case "JAN-18": return "23"+"="+"01";
				case "FEB-18": return "74"+"="+"20";
				case "MAR-18": return "5"+"="+"30";
				case "APR-18": return "87"+"="+"20";
				case "MAY-18": return "89"+"="+"13";
				case "JUN-18": return "42"+"="+"59";
				case "JUL-18": return "63"+"="+"80";
				case "AUG-18": return "97"+"="+"90";
				case "SEP-18": return "100"+"="+"100";
				case "OCT-18": return "52"+"="+"10";
				case "NOV-18": return "71"+"="+"48";
				case "DEC-18": return "109"+"="+"75";
				
				case "JAN-19": return "50"+"="+"05";
				case "FEB-19": return "18"+"="+"57";
				case "MAR-19": return "112"+"="+"42";
				case "APR-19": return "153"+"="+"32";
				case "MAY-19": return "17"+"="+"77";
				case "JUN-19": return "18"+"="+"55";
				case "JUL-19": return "91"+"="+"33";
				case "AUG-19": return "100"+"="+"22";
				case "SEP-19": return "135"+"="+"14";
				case "OCT-19": return "75"+"="+"51";
				case "NOV-19": return "79"+"="+"88";
				case "DEC-19": return "66"+"="+"11";
				
				case "JAN-20": return "42"+"="+"02";
				case "FEB-20": return "23"+"="+"33";
				case "MAR-20": return "0"+"="+"0";
				
				default: return "0"+"="+"0";
				}
			}
		return null;
		
	}

	
    
}
