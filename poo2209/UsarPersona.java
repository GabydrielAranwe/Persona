
public class UsarPersona{

   public static void main( String [] args ){
   System.out.println("Clase que usa la otra clase Persona");
   Persona per1 = new Persona();
   Persona per2 = new Persona();
   
   System.out.println( per1.getNombre() );
   
   per2.setNombre("Gabriel Bautista Carmona");
   System.out.println( per2.getNombre() );
   System.out.println( "Cuidado hombre radioactivo"); 
  
  }

}