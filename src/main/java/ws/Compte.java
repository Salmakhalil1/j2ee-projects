package ws;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement(name = "Compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;

    public Compte(int code, double solde){
        this.code = code;
        this.solde = solde;

    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    //public Date getDateCreation() {
       // return dateCreation;
   // }

    //public void setDateCreation(Date dateCreation) {
    //  this.dateCreation = dateCreation;
    //}
}
