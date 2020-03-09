package JSON;

import org.json.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConvertToJSON
{
    String a="Nadim,1028,21,B+",JSONText,XMLText,CSVText,lineOfString;
    String[] splitedString;

    private static ArrayList<StringObject> stringObjects = new ArrayList<>();
    public  void convertToJSON() throws JSONException, FileNotFoundException {
       // String[] string=a.split(",",4);

        File f = new File("C:\\Users\\bsse1\\IdeaProjects\\ASSIGNMENT-1\\src\\data\\textfile");
        Scanner input = new Scanner(f);
        while (input.hasNextLine())
        {
            lineOfString = input.nextLine();
            splitedString = lineOfString.split(",", 5);

            StringObject sObject= new StringObject();
            sObject.setName(splitedString[0]);
            sObject.setRoll(splitedString[1]);
            sObject.setAge(splitedString[2]);
            sObject.setBloodGroup(splitedString[3]);

            stringObjects.add(sObject);
        }


        JSONArray jsonArray=new JSONArray();
        try {

            for (StringObject stringObject : stringObjects) {

                JSONObject jsonObject = new JSONObject();
                jsonObject.put("Name", stringObject.getName());
                jsonObject.put("Roll", stringObject.getRoll());
                jsonObject.put("Age", stringObject.getAge());
                jsonObject.put("BloodGroup", stringObject.getBloodGroup());

                jsonArray.put(jsonObject);
            }

        }
            catch (Exception e) {
                e.printStackTrace();
            }



        JSONText=jsonArray.toString();
        XMLText = XML.toString(jsonArray);
        CSVText = CDL.toString(jsonArray);

        System.out.println(JSONText);
        System.out.println(XMLText);
        System.out.println(CSVText);

       /* for(int i=0;i<string.length;i++){
            System.out.println(string[i]);
        }


        JSONArray jsonArray=new JSONArray();

        try{
            JSONObject jsonObject= new JSONObject();
            jsonObject.put("Name",sObject.getName());
            jsonObject.put("Roll",sObject.getRoll());
            jsonObject.put("Age",sObject.getAge());
            jsonObject.put("BloodGroup",sObject.getBloodGroup());

            jsonArray.put(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONFormat=jsonArray.toString();
        System.out.println(JSONFormat);
        */
    }
}
