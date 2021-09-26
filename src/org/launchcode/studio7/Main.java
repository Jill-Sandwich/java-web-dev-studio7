package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
         CD myCd = new CD();
         DVD myDvd= new DVD("My Really Cool DVD");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();

        myCd.writeData("More CD data to write");
        System.out.println(myCd.readData());

        myDvd.writeData("More DVD data to write");
        System.out.println(myDvd.readData());


        System.out.println(myCd.isFull());
        System.out.println(myDvd.isFull());

        myCd.insert();
        myDvd.insert();
        System.out.println(myCd.isInserted());
        System.out.println(myDvd.isInserted());

    }
}
