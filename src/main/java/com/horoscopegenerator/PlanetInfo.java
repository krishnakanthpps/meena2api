package com.horoscopegenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class PlanetInfo {

    public int index = 0;

    private Planet planet;
     

    public double longitude;

    public double fullLongitude;

    private Star planetStar;

    public boolean isRetrograde;

    @JsonBackReference
    private House house;

    private boolean hasDikbala;

    private int pada;

    private boolean inYkStar;

    private String udStatus;

    private String gunas;

    private Planet jeeva;

    private Planet sareera;

    private Planet kalamsaLord;

    private Planet kalamsaJeevaPlanet;
    private Planet kalamsaSareeraPlanet;

    private String kalamsaThreeFoldGuna;

    private String jeevaExplanation;
    private String sareeraExplanation;

    public Planet getKalamsaJeevaPlanet() {
        return kalamsaJeevaPlanet;
    }

    public void setKalamsaJeevaPlanet(Planet kalamsaJeevaPlanet) {
        this.kalamsaJeevaPlanet = kalamsaJeevaPlanet;
    }

    public Planet getKalamsaSareeraPlanet() {
        return kalamsaSareeraPlanet;
    }

    public void setKalamsaSareeraPlanet(Planet kalamsaSareeraPlanet) {
        this.kalamsaSareeraPlanet = kalamsaSareeraPlanet;
    }

    public String getKalamsaThreeFoldGuna() {
        return kalamsaThreeFoldGuna;
    }

    public void setKalamsaThreeFoldGuna(String kalamsaThreeFoldGuna) {
        this.kalamsaThreeFoldGuna = kalamsaThreeFoldGuna;
    }

    public double getFullLongitude() {
        return fullLongitude;
    }

    public void setFullLongitude(double fullLongitude) {
        this.fullLongitude = fullLongitude;
    }

    public String getJeevaExplanation() {
        return jeevaExplanation;
    }

    public void setJeevaExplanation(String jeevaExplanation) {
        this.jeevaExplanation = jeevaExplanation;
    }

    public String getSareeraExplanation() {
        return sareeraExplanation;
    }

    public void setSareeraExplanation(String sareeraExplanation) {
        this.sareeraExplanation = sareeraExplanation;
    }

    public Planet getKalamsaLord() {
        return kalamsaLord;
    }


    public void setKalamsaLord(Planet kalamsaLord) {
        this.kalamsaLord = kalamsaLord;
    }


    public Planet getJeeva() {
        return jeeva;
    }


    public void setJeeva(Planet jeeva) {
        this.jeeva = jeeva;
    }


    public Planet getSareera() {
        return sareera;
    }


    public void setSareera(Planet sareera) {
        this.sareera = sareera;
    }


    public PlanetInfo() {

    }


    public String getGunas() {
        return gunas;
    }


    public void setGunas(String gunas) {
        this.gunas = gunas;
    }


    public String getUdStatus() {
        return udStatus;
    }


    public void setUdStatus(String udStatus) {
        this.udStatus = udStatus;
    }


    public boolean isInYkStar() {
        return inYkStar;
    }


    public void setInYkStar(boolean inYkStar) {
        this.inYkStar = inYkStar;
    }


    public int getPada() {
        return pada;
    }


    public void setPada(int pada) {
        this.pada = pada;
    }


    public boolean isHasDikbala() {
        return hasDikbala;
    }


    public void setHasDikbala(boolean hasDikbala) {
        this.hasDikbala = hasDikbala;
    }


    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public PlanetInfo(Planet planet, double longitude) {
        this.planet = planet;
        this.longitude = longitude;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isRetrograde() {
        return isRetrograde;
    }

    public void setRetrograde(boolean isRetrograde) {
        this.isRetrograde = isRetrograde;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }


    public double getLongitude() {
        return longitude;
    }


    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public Star getPlanetStar() {
        return planetStar;
    }

    public void setPlanetStar(Star planetStar) {
        this.planetStar = planetStar;
    }

    @Override
    public String toString() {
        return "PlanetInfo [index=" + index + ", planet=" + planet
                + ", longitude=" + longitude + ", planetStar=" + planetStar
                + ", isRetrograde=" + isRetrograde + "]";
    }

}
