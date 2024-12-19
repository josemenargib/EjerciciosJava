import java.util.Random;
import java.util.Scanner;

public class ahorcade {
    public static void main(String[] args) throws Exception {

        
        Scanner juego = new Scanner(System.in);
        String palabraSecreta = "computadora";
        char[] palabraAdivinada = new char[palabraSecreta.length()];

        int intentos = 0;
        int intentosMaximos = 10;
        boolean ganador = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraAdivinada[i] = '_';

        }
        

        // mientras no haya un resultado de ganar se seguirá pídiendo datos:

        while (!ganador && intentos < intentosMaximos) {
            System.out.print(String.valueOf(palabraAdivinada) + "la palabra a adivinar tiene " + palabraSecreta.length()
                + " letras");
            // pediremos que el usuario ingrese letras
            System.out.println("Ingrese una letra");
            char letra = juego.next().charAt(0);
            boolean letraCorrecta=false;
            for(int i=0;i<palabraSecreta.length();i++){
                if (palabraSecreta.charAt(i)==letra) {
                    palabraAdivinada[i]=letra;
                    letraCorrecta=true;
                }
            }


          
            if (!letraCorrecta) {
                intentos++;
                System.out.println("error ,quedan " + (intentosMaximos-intentos)+" intentos" );
            }
            if (String.valueOf(palabraAdivinada).equals(palabraSecreta)) {
                ganador=true;
                System.out.println("usted a ganado");
            }

        }
       if (!ganador) {
        System.out.println("Vuelva a intentarlo");
       }
        juego.close();
        

        //que estacion es ?

        String clima="frio";

      switch (clima) {
        case "caluroso":
            System.out.println("debe ser verano");
            break;

            case "frio":
            System.out.println("debe ser invierno");
            break;

            case "calido y lluvioso":
            System.out.println("debe ser primavera");
            break;

            case "frio lluvioso":
            System.out.println("debe ser otoño");
            break;

            default:
            System.out.println("no se sabe cual estacion es");
                break;
        
      
       
      }

       
      //Juego de piedra papel o tijera
     
      Random aleatorio=new Random();

      int valorUsuario;
      int valorMaquina;
      
      boolean hayGanador=false;
      while (!hayGanador) {
            System.out.println("elija :");
            System.out.println("1 - piedra");
            System.out.println("2 - papel");
            System.out.println("3 - tijera");
           
            valorUsuario=juego.nextInt();
            

            
            valorMaquina=aleatorio.nextInt(3)+1;
        
           
            if (valorMaquina==valorUsuario) {
                System.out.println("empate"  );
            }
            else if (valorMaquina==1 && valorUsuario==2) {
                System.out.println("gana el usuario");
                System.out.println("el usuario elijió: PIEDRA "+" " +  " la máquina eligió: PAPEL"  );
                hayGanador=true;
            }else if (valorMaquina==1 && valorUsuario==3) {
                System.out.println("Gana el usuario");
                System.out.println("el usuario elijió: TIJERA "+ " la máquina eligió: PIEDRA" );
                hayGanador=true;
            }
            else if (valorMaquina==2 && valorUsuario==1) {
                System.out.println("Gana el usuario");
                System.out.println("el usuario elijió: PAPEL"+ " la máquina eligió: PIEDRA" );
                hayGanador=true;
            }
            else if (valorMaquina==2 && valorUsuario==3) {
                System.out.println("Gana el usuario");
                System.out.println("el usuario elijió: PAPEL"+ " la máquina eligió: TIJERA " );
                hayGanador=true;
            }
            else if (valorMaquina==3 && valorUsuario==1) {
                System.out.println("Gana el usuario");
                System.out.println("el usuario elijió: PIEDRA"+ " la máquina eligió: TIJERA");
                hayGanador=true;
            }else if (valorMaquina==3 && valorUsuario==2) {
                System.out.println("Gana el maquina");
                System.out.println("el usuario elijió: PAPEL"+ " la máquina eligió: TIJERA" );
                hayGanador=true;
            }

      }
      juego.close();

      //juego de piedra papel y tijera usando array 
      String[] opciones= new String[]{"piedra","papel","tijera"};
      boolean existeGanador=false;
      while (!existeGanador) {
        System.out.println("Elija entre las siguientes opciones");
        for(int i=0;i<opciones.length;i++){
            System.out.println((i+1)+ " " + opciones[i]);
            
        }


         int selecMaquina=aleatorio.nextInt(3);
      System.out.println("Ingrese una opcion");
      int selecUser=juego.nextInt();
      
      System.out.println("maquina eligio"+opciones[selecMaquina]);
      System.out.println("usuario eligio "+opciones[selecUser-1]);


      if (opciones[selecMaquina]==opciones[selecUser-1]) {
            System.out.println("Existe un empate");
      }else if (selecUser-1 ==0 && selecMaquina==2 || selecUser-1==1 && selecMaquina==0 || selecUser-1==2 && selecMaquina==1) {
                        System.out.println("Gana el usuario !");
                        existeGanador=true;
      }else {
        System.out.println("Gana la máquina");
        existeGanador=true;
      }
      }

    }

     

/*
  Scanner juego=new Scanner(System.in);
          String palabraSecreta = "tortuga";
          char [] letras=new char[palabraSecreta.length()];
          int intentosMaximos=10;
          int intentos=0;
          boolean ganador=false;
          for(int i=0;i<palabraSecreta.length();i++){
          letras[i]='_';
          System.out.print(String.valueOf(letras) + "la palabra secreta contiene: " +
          palabraSecreta.length() + "letras" );
          }
          
          while (!ganador && intentos < intentosMaximos) {
          System.out.println("la palabra a adivinar " + String.valueOf(letras));
          System.out.println("Introduce una letra por favor");
          char letra=juego.next().charAt(0);
          boolean letraCorrecta=false;
          
          
          for(int i=0;i<palabraSecreta.length();i++){
          if (palabraSecreta.charAt(i)==letra) {
          letras[i]=letra;
          letraCorrecta=true;
          }
          }
          
          if (!letraCorrecta) {
          intentos++;
          System.out.println("incorrecto quedan "+ (intentosMaximos-intentos) +
          " intentos");
          }
          
          if (String.valueOf(letras).equals(palabraSecreta)) {
          ganador=true;
          System.out.println("muy bien");
          }
          }
          
          
          
          if (!ganador) {
          System.out.println("se quedo sin intentos");
          }
          
          juego.close();
         

    }
          */
}
 
        
         
