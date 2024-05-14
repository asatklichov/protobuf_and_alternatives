package net.sahet.protobuf.demo;

import com.google.protobuf.Any;
import net.sahet.tt.point.compound.Employee;
import net.sahet.tt.point.compound.KeyMsg;
import net.sahet.tt.point.compound.KeyMsg.KeyMsgOneOfCase;
import net.sahet.tt.point.compound.Viewer;
import net.sahet.tt.point.compound.ComplexKey;
import net.sahet.tt.point.compound.Divadlo;
import net.sahet.tt.point.compound.Divadlo.AvailableEmployeesCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompoundTypesDemo {

    public static void main(String[] args) throws IOException {
        /**OneOf - We pass a few parameters to this OneOf data type and Protobuf ensures that only one of them is set.
         If we set one of them and try to set the other one, the first attribute gets reset.
         Contains information about the available employees
         */
        List<Any> people = new ArrayList<>();
        //pack, & unpack 
        people.add(Any.pack(Employee.newBuilder().setName("John").build()));
        people.add(Any.pack(Viewer.newBuilder().setName("Jane").setAge(30).build()));
        people.add(Any.pack(Employee.newBuilder().setName("Simon").build()));
        people.add(Any.pack(Viewer.newBuilder().setName("Janice").setAge(25).build()));


        Divadlo div = Divadlo.newBuilder().setName("Mollanepes")
        		//.setExperts("I'am one of expert")
        		//.setCount(23232) //should override oneof set value
        		//.setNewVal(-32323)
                .setAnyBody(Any.pack(Employee.newBuilder().setName("ANY-Simon").build()))
                //.setAnyBody(Any.pack(MyAnyPojo.class)) //can not get message non-define-in-proto
        		.addAllPeopleInside(people).build();


        String filename = "divadlo_protobuf_output";
        System.out.println("Saving info in file " + filename);

        try (FileOutputStream output = new FileOutputStream(filename)) {
            div.writeTo(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saved greeting with following data to disk: \n" + div);


        System.out.println("\n --- --- ");
        try (FileInputStream input = new FileInputStream(filename)) {
            Divadlo.Builder divB = Divadlo.newBuilder();
            Divadlo div2 = divB.mergeFrom(input).build();
            System.out.println(div2.getName());


            System.out.println("\n oneOf demo");
            System.out.println("----=="+div2.getCount());
            System.out.println("----=="+div2.getExperts());
            System.out.println("----=="+div2.getNewVal());
            System.out.println("----=="+div2.getAnyBody()); //anybody from ANY
            System.out.println("----=="+div2.getOneOfLegacy());

            System.out.println("----=="+div2.getMemberLegacy2());

            System.out.println();
            Divadlo.AvailableEmployeesCase oneOfCase = div2.getAvailableEmployeesCase(); ///getXXXCase
            System.out.println("--> "+oneOfCase);
            switch (oneOfCase){
                case COUNT:
                    System.out.println(AvailableEmployeesCase.COUNT);                    
                    break;
                case EXPERTS:
                    System.out.println(AvailableEmployeesCase.EXPERTS);

            }



            System.out.println("\n --- --- ");
            System.out.println("\n ANY demo");
            for (Any any : div2.getPeopleInsideList()) { //JAVA 14 context aware instance of ;)
                //good thing is NO CAST needed
            	
            	
                if (any.is(Employee.class)) {
                    Employee employee = any.unpack(Employee.class);
                    System.out.println("-->Employee:" + employee);
                }
                if (any.is(Viewer.class)) {
                    Viewer viewer = any.unpack(Viewer.class);
                    System.out.println("Viewer:" + viewer);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


class ComplexKeyDemo {

    public static void main(String[] args) throws IOException {
         
    	ComplexKey complexKey = ComplexKey.newBuilder().setName("Garmasyk Acar")
    			.setDomainId(23).build();

        KeyMsg key = KeyMsg.newBuilder()        		
        		.setComplexName(complexKey)//yada asaky baha
        		//.setName("Kemine")
        		.build();


        String filename = "complezmsg";
        System.out.println("Saving info in file " + filename);

        try (FileOutputStream output = new FileOutputStream(filename)) {
        	key.writeTo(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saved to disk: \n" + key);


        System.out.println("\n --- --- ");
        try (FileInputStream input = new FileInputStream(filename)) {
        	KeyMsg.Builder ky = KeyMsg.newBuilder();
        	KeyMsg kiy = ky.mergeFrom(input).build(); 

            System.out.println("\n oneOf demo");
            KeyMsg.KeyMsgOneOfCase oneOfCase = kiy.getKeyMsgOneOfCase();
            System.out.println("--> "+ oneOfCase);
            switch (oneOfCase){
                case NAME:
                    System.out.println(KeyMsgOneOfCase.NAME);
                    break;
                case COMPLEXNAME:
                    System.out.println(KeyMsgOneOfCase.COMPLEXNAME);

            } 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}




class MyAnyPojo {
    private String name;
}
