/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ninja
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> list;
    private int duplicates;
    
    public PersonalDuplicateRemover(){
        this.list=new HashSet<String>();
        this.duplicates=0;
    }
    @Override
    public void add(String characterString) {
        if (this.list.contains(characterString)){
            this.duplicates++;
        }
        else{
            this.list.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.list;
    }

    @Override
    public void empty() {
        this.list.clear();
        this.duplicates=0;
    }
    
}
