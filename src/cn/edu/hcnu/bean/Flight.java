package cn.edu.hcnu.bean;

public class Flight {
    private String id;
    private String departure;  //乘客出发地
    private String destinaction;  //乘客到达地
    private String planetype;
    private String departuretime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestinaction() {
        return destinaction;
    }

    public void setDestinaction(String destinaction) {
        this.destinaction = destinaction;
    }

    public String getPlanetype() {
        return planetype;
    }

    public void setPlanetype(String planetype) {
        this.planetype = planetype;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }
}

