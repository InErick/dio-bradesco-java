package HerancaPolimorfismo.Exercicios.Ex03;

public non-sealed class USClock extends Clock{

    private String periodeIndicator;

    public String getPeriodeIndicator() {
        return periodeIndicator;
    }

    public void setAfterMidDay(){
        this.periodeIndicator = "PM";
    }

    public void setBeforeMidday(){
        this.periodeIndicator = "AM";
    }

    public void setHour(int hour) {
        setBeforeMidday();
        if((hour > 12) && (hour <= 23)){
           setAfterMidDay();
           this.hour = hour - 12;
        }else if(hour >= 24){
           this.hour = 0;
       }else{
            this.hour = hour;
        }
    }

    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch(clock){
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodeIndicator = usClock.getPeriodeIndicator();
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime()+ " " + this.periodeIndicator;
    }
}
