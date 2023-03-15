package es.ieslavereda;

import java.io.*;

public class EjerciciosDocumento {
    public static void main(String[] args)  {
        numeroMasAltoMasBajo();
        try(BufferedReader br = new  BufferedReader(new FileReader("src/main/java/es/ieslavereda/Documentos/alumnos_notas.txt"))){
                while (){

                }
        } catch (FileNotFoundException exception) {
            System.out.println("No hay fichero");
        } catch (IOException e) {
            System.out.println("No hay fichero");
        }
    }

    private static void numeroMasAltoMasBajo() {
        int i =0;
        int j = 0;
        boolean primero =true;
        String aux = "";
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/es/ieslavereda/Documentos/numeros.txt"))){
            while ((aux=br.readLine())!=null) {
                if (!primero){
                    j=Integer.parseInt(aux);
                }
                if (Integer.parseInt(aux)>i){
                    i=Integer.parseInt(aux);
                }
                if (Integer.parseInt(aux)<j){
                    j=Integer.parseInt(aux);
                }
                primero = false;

            }

        }catch (FileNotFoundException e  ){
            System.out.println("No hay fichero");
        }catch (IOException e){
            System.out.println("No hay valores");
        }
        System.out.println("Numero mas alto "+i);
        System.out.println("Numero mas bajo "+j);
    }


}
