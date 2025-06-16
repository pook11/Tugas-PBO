/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author USER
 */
public class Pimpinan {
    
    String kodepimpinan;
    String namapimpinan;
    int telepon;
    String email;
    String username;
    String password;
    
    public Pimpinan (){
    }
   
    public Pimpinan (String kodepimpinan){
        this.kodepimpinan=kodepimpinan;
    }
    
    public Pimpinan (String kodepimpinan, String namapimpinan){
        this.kodepimpinan=kodepimpinan;
        this.namapimpinan=namapimpinan;
    }
    
    public Pimpinan (String kodepimpinan, String namapimpinan, int telepon){
        this.kodepimpinan=kodepimpinan;
        this.namapimpinan=namapimpinan;
        this.telepon=telepon;
    }
    
    public Pimpinan (String kodepimpinan, String namapimpinan, int telepon, String email){
        this.kodepimpinan=kodepimpinan;
        this.namapimpinan=namapimpinan;
        this.telepon=telepon;
        this.email=email;
    }
    
    public Pimpinan (String kodepimpinan, String namapimpinan, int telepon, String email, String username){
        this.kodepimpinan=kodepimpinan;
        this.namapimpinan=namapimpinan;
        this.telepon=telepon;
        this.email=email;
        this.username=username;
    }
    
    public Pimpinan (String kodepimpinan, String namapimpinan, int telepon, String email, String username, String password){
        this.kodepimpinan=kodepimpinan;
        this.namapimpinan=namapimpinan;
        this.telepon=telepon;
        this.email=email;
        this.username=username;
        this.password=password;
    }
    
    public void setKodePimpinan() {
        this.kodepimpinan=kodepimpinan;
    }
    
    public String getKodePimpinan(){
        return this.kodepimpinan;
    }
    
    public void setNamaPimpinan(){
        this.namapimpinan=namapimpinan;
    }
    
    public String getNamaPimpinan(){
        return this.namapimpinan;
    }
    
    public void setTelepon(){
        this.telepon=telepon;
    }
    
    public int getTelepon(){
        return this.telepon;
    }
    
    public void setEmail(){
        this.email=email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setUsername(){
        this.username=username;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setPassword(){
        this.password=password;
    }
    
    public String getPassword(){
        return this.password;
    }
   
}
