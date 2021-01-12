package cn.edu.hcnu.bean;

import cn.edu.hcnu.bean.Customer;

public class Order {
    private String id;
    private float jpjg;  //机票价格
    private float ryfl; //燃油费
    private float hkzhx;  //航空综合险
    private float jptgx;  //机票退改险
    private float yhj;  //优惠券
    private float hszj;  //含税总价
    private Customer customer[];

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJpjg() {
        return jpjg;
    }

    public void setJpjg(float jpjg) {
        this.jpjg = jpjg;
    }

    public float getRyfl() {
        return ryfl;
    }

    public void setRyfl(float ryfl) {
        this.ryfl = ryfl;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhj() {
        return yhj;
    }

    public void setYhj(float yhj) {
        this.yhj = yhj;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }
}
