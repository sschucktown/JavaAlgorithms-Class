/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dna;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scott
 */
public class DNAJUnitTest {
    
    public DNAJUnitTest() {
    }

    
    @Test
    public void testInsert()
    {
        DNA dna = new DNA();
        int index = 0;
        String basePair = "ta";
        
        dna.insert(index, basePair);
        
    }
}
