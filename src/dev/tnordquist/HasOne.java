package dev.tnordquist;

/**
 * CodingBat: Given a positive int n, return true if it contains a 1 digit.
 */

public class HasOne {

  public boolean hasOne(int n) {

    while(n>0){
      if(n%10==1){
        return true;
      } else {
        n = n/10;
      }
    }
    return false;
  }

}
