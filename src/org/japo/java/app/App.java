/*
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class App {

//    Constantes a convertir
    public static final char CAR01 = '7';
    public static final char CAR02 = '\100';
    public static final char CAR03 = (char) 88;
    public static final char CAR04 = '\u0062';
    public static final char CAR05 = (char) 126;
    public static final char CAR06 = '\251';
    public static final char CAR07 = 'Ω';
    public static final char CAR08 = (char) 1161;
    public static final char CAR09 = '\u058D';
    public static final char CAR10 = '٨';
    public static final char CAR11 = (char) 8359;
    public static final char CAR12 = '\u20AC';
    public static final char CAR13 = '㉇';
    public static final char CAR14 = (char) 13357;
    public static final char CAR15 = '\uE2C6';

//  Aquí asignaremos las constantes y metodos para mostrar en pantalla
    public final void launchApp() {

        mostrarCabecera();
        mostrarLinea(1, CAR01);
        mostrarLinea(2, CAR02);
        mostrarLinea(3, CAR03);
        mostrarLinea(4, CAR04);
        mostrarLinea(5, CAR05);
        mostrarLinea(6, CAR06);
        mostrarLinea(7, CAR07);
        mostrarLinea(8, CAR08);
        mostrarLinea(9, CAR09);
        mostrarLinea(10, CAR10);
        mostrarLinea(11, CAR11);
        mostrarLinea(12, CAR12);
        mostrarLinea(13, CAR13);
        mostrarLinea(14, CAR14);
        mostrarLinea(15, CAR15);

    }

//  Cabecera del programa
    private void mostrarCabecera() {
        System.out.println(" #     Octal     Decimal     Unicode     Símbolo ");
        System.out.println("===   =======   =========   =========   =========");

    }

//  Formato de texto para mostrar en pantalla en launchApp
    private void mostrarLinea(int numLinea, char dato) {
        System.out.printf("%2d    ", numLinea);
        /* Conversion al valor Octal del caracter (es necesario indicar con 
            al principio y \ al final que tiene que coger el String */

        System.out.printf("%-6s    ", dato > 255 ? "" : String.format(
                "\'\\%03o\'", (int) dato));

//        Conversion al valor decimal del caracter
        System.out.printf("%s ", String.format("(char)%-5d", (int) dato));

//        Conversion a valor Unicode
        System.out.printf("%s    ", String.format("\'\\u%04X\'", (int) dato));

//        Conversion de un dato a Simbolo
        System.out.printf("%-7s", String.format("\'%c\'", dato));
        System.out.println("");
    }
}
