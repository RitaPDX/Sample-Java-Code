/**
 * Created by ritapdx on 5/16/17.
 */


class clsMath
  {

  private final clsPrimeRslts dlgPrmRslt = new clsPrimeRslts();
  private final clsCalcPrimes clcPrm = new clsCalcPrimes();

  public clsMath()
    {
    }
  
    public static boolean isPrime(int number)
    {
    if (number > 1)
      {
      for (int i = 2; i <= number / 2; i++)
        {
        if (number % i == 0)
          {
          return false;
          }
        }
      //System.out.println("This is a Prime Number - " + number);
      return true;
      }
    else
      return false;
    }

  public static void doCalc(int intCnt, int intCat)
    {
    clsCatHelp dlgHlp = new clsCatHelp();
    if (intCat == dlgHlp.intCatTwin)
      {
      clsCalcPrimes.DoDuetsCalc(intCnt, intCat);
      }
    
    else if (intCat == dlgHlp.intCatTrip)
      {
      clsCalcPrimes.DoTripletCalc(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatQuad)
      {
      clsCalcPrimes.DoQuadrupletCalc(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatQuin)
      {
      clsCalcPrimes.DoQuintupletCalc(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatSext)
      {
      clsCalcPrimes.DoSextupletCalc(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatCous)
      {
      clsCalcPrimes.DoDuetsCalc(intCnt, intCat);
      }
    
    else if (intCat == dlgHlp.intCatSexy) //clsCalcPrimes.
      {
      clsCalcPrimes.DoDuetsCalc(intCnt, intCat);
      }
    
    else if (intCat == dlgHlp.intCatSoph)
      {
      clsCalcPrimes.DoSophieCalc(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatCunn) //clsCalcPrimes.
      {
      clsCalcPrimes.DoCunninghamCalc(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatSafe) //clsCalcPrimes.
      {
      clsCalcPrimes.DoSafeCalc(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatBaln) //clsCalcPrimes.
      {
      clsCalcPrimes.intFindPrevOrNext(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatRglr) //clsCalcPrimes.
      {
      clsCalcPrimes.GetReqPrimes(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatBitw) //clsCalcPrimes.
      {
      //clsCalcPrimes.
      }
    
    else if (intCat == dlgHlp.intCatArpr) //clsCalcPrimes.
      {
      //clsCalcPrimes.
      }
    else
      {
      //  Big Fookin' ERROR;
      }
    }
  }

