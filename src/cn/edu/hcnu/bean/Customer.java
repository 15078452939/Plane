package cn.edu.hcnu.bean;

import java.util.Date;

public class Customer {
    private String id;
    private String name;
    private String phone;
    private  String cardId;
    private Date birthDate;

    public  String getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
   public String getName(){
        return name;
   }
   public void  setName(){
        this.name=name;
   }
   public String getPhone(){
        return phone;
   }
   public void setPhone(){
        this.phone=phone;
   }
   public String getCardId(){
        return cardId;
   }
   public void setCardId(){
        this.cardId=cardId;
   }
   private Date getBirthDate(){
        return birthDate;
   }
   private void setBirthDate(){
        this.birthDate=birthDate;
   }
}
