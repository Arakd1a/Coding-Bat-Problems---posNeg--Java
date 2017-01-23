public boolean posNeg(int a, int b, boolean negative) {
boolean posNeg = false;
  if(!negative & (a<0 & b>0) || (a>0&b<0)){
    posNeg = true;
    }
  if(negative & (a<0 & b<0)){
    posNeg = true;
  }
   if(negative & (a>0)){
    posNeg = false;
  }
  return posNeg;
}
