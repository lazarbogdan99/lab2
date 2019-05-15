public class TVtest
{
    public static void main(String[] args) {
        //this method creates a tv object which is off
        /* TASK 1
        TV object = new TV(43, 99);
        //random actions upon the tv

        System.out.println(object.getChannelNumber());
        System.out.println(object.getVolume());
        object.setIncreasedChannelNumber();
        object.setDecreasedChannelNumber();
        object.setIncreasedVolume();
        object.setDecreasedVolume();

        //this method switches the tv on

        object.setToogle();
  //random actions upon the tv
        System.out.println(object.getChannelNumber());

        object.setIncreasedChannelNumber();
        object.setIncreasedChannelNumber();
        object.setIncreasedChannelNumber();

        System.out.println(object.getChannelNumber());

        object.setDecreasedChannelNumber();

        System.out.println(object.getChannelNumber());

        System.out.println(object.getVolume());
        //the max vol can be 100 and the min is 0

        object.setIncreasedVolume();
        object.setIncreasedVolume();
        object.setIncreasedVolume();

        System.out.println(object.getVolume());

        //creates 3 Tvs

        TV object1=new TV(45,60);
        TV object2=new TV(25,80);
        TV object3=new TV(18,58);

//output the serial number
        System.out.println(object1.getSerialNumber());
        System.out.println(object2.getSerialNumber());
        System.out.println(object3.getSerialNumber());



*/

        //make an array which contains 4 tvs

        TV[] objects = new TV[4];
        TV object1 = new TV(45, 60);
        TV object2 = new TV(25, 80);
        TV object3 = new TV(18, 58);


        //made 3 tvs and then we index them in the array
        objects[1]=object1;
        objects[0]=object2;
        objects[3]=object3;
        objects[2]=object1;

        //loop used to set the channel number for all tvs in the array
        for(int i=0;i<=3;i++)
        {
            objects[i].setChannelNumber(1);
        }

        objects[1].setIncreasedChannelNumber();
        System.out.println(objects[2].getChannelNumber());

    }
}
