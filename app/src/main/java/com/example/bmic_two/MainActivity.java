package com.example.bmic_two;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText txt_Peso,txt_Estatura,txt_Edad;
    Spinner sexo;
    Button calcular;
    IMC categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inicializar();
        btnCalcularIMC();
    }
    /**
     * Metodo en el cual se inicializan varios componentes para capturar datos, y guardar sus valores dentro de variables.
     * */
    public void Inicializar(){
        /**
         * @param txt_peso variable que recibe el componente txt_Peso que se encuentra en la interfaz, y los relaciona.
         * @param txt_Estatura variable que recibe el componente txt_Estatura que se encuentra en la interfaz, y los relaciona.
         * @param txt_Edad variable que recibe el componente txt_Edad que se encuentra en la interfaz, y los relaciona.
         * @param sexo variable que recibe el componente sexo que se encuentra en la interfaz, y los relaciona.
         * @param calcular variable que recibe el componente calcular que se encuentra en la interfaz, y los relaciona.
         * */
        txt_Peso = findViewById(R.id.txt_Peso);
        txt_Estatura = findViewById(R.id.txt_Estatura);
        txt_Edad = findViewById(R.id.txt_Edad);
        sexo = findViewById(R.id.Sp_Sexo);
        calcular = findViewById(R.id.btn_calcular);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);
        sexo.setAdapter(adapter);
    }

    /**
     * Metodo para calcular IMC
     */
    private  String getBMICategoria(Double imc){
        String sp1 = sexo.getSelectedItem().toString();
        String tntEdad = txt_Edad.getText().toString();
        int Edad = Integer.parseInt(tntEdad);
        if (sp1.equals("Hombre")){
            if (Edad >= 1 && Edad < 5){
                if (imc < 5.7){
                    categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.0){
                    categoria = IMC.SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.2){
                    categoria = IMC.UNDER_WEIGHT;
                }else if (imc < 7.0 ){
                    categoria = IMC.NORMAL;
                }else if (imc < 7.8 ){
                    categoria = IMC.OVER_wEIGHT;
                }else if (imc < 8.7 ){
                    categoria = IMC.MODERATELY_OBESE;
                }else if (imc < 8.9 ) {
                    categoria = IMC.SEVERELY_OBESE;
                }else {
                    categoria = IMC.VERY_SEVERELY_OBESE;
                }

            }else if (Edad >= 5 && Edad <= 11){
                if (imc < 5.7){
                    categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.0){
                    categoria = IMC.SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.2){
                    categoria = IMC.UNDER_WEIGHT;
                }else if (imc < 7.0 ){
                    categoria = IMC.NORMAL;
                }else if (imc < 7.8 ){
                    categoria = IMC.OVER_wEIGHT;
                }else if (imc < 8.7 ){
                    categoria = IMC.MODERATELY_OBESE;
                }else if (imc < 8.9 ) {
                    categoria = IMC.SEVERELY_OBESE;
                }else {
                    categoria = IMC.VERY_SEVERELY_OBESE;
                }
            }else if (Edad >= 12 && Edad <= 19){
                if (imc < 5.7){
                    categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.0){
                    categoria = IMC.SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.2){
                    categoria = IMC.UNDER_WEIGHT;
                }else if (imc < 7.0 ){
                    categoria = IMC.NORMAL;
                }else if (imc < 7.8 ){
                    categoria = IMC.OVER_wEIGHT;
                }else if (imc < 8.7 ){
                    categoria = IMC.MODERATELY_OBESE;
                }else if (imc < 8.9 ) {
                    categoria = IMC.SEVERELY_OBESE;
                }else {
                    categoria = IMC.VERY_SEVERELY_OBESE;
                }
            }else if (Edad >= 20 && Edad <= 59){
                if (imc < 5.7){
                    categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.0){
                    categoria = IMC.SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.2){
                    categoria = IMC.UNDER_WEIGHT;
                }else if (imc < 7.0 ){
                    categoria = IMC.NORMAL;
                }else if (imc < 7.8 ){
                    categoria = IMC.OVER_wEIGHT;
                }else if (imc < 8.7 ){
                    categoria = IMC.MODERATELY_OBESE;
                }else if (imc < 8.9 ) {
                    categoria = IMC.SEVERELY_OBESE;
                }else {
                    categoria = IMC.VERY_SEVERELY_OBESE;
                }
            }else if (Edad >= 60 && Edad >= 70){
                if (imc < 5.7){
                    categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.0){
                    categoria = IMC.SEVERELY_UNDER_WEIGHT;
                }else if (imc < 6.2){
                    categoria = IMC.UNDER_WEIGHT;
                }else if (imc < 7.0 ){
                    categoria = IMC.NORMAL;
                }else if (imc < 7.8 ){
                    categoria = IMC.OVER_wEIGHT;
                }else if (imc < 8.7 ){
                    categoria = IMC.MODERATELY_OBESE;
                }else if (imc < 8.9 ) {
                    categoria = IMC.SEVERELY_OBESE;
                }else {
                    categoria = IMC.VERY_SEVERELY_OBESE;
                }
            }


        }else {
            if (Edad >= 1 && Edad < 5){

            }else if (Edad >= 5 && Edad <= 11){

            }else if (Edad >= 12 && Edad <= 19){

            }else if (Edad >= 20 && Edad <= 59){

            }else if (Edad >= 60 && Edad >= 70){

            }

        }

        return  IMCEnum.getValue(categoria);
    }
    /**
     * Metodo para calcular el indice de masa corporal,
     * recibe un parametro de altura, y peso, con ellos se realizara un operacion mediante una formula para devolver el imc de la persona.
     * @param pesoDbl parametro en el que se almacenara el peso.
     * @param estaturaDbl parametro en el que se almacenara la estatura.
     * */
    private Double calcularIMC(Double pesoDbl, Double estaturaDbl){
        Double imc = pesoDbl / (estaturaDbl * estaturaDbl);
        return imc;
    }

    public void btnCalcularIMC(){
        Button btnCalcularIMCResult = findViewById(R.id.btn_calcular);
        btnCalcularIMCResult.setOnClickListener(new BtnCalcularIhMCEscuchador());
    }

    class  BtnCalcularIhMCEscuchador implements View.OnClickListener {

         /**
          * Metodo que espera a que el boton sea presionado, en este metodo se encuentran metodos externos
          * , seran ejecutados cuando se llame a llamar este metodo "OnClick", realizara el calculo IMC y obtendra la categoria.
          * Almacenara los valores para mandarlos a la segunda pantalla, mediante el objeto intent de tipo Intent.
          * */
        @Override
        public void onClick(View v) {
            /**
             * @param estaturaStr variable que recibe el valor de text view relacionado con la estatura de la persona.
             * @param pesoStr variable que recibe el valor de text view relacionado con el peso de la persona.
             * @param estaturaDbl variable que convierte el valor de estaturaStr a double.
             * @param pesoDbl variable que convierte el valor de pesoStr a double.
             * @param imc variable que almacena el valor que devuelve el metodo calcularIMC.
             * */
            String estaturaStr = txt_Estatura.getText().toString();
            String pesoStr = txt_Peso.getText().toString();
            Double estaturaDbl = Double.parseDouble(estaturaStr);
            Double pesoDbl = Double.parseDouble(pesoStr);
            Double imc = calcularIMC(pesoDbl, estaturaDbl);

            String categoria = (getBMICategoria(imc));
            String resultado = (Double.toString(imc));

            Intent intent = new Intent(MainActivity.this,Pantalla2.class);
            intent.putExtra("Resultado",resultado);
            intent.putExtra("Categoria",categoria);
            startActivity(intent);
        }
    }
}

