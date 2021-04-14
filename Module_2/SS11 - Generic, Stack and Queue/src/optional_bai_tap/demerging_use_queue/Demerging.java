package optional_bai_tap.demerging_use_queue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

public class Demerging {
    static class HumanResource {
        private String name;
        private String gender;
        private String birthDay;


        public HumanResource() {
        }

        public HumanResource(String name, String gender, String birthDay) {
            this.name = name;
            this.birthDay = birthDay;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }



        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(String birthDay) {
            this.birthDay = birthDay;
        }

        @Override
        public String toString() {
            return "HumanResource{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", birthDay=" + birthDay +
                    '}';
        }
    }
   
    public static void main(String[] args) {
        ArrayList<HumanResource> humanResources= new ArrayList<>();
        HumanResource human1 = new HumanResource("Minh Dog","Nữ","02/03/1990");
        HumanResource human2 = new HumanResource("Minh Alone","Nữ","01/03/1990");
        HumanResource human3 = new HumanResource("Minh Weak xxx","Nam","02/05/1991");
        HumanResource human4 = new HumanResource("Minh is Gays","Nam","02/06/1993");
        HumanResource human5 = new HumanResource("Minh is Les","Nữ","03/03/1993");
        humanResources.add(human1);
        humanResources.add(human2);
        humanResources.add(human3);
        humanResources.add(human4);
        humanResources.add(human5);

        Collections.sort(humanResources, new Comparator<HumanResource>() {
            DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            @Override
            public int compare(HumanResource o1, HumanResource o2) {
                try {
                    return dateFormat.parse(o1.getBirthDay()).compareTo(dateFormat.parse(o2.getBirthDay()));
                } catch (ParseException e) {
                    throw  new IllegalArgumentException();
                }
            }
        });
       // humanResources.sort(Comparator.comparing(HumanResource::getBirthDay));
        humanResources.sort(Comparator.comparing(HumanResource::getGender).reversed());
        Queue nam = new LinkedList();
        Queue nu = new LinkedList();
        for(int i=0;i<humanResources.size();i++){
            if(humanResources.get(i).getGender()=="Nữ"){
                nu.add(humanResources.get(i));
            }else {
                nam.add(humanResources.get(i));
            }
        }

        System.out.println(nam);
        System.out.println(nu);
        System.out.println(humanResources);
    }
}
