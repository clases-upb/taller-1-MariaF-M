/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
        try {
            System.out.println(Convertir_km_seg(40));
            System.out.println(Convertir_cm_lt((double)3500));
            System.out.println(Convertir_us_cops((long)45623));
            System.out.println(Convertir_cent_far((double)0));
            System.out.println(Calcular_segs((byte)1, (byte)1, (byte)1, (byte)1));
            System.out.println(Calcular_peso_carga((float)47.5, (float)7.5));
            System.out.println(Calcular_horasxviaje("Armenia", (short)285, (short)72));
            System.out.println(Calcular_combustible(638, 312, 1243, 220));
            System.out.println(Calcular_peso_luna((byte)80));
        } 
        catch (Exception e) {
            // TODO: handle exception
        }
    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */

    public static String Convertir_km_seg (int vel_km_seg){
        try {
            double vel_m_hora = 0, vel_m_seg = 0;
            short convertir_km_m = 1000; 
            short convertir_seg_hora = 3600; 
            vel_m_seg = vel_km_seg * convertir_km_m;
            vel_m_hora = vel_km_seg * convertir_km_m * convertir_seg_hora;
            return (vel_m_seg + " m/s - " + vel_m_hora + " m/h"); 
        } 
        catch (Exception e) {
            return "Error en la conversión";
        }  
    }

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */

    public static float Convertir_cm_lt (double cant_cc){
        try {
            float cant_lt = 0;
            short convertir_cm_lt = 1000; 
            cant_lt = (float) cant_cc / convertir_cm_lt;
            return cant_lt; 
        } 
        catch (Exception e) {
            return 0;
        }  
    }
  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */

   public static long Convertir_us_cops (long cant_dolares){
        try {
            long cant_pesos = 0;
            short TRM = 4170; 
            cant_pesos = cant_dolares * TRM;
            return cant_pesos; 
        } 
        catch (Exception e) {
            return -1;
        }  
    }

   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */

   public static double Convertir_cent_far (double temperatura_gc){
        try {
            double temperatura_gf = 0;
            double formula1 = 1.8;
            byte formula2 = 32;
            temperatura_gf = (formula1 * temperatura_gc) + formula2;
            return temperatura_gf; 
        } 
        catch (Exception e) {
            return 0;
        }  
    }

   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */

   public static int Calcular_segs (short dias, short horas, short minutos, short segundos){
        try {
            int total_segundos = 0, dia_seg = 86400;
            short hora_seg = 3600; 
            byte min_seg = 60;
            total_segundos = (dias * dia_seg) + (horas * hora_seg) + (minutos * min_seg) + (segundos);
            return total_segundos; 
        } 
        catch (Exception e) {
            return -1;
        }  
    }

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

   public static String Calcular_peso_carga (float pesoT_camion_lleno, float pesoT_camion_vacio){
        try {
            double peso_neto = 0;
            int tone_kil = 1000;
            peso_neto = pesoT_camion_lleno - pesoT_camion_vacio;
            return (peso_neto * tone_kil + " kilos - " + peso_neto + " toneladas"); 
        } 
        catch (Exception e) {
            return "Error en la función Calcular_peso_carga";
        }  
    }
    
   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */

   public static float Calcular_horasxviaje (String destino, short distancia, short velocidad_promedio){
        try {
            float horas_viaje = 0;
            horas_viaje = distancia / velocidad_promedio;
            return horas_viaje; 
        } 
        catch (Exception e) {
            return -1;
        }  
    }
    
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

   public static float Calcular_combustible (int r1, int r2, int r3, int r4){
        try {
            float cant_combustible = 0;
            double T_despegue = 1.2 * 4, T_aterrizaje = 0.4 * 4, T_recorrido = 0.2, recorrido_minimo = 60.8;
            cant_combustible = (float)(((r1 * T_recorrido)/recorrido_minimo) + ((r2 * T_recorrido)/recorrido_minimo) + ((r3 * T_recorrido)/recorrido_minimo) + ((r4 * T_recorrido)/recorrido_minimo) + T_despegue + T_aterrizaje);
            return cant_combustible; 
        } 
        catch (Exception e) {
            return -1;
        }  
    }

   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
   
   public static double Calcular_peso_luna (byte p_tierra_kil){
        try {
            double p_luna_new = 0, p_tierra_new = 0;
            float gravedad = 9.81f, kg_tierra_luna = 0.165f;
            p_tierra_new = (double) (p_tierra_kil * gravedad);
            p_luna_new = (double) (p_tierra_new * kg_tierra_luna);
            return p_luna_new; 
        } 
        catch (Exception e) {
            return 0;
        }  
    }
}
