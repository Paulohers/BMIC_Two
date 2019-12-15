package com.example.bmic_two;

/**
 * Conjunto de valores que se utilizaran en relacion con el imc enviado desde la clase MainActivity.
 * */
enum IMC{
    VERY_SEVERELY_UNDER_WEIGHT, SEVERELY_UNDER_WEIGHT, UNDER_WEIGHT, NORMAL, OVER_wEIGHT, MODERATELY_OBESE, SEVERELY_OBESE, VERY_SEVERELY_OBESE;
}

public class IMCEnum {
    private static  IMC imc;

    public IMCEnum (IMC imc) { this.imc = imc;}

    public  static  String getValue (IMC imc){
        String imcStr = "Sin valor";

        switch (imc){
            case VERY_SEVERELY_UNDER_WEIGHT:
                imcStr = "Muy severamente bajo de peso";
                break;
            case SEVERELY_UNDER_WEIGHT:
                imcStr = "Severamente bajo de peso";
                break;
            case UNDER_WEIGHT:
                imcStr = "Bajo de peso";
                break;
            case NORMAL:
                imcStr = "Peso normal";
                break;
            case OVER_wEIGHT:
                imcStr = "Sobre peso";
                break;
            case MODERATELY_OBESE:
                imcStr = "Moderadamente obeso";
                break;
            case SEVERELY_OBESE:
                imcStr = "Severamente obeso";
                break;
            case VERY_SEVERELY_OBESE:
                imcStr = "Muy severamente obeso";
                break;
        }
        return imcStr;
    }
}
