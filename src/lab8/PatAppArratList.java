package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PatAppArratList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many data you have: ");
        int val = Integer.parseInt(reader.readLine());
        ArrayList<Pet> myList = new ArrayList<Pet>();
        myList = inputData(myList,val);
        showData(myList);



        private static void showData(ArrayList<Pet> myList) {
            for (int i = 0; i<myList.size(); i++) {
                System.out.println("Pet info "+(i+1)+" :");
                System.out.println("Name: "+myList.get(i).getName());
                System.out.println("Age: "+myList.get(i).getAge());
    }

    private static ArrayList inputData(ArrayList<Pet> myList, int val) {
        BufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=1; i<=val; i++ ) {
            Pet s = new Pet();
            System.out.println("Enter pet info "+i+": ");
            System.out.print("Name: ");
            s.setName(reader.readLine());
            System.out.print("Age: ");
            s.setAge(Integer.parseInt(reader.readLine()));

        }
    }
}

    private static void showData() {
    }

    private static void showData() {
    }