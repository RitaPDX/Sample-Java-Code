import java.util.ArrayList;

/**
 * Created by ritapdx on 5/21/17.
 */

class clsCalcPrimes
  {
  
  private static final clsCatHelp dlgHlp = new clsCatHelp();
  private static final clsPrimeRslts dlgPrmRslt = new clsPrimeRslts();


  // create an array list
  public static final ArrayList<String>lstRslts;

  static
    {
    lstRslts = new ArrayList<>();
    }

  public clsCalcPrimes()
    {
    lstRslts.clear();
    dlgPrmRslt.txtPrmRslt.setText("");
    }

  private static void DoTally(String strIn)
    {
    clsCalcPrimes.lstRslts.add(strIn);
    }


  public static void DoDuetsCalc(int intCount, int intCat)
    {
    int i;
    int p;
    int b = 0;
    int Count = 0;
    String strTwin = "Twin";
    String strCous = "Cousin";
    String strSexy = "Sexy";
    String strCat = "";
  
  
    for (i = 0, p = 2; i < intCount; p++)
      {
      if (intCat == dlgHlp.intCatTwin)
        {
        b = p + 2;
        strCat = strTwin;
        }
      else if (intCat == dlgHlp.intCatCous)
        {
        b = p + 4;
        strCat = strCous;
        }
      else if (intCat == dlgHlp.intCatSexy)
        {
        b = p + 6;
        strCat = strSexy;
        }
      if (clsMath.isPrime(p) && clsMath.isPrime(b))
        {
        System.out.println("(" + p + ", " + b + ")");
        String strA = String.valueOf(p);
        String strB = String.valueOf(b);
        if ((i < intCount) && (i != intCount - 1))
          {
          DoTally("(" + strA + ",  " + strB + "),  ");
          dlgPrmRslt.txtPrmRslt.append(lstRslts.get(i));
          }
        else if (i == intCount - 1)
          {
          DoTally("(" + strA + ",  " + strB + ")");
          dlgPrmRslt.txtPrmRslt.append(String.format("%s\n\n", lstRslts.get(i)));
          clsCalcPrimes.lstRslts.add("\n\n");
          }
        Count++;
        i++;
        }
      }
    String strCnt = String.valueOf(Count);
  
    dlgPrmRslt.txtPrmRslt.append(String.format("\n\nTotal number of %s Primes: %d\n", strCat, Count));
    dlgPrmRslt.OpenDlg();
    System.out.printf("Total number of %s Primes: %d%n", strCat, Count);
    }


  public static void DoTripletCalc(int intCount)
    {
    int i, p, b, c, d;
    int Count = 0;
    for (i = 1, p = 2; i <= intCount; p++)
      {
      b = p + 2;
      c = p + 4;
      d = p + 6;
      if (clsMath.isPrime(p) && clsMath.isPrime(b) && clsMath.isPrime(d))
        {
        Count++;
        System.out.println("(" + p + ", " + b + ", " + d + ")");
        i++;
        }
      else if (clsMath.isPrime(p) && clsMath.isPrime(c) && clsMath.isPrime(d))
        {
        Count++;
        System.out.println("(" + p + ", " + c + ", " + d + ")");
        i++;
        }
      }
    System.out.println("Total number of Triplet Primes: " + Count);
    }
  
  
  public static void DoQuadrupletCalc(int intCount)
    {
    int i, p, b, c, d, e;
    int Count = 0;
    for (i = 1, p = 2; i <= intCount; p++)
      {
      b = p + 2;
      c = p + 4;
      d = p + 6;
      e = p + 8;
      if (clsMath.isPrime(p) && clsMath.isPrime(b) && clsMath.isPrime(d) && clsMath.isPrime(e))
        {
        Count++;
        System.out.println("(" + p + ", " + b + ", " + d + ", " + e + ")");
        i++;
        }
      else if (clsMath.isPrime(p) && clsMath.isPrime(c) && clsMath.isPrime(d) && clsMath.isPrime(e))
        {
        Count++;
        System.out.println("(" + p + ", " + c + ", " + d + ", " + e + ")");
        i++;
        }
        
      }
    System.out.println("Total number of Quadruplet Primes: " + Count);
    }
  
  
  public static void DoQuintupletCalc(int intCount)
    {
    int i, p, b, c, d, e, f;
    int Count = 0;
    for (i = 1, p = 2; i <= intCount; p++)
      {
      b = p + 2;
      c = p + 6;
      d = p + 8;
      e = p + 12;
      f = p - 4;
      if (clsMath.isPrime(p) && clsMath.isPrime(b) && clsMath.isPrime(c) && clsMath.isPrime(d) && clsMath.isPrime(e))
        {
        Count++;
        System.out.println("(" + p + ", " + b + ", " + c + ", " + d + ", " + e + ")");
        i++;
        }
      else if (clsMath.isPrime(f) && clsMath.isPrime(p) && clsMath.isPrime(b) && clsMath.isPrime(c) && clsMath.isPrime(d))
        {
        Count++;
        System.out.println("(" + f + ", " + p + ", " + b + ", " + c + ", " + d + ")");
        i++;
        }
        
      }
    System.out.println("Total number of Quintuplet Primes: " + Count);
    }
  
  public static void DoSextupletCalc(int intCount)
    {
    int i, p, b, c, d, e, f;
    int Count = 0;
    for (i = 1, p = 6; i <= intCount; p++)
      {
      b = p + 2;
      c = p + 6;
      d = p + 8;
      e = p + 12;
      f = p - 4;
      if (clsMath.isPrime(f) && clsMath.isPrime(p) && clsMath.isPrime(b) &&
        clsMath.isPrime(c) && clsMath.isPrime(d) && clsMath.isPrime(e))
        {
        System.out.println("(" + f + ", " + p + ", " + b + ", " + c + ", " + d + ", " + e + ")");
        Count++;
        i++;
        }
        
      }
    System.out.println("Total number of Sextuplet Primes: " + Count);
    }

  
  public static void DoSophieCalc(int intCount)
    {
    int i, p, b;
    int Count = 0;
    for (i = 1, p = 2; i <= intCount; p++)
      {
      b = (2 * p) + 1;
      if (clsMath.isPrime(p) && clsMath.isPrime(b))
        {
        Count++;
        System.out.println("(" + p + ", " + b + ")");
        i++;
        }
      }
    System.out.println("Total number of Sophie Germain Primes: " + Count);
    }
  
  
  public static void DoCunninghamCalc(int intCount)
    {
    int i, p, b, c;
    int Count = 0;
    for (i = 1, p = 2; i <= intCount; p++)
      {
      b = (2 * p) + 1;
      c = (2 * p) - 1;
      if (clsMath.isPrime(p) && clsMath.isPrime(b))
        {
        Count++;
        System.out.println("(" + p + ", " + b + ")");
        i++;
        }
      if (clsMath.isPrime(p) && clsMath.isPrime(c))
        {
        Count++;
        System.out.println("(" + p + ", " + c + ")");
        i++;
        }
      }
    System.out.println("Total number of Cunningham Chain Primes: " + Count);
    }
  
  public static void DoSafeCalc(int intCount)
    {
    int i, p, b;
    int Count = 0;
    for (i = 1, p = 5; i <= intCount; p++)
      {
      b = (p - 1) / 2;
      if (clsMath.isPrime(p) && clsMath.isPrime(b))
        {
        Count++;
        System.out.println("(" + p + ", " + b + ")");
        i++;
        }
      }
    System.out.println("Total number of Safe Primes: " + Count);
    }
  
  
  public static void intFindPrevOrNext(int intCount)
    {
    
    int intCnt = intCount;
    int i = 0;
    int j = 0;
    int k;
    int p;
    int intPrev;
    int intNext;
    
    for (k = 2; i < intCnt; k++)
      {
      p = k;
      if (clsMath.isPrime(p))
        {
        // Find Next Prime
        intNext = GetNext(p);
        if (!clsMath.isPrime(intNext))
          {
          continue;
          }
        //  Find Previous Prime
        intPrev = GetPrev(p);
        if (!clsMath.isPrime(intPrev))
          {
          continue;
          }
        if (intNext - p != p - intPrev)
          {
          continue;
          }
        System.out.println("(" + intPrev + ", " + p + ", " + intNext + ")");
        i++;
        }
      }   //  END  for(k = 0, intPrev = 0, intNext = 0
    System.out.println("Total number of Balanced Primes: " + i);
    }     //  END  intFindPrevOrNext
  
  
  private static int GetNext(int intIn)
    {
    int p = intIn;       // intIn is already identified as a Prime
    int j;
    
    for (j = p + 1; ; j++)
      {
      if (!clsMath.isPrime(j))
        {
        continue;
        }
      return j;
      }
    }
  
  
  private static int GetPrev(int intIn)
    {
    int p = intIn;       // intIn is already identified as a Prime
    int j;
    //int i;
    
    for (j = p - 1; ; j--)
      {
      if (!clsMath.isPrime(j))
        {
        continue;
        }
      return j;
      }
    }
  
  public static void GetReqPrimes(int intCnt)
    {
    int i;
    int p;
    
    for (i = 1, p = 2; i <= intCnt; p++)
      {
      if (clsMath.isPrime(p))
        {
        System.out.println(p);
        i++;
        }
      }
    System.out.printf("Total number of Primes: %d%n", i - 1);
    }
  }

  
