package com.manchesterdigitalchallenges.convertunits;

public class Convert {

    private Integer rawUserInput;
    private Integer megabyteUnits;
    private Integer kilobyteUnits;
    private StringBuilder result = new StringBuilder();


    public void setKilobyteToConvert(Integer kilobyteToConvert) {
        this.rawUserInput = kilobyteToConvert;
    }


     // Convert kilobytes to megabytes Method

    public String convertFromKilobyteToMegabyte(Integer kilobyteToConvert){

        if(kilobyteToConvert <= 1024 ) return kilobyteToConvert.toString().concat("KB");

        kilobyteUnits = Math.round((kilobyteToConvert % 1024));
        megabyteUnits = Math.round(((kilobyteToConvert - kilobyteUnits) / 1024));


        result.append(megabyteUnits).append("MB ")
                .append(kilobyteUnits).append("KB ");

        return result.toString();

    } // method end

   /* public Convert(Integer kilobyteToConvert) {this.kilobyteToConvert = kilobyteToConvert;}
    public Integer getKilobyteToConvert() {return kilobyteToConvert;}*/
}
