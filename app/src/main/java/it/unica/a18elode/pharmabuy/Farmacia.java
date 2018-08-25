package it.unica.a18elode.pharmabuy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Willy on 22/02/2018.
 */

public class Farmacia {

    private static int idCount = 0;
    private String nome;
    private int id;


    private String via ;
    private String civico; //se non esistente SNC
    private String citta ;
    private ArrayList<Integer> listDisponibili = new ArrayList<>();

    public Farmacia (){
        this.nome ="";
        this.id = idCount++;
        this.via = "Via Ospedale";
        this.civico ="SNC";
        this.citta  = "Cagliari";
        idCount++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getIdCount() {
        return idCount;
    }

    public String getVia() {
        return via;
    }

    public String getCivico() {
        return civico;
    }

    public String getCitta() {
        return citta;
    }

    public static void setIdCount(int idCount) {
        Farmacia.idCount = idCount;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }


    public void addDisponibile(int e){
        this.listDisponibili.add(e);
    }

    public Boolean getDisponibili(int id){
        int i;
        for(i = 0; i <= this.listDisponibili.size(); i++) {
            if (this.listDisponibili.get(i) == id)
                return true;
        }
        return false;
    }
    public ArrayList getDisp2(){
        return listDisponibili;
    }
}