package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void code(){
       App.main(null);
       assertEquals(true, App.gimmieHalf(2, 4), "Code Failed");
       assertEquals(true, App.gimmieHalf(11, 22), "Code Failed");
       assertEquals(false, App.gimmieHalf(5, 6), "Code Failed");
   }

   @Test
    public void late() {
        App.main(null);
        assertTrue(DueDate.onTime(2021, 1, 4), "Submitted Late");
    }

}
