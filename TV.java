public class TV
{
    //this holds the channel number
    private int channelNumber;

    //this holds the volumume
    private int volume;
    private boolean toogle=true; // this helps to determine if the tv is on or off
    private static int serialNumber=0; //holds the serial number of the tv
    private int localSerialNumber;//this is a coppy used to hold the serial number for each tv

    //this is a constructor
    public TV(int chNr,int vol)
    {
        setChannelNumber(chNr);
        setVolume(vol);
        setSerialNumber();
    }

    //this method sets the gannel number
    public void setChannelNumber(int chNr)
    {
        this.channelNumber=chNr;
    }

    //this method sets the volumue
    private void setVolume(int vol)
    {
        this.volume=vol;
    }

    //this method sets the serial number
    private void setSerialNumber()
    {
        serialNumber=serialNumber+1;
        this.localSerialNumber=serialNumber;
    }

    //this method decides if the tv is on or off
    public void setToogle()
    {
        if(this.toogle==true)
        {
            this.toogle=false;
        }
        else
        {
            this.toogle=true;
        }
    }

    //this method sets a new channel when the user increases it
    public void setIncreasedChannelNumber()
    {
        if(this.toogle==true)
        {
            this.channelNumber=this.channelNumber+1;
        }
        else
        {
            System.out.println("The TV is off. The channel number cannot be increased.");
        }
    }
    //this method sets a new channel when the user is deacrasing it only if the tv is on
    public void setDecreasedChannelNumber()
    {
        if(this.toogle==true)
        {
            this.channelNumber=this.channelNumber-1;
        }
        else
        {
            System.out.println("The TV is off. The channel number cannot be decreased.");
        }
    }

    //this method sets a new volume when the user is incrasing it only if the tv is on
    public void setIncreasedVolume()
    {
        if(this.toogle==true)
        {
            if(this.volume+5>100)
            {
                this.volume=100;
            }
            else
            {
                this.volume=this.volume+5;
            }
        }
        else
        {
            System.out.println("The TV is off. The volume cannot be increased.");
        }
    }

    //this method sets a new volume when the user is decraseing the vol only if the tv is on
    public void setDecreasedVolume()
    {
        if(this.toogle)
        {
            if(this.volume-5<0)
            {
                this.volume=0;
            }
            else
            {
                this.volume=this.volume-5;
            }
        }
        else
        {
            System.out.println("The TV is off. The volume cannot be decreased.");
        }
    }

    //this method gets the serial number and returs a message
    public String getSerialNumber()
    {
        return ("The serial number of this TV is "+this.localSerialNumber);
    }

    // this method gets the channel number and returs a message
    public String getChannelNumber()
    {
        if(this.toogle)
        {
            return ("The channel number of the TV is "+this.channelNumber);
        }
        else
        {
            return ("The TV is off. The channel number cannot be shown.");
        }
    }
 // this method gets the volume and returs a message
    public String getVolume()
    {
        if(this.toogle)
        {
            return ("The volume of the TV is "+this.volume);
        }
        else
        {
            return ("The TV is off. The volume cannot be shown.");
        }
    }
}
