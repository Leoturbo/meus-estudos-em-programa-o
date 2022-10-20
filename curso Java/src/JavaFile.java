import java.io.*;
 
public class JavaFile {
   public static void main(String args[]) {
      File file = new File("C:\\file.txt");
 
      System.out.println( file.getName() ); 
 
      file.setReadOnly();
 
      System.out.println( file.isHidden() );
      System.out.println( file.canRead() );
      System.out.println( file.canWrite() );
 
      file.renameTo( new File("C:\\Ficheiro.txt") ); 
 
      try {
         if( !file.exists() ) {
            file.createNewFile();
         }
      }
      catch(Exception e){
         System.out.println(e.getMessage());
      }
 
      if( file.isDirectory() ) {
         System.out.println("Directoria");
      }
      else if( file.isFile() ){
         System.out.println("Ficheiro");
      }
 
      File [] roots = file.listRoots( );
 
      for (int i = 0; i < roots.length; i++) {
         System.out.println (roots[i] );
      }
 
      file.delete();
   }
}